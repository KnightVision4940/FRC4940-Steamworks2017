package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class Teleop {
	
	public void run() {
		//driving (triggers to drive, and left stick to turn)
		Map.drive.smartDrive(-Xbox.getTriggers(), Xbox.getx(Hand.kLeft));
		
		//raising and lowering floor (Bumper Buttons)
		if(Xbox.getBumper(Hand.kLeft)) {
			Map.ballscrew.ballsscrew(1);
		}
		else if (Xbox.getBumper(Hand.kRight)){
			Map.ballscrew.ballsscrew(-1);
		} 
		else{
			Map.ballscrew.ballsscrew(0);
		}
		
		//Rollers to shoot balls ("B" Button")
		if(Xbox.getBButton()){
			Map.ballscrew.Motorlauncher1(-1);
			Map.ballscrew.Motorlauncher2(-1);
		} else{
			Map.ballscrew.Motorlauncher1(0);
			Map.ballscrew.Motorlauncher2(0);
		}
	
		//Spins Winch to climb
		//"A" Button spins a max speed, right joystick spins at variable speeds
		if (Xbox.getAButton()){ 
			Map.climber.setSpeed(-1);
		} else if (-1*Math.pow(Math.abs(Xbox.getY(Hand.kRight)), 2) < -0.05){
			Map.climber.setSpeed(-1*Math.pow(Math.abs(Xbox.getY(Hand.kRight)), 2));
		}
		else {
			Map.climber.setSpeed(0);
		}
		
		//DEBUG
		System.out.println(getGyroAngle() - 30);
	}	
	
	public void init() {
		Map.drive.disableSafety();
		Map.drive.gyro.reset();
	}
	
	public double getGyroAngle(){
		return Map.drive.getGyro().getAngle();
	}
}

	
	


