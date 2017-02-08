package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.GenericHID.Hand;



public class Teleop {
	
	AnalogGyro gyroscope = new AnalogGyro(0);

	DriveTrain drive = new DriveTrain();
	
	BallscrewMotors ballscrew = new BallscrewMotors(0); 
	
	public void run() {
		drive._driveRobotSQ(Xbox.getTriggerAxis(Hand.kRight), Xbox.getTriggerAxis(Hand.kLeft));
		
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
}

	
	

