package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.GenericHID.Hand;



public class Teleop {
	
	private Gyroscope gyro;
	private DriveTrain drive;
	private WinchClimber climber;
	BallscrewMotors ballscrew;

	public Teleop(){

		drive = new DriveTrain();
		gyro = new Gyroscope(); 
		climber = new WinchClimber(1);
	}
	
	public void run() {
		drive._driveRobotSQ(-Xbox.getTriggers(), Xbox.getx(Hand.kLeft));
		
		gyro.getAngle();
		
		if(Xbox.getXButton()){
			ballscrew.ballsscrew(1);
			ballscrew.Motorlauncher(1);
			
		}
		else if (Xbox.getYButton()){
			ballscrew.ballsscrew(-1);
			ballscrew.Motorlauncher(0);
		}
	
		if (Xbox.getAButton()){
		climber.setSpeed(1);
		}
		else if (Xbox.getBButton()){ 
		climber.setSpeed(-1);
		}
	}	
	
	public void init() {
		gyro.calibrate();
	}
}

	
	


