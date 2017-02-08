package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.RobotDrive;


public class Teleop {

	DriveTrain drive = new DriveTrain();
	
	public void run() {
		drive._driveRobotSQ(Xbox.getTriggerAxis(Hand.kRight), Xbox.getTriggerAxis(Hand.kLeft));
	
	}
	}

	
	

