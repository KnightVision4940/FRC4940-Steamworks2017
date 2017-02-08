package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.GenericHID.Hand;



public class Teleop {
	
	AnalogGyro gyroscope = new AnalogGyro(0);

	DriveTrain drive = new DriveTrain();
	
	public void run() {
		drive._driveRobotSQ(Xbox.getTriggerAxis(Hand.kRight), Xbox.getTriggerAxis(Hand.kLeft));
	
	}
	
	public void init() {
		gyroscope.initGyro();
	}
	}

	
	

