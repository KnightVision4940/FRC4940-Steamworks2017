# By Stew Esho for FRC TEAM 4940
# written 2017, this file is completely opensource
######################
# Used to process an external image, process it,
# calculate bearing, and push to network tables

import cv2
import numpy
import math
from grip import GripPipeline


class Vision:
    gp = GripPipeline()

    def pImg(self):

        img = cv2.imread("C:\Users\KnightVision\Pictures\RPI vision testing\ledPicx\img1487521546_0.jpg", cv2.IMREAD_COLOR)  # temporary test code
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

v = Vision()
v.pImg()