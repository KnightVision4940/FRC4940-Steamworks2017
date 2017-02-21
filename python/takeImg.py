#takes an image and puts it to the /img directory.

import os
import time
import sys
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

for p in sys.argv:
	pS = str(p)
	print(pS)
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
	os.system("fswebcam --no-banner -S " + delay + " --save ~/img/img" + currTime  + "_" + str(i) + ".jpg" )
	print("recharging my camera!")
	time.sleep(1)

print("Done!!! :3")
