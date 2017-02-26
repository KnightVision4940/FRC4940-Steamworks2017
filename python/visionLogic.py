# By Stew Esho for FRC TEAM 4940
# written 2017, this file is completely opensource
######################
# Used to process an external image, process it,
# calculate bearing, and push to network tables

import cv2
import numpy
from grip import GripPipeline


class Vision:
    gp = GripPipeline()

    def pImg(self):

        img = cv2.imread("C:\Users\KnightVision\Pictures\RPI vision testing\ledPicx\img1487302145_4.jpg", cv2.IMREAD_COLOR)  # temporary test code
        if type(img) is numpy.ndarray:  # checks if image is not empty
            print("Processing . . . ")
            processedImg = self.gp.process(img)
            self.angle(processedImg)
        else:
            print("ERROR: cv2 img is empty! || " + "testImg.jpg")
            return 2


    def angle(self, pImg):
        print("Processing image . . . \n")
        cv2.imwrite('newProcssedImg.jpg', pImg)
        print("Done!")

v = Vision()
v.pImg()