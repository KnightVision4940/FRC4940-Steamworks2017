package com.frc4940.steamworks2017;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;

/**
 * 
 * @author KnightVision
 * 
 * CamServers.java
 * Controls the livestreaming of the LifeCam webcam on the robot
 * Webcam must be plugged into USB port on the roboRIO
 */

public class CamServers {
	
	UsbCamera m_Cam;
	
	public void camInit(){
		this.m_Cam = CameraServer.getInstance().startAutomaticCapture("vision", 0);
		this.m_Cam.setFPS(14);
		this.m_Cam.setResolution(1280, 720);
		this.m_Cam.setExposureManual(50);
	}
	
}
