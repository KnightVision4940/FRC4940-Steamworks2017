# By Stew Esho for FRC TEAM 4940
# written 2017, this file is completely opensource
######################
# Used to process an external image, process it,
# calculate bearing, and push to network tables

import cv2
import numpy
import math
import time
import os
from grip import GripPipeline
from networktables import NetworkTables
import logging

class Vision:
    gp = GripPipeline()
    #initialize network tables comms
    sd = NetworkTables.getTable("SmartDashboard")
    angle = 0
    dist = 0

    def pImg(self):

        img = self.grab()
        # img = cv2.imread("C:\Users\KnightVision\Pictures\RPI vision testing\ledPicx\img1487521546_0.jpg", cv2.IMREAD_COLOR)  # temporary test code
        if type(img) is numpy.ndarray:  # checks if image is not empty
            print("Processing . . . ")
            cx, self.dist = self.gp.process(img)
            self.calc_angle(cx)
        else:
            print("ERROR: cv2 img is empty! || " + "testImg.jpg")
            return 2


    def calc_angle(self, u):
        print("Calculating Angle . . . \n")
        raw_angle = math.degrees(math.atan((u-176)/298.7))
        init_angle = math.degrees(math.atan(1.25/self.dist))
        self.angle = init_angle + raw_angle
        print(init_angle, raw_angle, self.angle)
        print("DONE!")

    def grab(self):
        result, im = cap.read()
        return im

    def reset_exposure(self):
        os.system("v4l2-ctl -d /dev/video0 -c exposure_auto=1 -c exposure_absolute=0")
        print("Setting exposure setting to 5 . . . ")
        time.sleep(1)
        print("Done!")

    def push_data(self):
        if self.angle > 0.1 or self.angle < -0.1:
            self.sd.putNumber("pegAngle", self.angle)
        if self.dist > 0:
            self.sd.putNumber("distance", self.dist)

####################################
#program begins here
v = Vision()
logging.basicConfig(level=logging.DEBUG)
# NetworkTables.setIPAddress('10.49.40.2') #uncomment to connect to proper ip address
print(NetworkTables.getRemoteAddress())
v.reset_exposure() #uncomment to set exposure before running
cap = cv2.VideoCapture(0)# start video capture
#continously capture and process images
while True:
    v.pImg()
    v.push_data()
    time.sleep(0.125) #captures frames at 8fps
cap.release()
