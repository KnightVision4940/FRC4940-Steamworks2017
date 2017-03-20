# By Stew Esho for FRC TEAM 4940
# written 2017, this file is completely opensource
######################
# Used to process an external image, process it,
# calculate bearing, and push to network tables

import cv2
import numpy
import math
import time
from grip import GripPipeline


class Vision:
    gp = GripPipeline()

    def pImg(self):

        img = self.grab()
        # img = cv2.imread("C:\Users\KnightVision\Pictures\RPI vision testing\ledPicx\img1487521546_0.jpg", cv2.IMREAD_COLOR)  # temporary test code
        if type(img) is numpy.ndarray:  # checks if image is not empty
            print("Processing . . . ")
            cx, dist = self.gp.process(img)
            self.angle(cx, dist)
        else:
            print("ERROR: cv2 img is empty! || " + "testImg.jpg")
            return 2


    def angle(self, u, d):
        print("Calculating Angle . . . \n")
        raw_angle = math.degrees(math.atan((u-176)/298.7))
        init_angle = math.degrees(math.atan(1.25/d))
        angle = init_angle + raw_angle
        print(init_angle, raw_angle, angle)
        print("DONE!")

    def grab(self):
        result, im = cap.read()
        return im

    def reset_exposure(self):
        os.system("v4l2-ctl -d /dev/video0 -c exposure_auto=1 -c exposure_absolute=0")
        print("Setting exposure setting to 5 . . . ")
        time.wait(1)
        print("Done!")

####################################
#program begins here
v = Vision()
cap = cv2.VideoCapture(0)# start video capture
# v.reset_exposure() #uncomment to set exposure before running script
#continously capture and process images
while True:
    v.pImg()
    time.sleep(0.125) #captures frames at 8fps
cap.release()
