package com.frc4940.steamworks2017;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;

public class CamServers {
	
	UsbCamera m_Cam;
	
	public void camInit(){
		this.m_Cam = CameraServer.getInstance().startAutomaticCapture("vision", 0);
		this.m_Cam.setFPS(8);
		this.m_Cam.setResolution(320, 480);
		this.m_Cam.setExposureManual(50);
	}
	
}
