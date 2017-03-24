package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class Teleop {
	
	public void run() {
		//driving (triggers and left stick)
		Map.drive.smartDrive(-Xbox.getTriggers(), Xbox.getx(Hand.kLeft));
		
		//raising and lowering floor
		if(Xbox.getBumper(Hand.kLeft)) {
			Map.ballscrew.ballsscrew(1);
		}
		else if (Xbox.getBumper(Hand.kRight)){
			Map.ballscrew.ballsscrew(-1);
		} 
		else{
			Map.ballscrew.ballsscrew(0);
		}
		
		if(Xbox.getBButton()){
			Map.ballscrew.Motorlauncher1(-1);
			Map.ballscrew.Motorlauncher2(-1);
		} else{
			Map.ballscrew.Motorlauncher1(0);
			Map.ballscrew.Motorlauncher2(0);
		}
	
		if (Xbox.getAButton()){ 
			Map.climber.setSpeed(-1);
		} else {
			Map.climber.setSpeed(0);
		}
	}	
	
	public void init() {
		Map.drive.disableSafety();
	}
	
	public double getGyroAngle(){
		return Map.drive.getGyro().getAngle();
	}
}

	
	


