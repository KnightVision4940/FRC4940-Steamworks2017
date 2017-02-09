package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.GenericHID.Hand;


public class Teleop {
	
	GearHolder gear = new GearHolder();
	
	//jack and D@nte was here
	AnalogGyro gyroscope = new AnalogGyro(0);

	DriveTrain drive = new DriveTrain();
	
	BallscrewMotors ballscrew = new BallscrewMotors(0); 
	//adding controls to drive train
	public void run() {
		drive._driveRobotSQ(Xbox.getTriggerAxis(Hand.kRight), Xbox.getTriggerAxis(Hand.kLeft));
		//ball screw controls(x for up, y for down)
		if(Xbox.getXButton()){
			ballscrew.ballsscrew(1);
		}
		else if (Xbox.getYButton()){
			ballscrew.ballsscrew(-1);
		}
	
	}
	
	public void init() {
		gyroscope.initGyro();
	}
	
	//control to toggle gear holder on/off

		}
	
	


	
	

