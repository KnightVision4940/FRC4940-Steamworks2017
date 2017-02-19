package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.GenericHID.Hand;



public class Teleop {
	
	private Gyroscope gyro;
	private DriveTrain drive;
<<<<<<< HEAD
	private WinchClimber climber;
=======
	
>>>>>>> dev
	BallscrewMotors ballscrew;

	public Teleop(){

		drive = new DriveTrain();
		gyro = new Gyroscope(); 
<<<<<<< HEAD
		climber = new WinchClimber(1);
=======
		ballscrew = new BallscrewMotors(0, Map.PWM.BALLSCREW_PORT);
>>>>>>> dev
	}
	
	public void run() {
		drive._driveRobotSQ(-Xbox.getTriggers(), Xbox.getx(Hand.kLeft));
		
<<<<<<< HEAD
		gyro.getAngle();
=======
		gyro.printangle();
>>>>>>> dev
		
		if(Xbox.getXButton()){
			ballscrew.ballsscrew(1);
			ballscrew.Motorlauncher(1);
			
		}
		else if (Xbox.getYButton()){
			ballscrew.ballsscrew(-1);
<<<<<<< HEAD
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
=======
			ballscrew.Motorlauncher(-1);
		}
	
	}	
	
	public void init() {
		gyro.calibrategyro();
>>>>>>> dev
	}
}

	
	


