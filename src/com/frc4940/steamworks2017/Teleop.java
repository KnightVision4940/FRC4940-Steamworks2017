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
		
		gyro.printangle();
		
		if(Xbox.getXButton()){
			ballscrew.ballsscrew(1);
			ballscrew.Motorlauncher1(1);
			ballscrew.Motorlauncher2(1);
			
		}
		else if (Xbox.getYButton()){
			ballscrew.ballsscrew(-1);
			ballscrew.Motorlauncher1(0);
			ballscrew.Motorlauncher2(0);
		}
	
		if (Xbox.getAButton()){
		climber.setSpeed(0.25);
		}
		else if (Xbox.getBButton()){ 
		climber.setSpeed(-0.25);}
	}	
	
	public void init() {
		gyro.calibrategyro();
	}
}

	
	


