package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.GenericHID.Hand;



public class Teleop {
	
 static 	Gyroscope gyro = new Gyroscope(); 

	DriveTrain drive;
	
//	BallscrewMotors ballscrew;
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
//		}
//		else if (Xbox.getYButton()){
//			ballscrew.ballsscrew(-1);
//		}
	
	}
	
	public void gyro(){
		gyro.calibrategyro();
		gyro.printangle();
		
		 
	}
	
	public void init() {
		gyro.initGyro();
	}
}

	
	

