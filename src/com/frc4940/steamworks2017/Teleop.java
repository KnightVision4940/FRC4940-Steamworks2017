package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.GenericHID.Hand;



public class Teleop {
	
	private Gyroscope gyro;
	private DriveTrain drive;
	
	BallscrewMotors ballscrew;

	public Teleop(){

		drive = new DriveTrain();
		gyro = new Gyroscope(); 
		ballscrew = new BallscrewMotors(0, Map.PWM.BALLSCREW_PORT);
	}
	
	public void run() {
		drive._driveRobotSQ(-Xbox.getTriggers(), Xbox.getx(Hand.kLeft));
//		
//		gyro.printangle();
		
		if(Xbox.getXButton()){
			ballscrew.ballsscrew(1);
			ballscrew.Motorlauncher(1);
			
		}
		else if (Xbox.getYButton()){
			ballscrew.ballsscrew(-1);
			ballscrew.Motorlauncher(-1);
		}
	
	}	
	
	public void init() {
		gyro.calibrategyro();
	}
	
	public double getGyroAngle(){
		return gyro.getAngle();
	}
}

	
	


