package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.GenericHID.Hand;


public class Teleop {
	
<<<<<<< HEAD
//	AnalogGyro gyroscope;
=======
	GearHolder gear = new GearHolder();
	
	//jack and D@nte was here
	AnalogGyro gyroscope = new AnalogGyro(0);
>>>>>>> Gears

	DriveTrain drive;
	
<<<<<<< HEAD
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
=======
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
		
	
			gear.gearholdertoggle(Xbox.getAButton());
>>>>>>> Gears
	
	}
	
	public void init() {
//		gyroscope.initGyro();
	}
	
	//control to toggle gear holder on/off
	public void GearController(){
		
		
		
	}
		}
	
	


	
	

