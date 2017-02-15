package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.GenericHID.Hand;



public class Teleop {
	
//	AnalogGyro gyroscope;

	DriveTrain drive;
	
//	BallscrewMotors ballscrew;
	
	BallscrewMotors ball_launch = new BallscrewMotors(0,1);
//	
	public Teleop(){
//		gyroscope = new AnalogGyro(0);
		drive = new DriveTrain();
//		ballscrew = new BallscrewMotors(0);
	}
	
	public void run() {
		drive._driveRobotSQ(-Xbox.getTriggers(), Xbox.getx(Hand.kLeft));
		
//		if(Xbox.getXButton()){
//			ballscrew.ballsscrew(1);
			ball_launch.Motorlauncher(1);
			
//		}
//		else if (Xbox.getYButton()){
//			ballscrew.ballsscrew(-1);
			ball_launch.Motorlauncher(-1);
//		}
	
	}
	
	public void init() {
//		gyroscope.initGyro();
	}
}

	
	

