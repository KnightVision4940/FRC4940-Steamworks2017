package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.GenericHID.Hand;



public class Teleop {
	
	GearHolder gear;
	
	AnalogGyro gyroscope;

	DriveTrain drive;
	
	BallscrewMotors ballscrew;
//	
	public Teleop(){
		gyroscope = new AnalogGyro(0);
		drive = new DriveTrain();
		ballscrew = new BallscrewMotors(0,Map.PWM.BALLSCREW_PORT);
	}
	
	public void run() {
		drive._driveRobotSQ(-Xbox.getTriggers(), Xbox.getx(Hand.kLeft));
		
		if(Xbox.getXButton()){
			ballscrew.ballsscrew(1);
			ballscrew.Motorlauncher(1);
			
		}
		else if (Xbox.getYButton()){
			ballscrew.ballsscrew(-1);
			ballscrew.Motorlauncher(-1);
		}
//			gear.gearholdertoggle(Xbox.getAButton());
	
	}


	
	public void init() {
		gyroscope.initGyro();
	}
}

	
	

