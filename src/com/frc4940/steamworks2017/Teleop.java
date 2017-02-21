package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class Teleop {

	public Teleop(){
	}
	
	public void run() {
		//driving (triggers and left stick)
		Map.drive._driveRobot(-Xbox.getTriggers(), Xbox.getx(Hand.kLeft));
		
		//Map.gyro.printangle();
		
		//raising and lowering floor
		if(Xbox.getXButton()){
			Map.ballscrew.ballsscrew(1);
		}
		else if (Xbox.getYButton()){
			Map.ballscrew.ballsscrew(-1);
		} 
		else{
			Map.ballscrew.ballsscrew(0);
		}
		
		if(Xbox.getBButton()){
			Map.ballscrew.Motorlauncher1(1);
			Map.ballscrew.Motorlauncher2(1);
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
		Map.gyro.calibrategyro();
		Map.drive.disableSafety();
	}
}

	
	


