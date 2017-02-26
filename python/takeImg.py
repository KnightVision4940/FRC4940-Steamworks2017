#takes an image and puts it to the /img directory.

import os
import time
import sys
import cv2
import numpy
from grip import GripPipeline

#cmd arguemnts
#
# -e --> reduces exposure to minimum first (should only be done once at setup)
# -b --> takes 20 pictures with 100 frame delay between each
args = str(sys.argv)
print(args)
argList = args.split(" ")
print(argList)
#cam parameters
numOfPics = 1
delay = "5"
willBeProcessed = False
gp = GripPipeline()

for p in sys.argv:
	pS = str(p)
	if (pS == "-e"): #sets exposure to -100
	    os.system("v4l2-ctl -d /dev/video0 -c exposure_auto=1 -c exposure_absolute=0")
		print("Setting exposure setting to 5 . . . ")

	if (pS == "-b"):
		numOfPics = 20
		delay = "5"
		print("Now bursting photos!")
	if (pS == "-g"):
		willBeProcessed = True

currTime = str(int(time.time()))
for i in range(numOfPics):
	imgName = "img" + currTime + "_" + str(i) + ".jpg"
	os.system("fswebcam --no-banner -S " + delay + " --save ~/img/" + imgName )
	print("recharging my camera!")
	print("+================================")
	if (willBeProcessed == True):
		img = cv2.imread("/home/pi/img/" + imgName, cv2.IMREAD_COLOR)
		if (type(img) is numpy.ndarray):
			print("Processing . . . ")
			gp.process(img)
		else:
			print("ERROR: cv2 img is empty! || " + imgName)
	time.sleep(1)

print("Done!!! :3")
