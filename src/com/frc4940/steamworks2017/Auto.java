package com.frc4940.steamworks2017;

import edu.wpi.first.wpilibj.Timer;

public class Auto {
	
	Timer clock;
	int autoMode = Map.Auto.DRIVE_FORWARD; 
	
	public void init(int autoNum){
		clock = new Timer();
		clock.reset();
		clock.start();
		Map.drive.gyro.reset();
		Map.drive.disableSafety();
		
		this.autoMode = autoNum;
	}
	
	public void run(){
		System.out.println(Map.drive.getGyro().getAngle());
		if (autoMode == Map.Auto.DRIVE_FORWARD){
			Map.drive.tankDrive(0.73, 0.8);
			Timer.delay(3.5);
			Map.drive.tankDrive(0, 0);
		}
		else if (autoMode == 1){
			Map.drive._driveRobot(1, 0);
			Timer.delay(3);
			Map.drive._driveRobot(1, -1);
			Timer.delay(10);
			Map.ballscrew.ballsscrew(1);
			Map.ballscrew.Motorlauncher1(1);
			Map.ballscrew.Motorlauncher2(1);
			Timer.delay(5);
		}

		//jack was here 


		else if (autoMode == 2){
			Map.drive._driveRobot(1, 0);
			Timer.delay(3);
			Map.drive._driveRobot(1, -1);
			Timer.delay(5);
			Map.ballscrew.ballsscrew(1);
			Map.ballscrew.Motorlauncher1(1);
			Map.ballscrew.Motorlauncher2(1);
			Timer.delay(5);
		}
		else if (autoMode == 3){
			Map.drive._driveRobot(1, 0);
			Timer.delay(3);
			Map.drive._driveRobot(1, -1);
			Timer.delay(3);
			Map.ballscrew.ballsscrew(1);
			Map.ballscrew.Motorlauncher1(1);
			Map.ballscrew.Motorlauncher2(1);
			Timer.delay(5);
		}
		else if (autoMode == 4){
			Map.drive._driveRobot(1, 0);
			Timer.delay(3);
			Map.drive._driveRobot(1, 1);
			Timer.delay(10);
			Map.ballscrew.ballsscrew(1);
			Map.ballscrew.Motorlauncher1(1);
			Map.ballscrew.Motorlauncher2(1);
			Timer.delay(5);
		}
		else if (autoMode == 5){
			Map.drive._driveRobot(1, 0);
			Timer.delay(3);
			Map.drive._driveRobot(1, 1);
			Timer.delay(5);
			Map.ballscrew.ballsscrew(1);
			Map.ballscrew.Motorlauncher1(1);
			Map.ballscrew.Motorlauncher2(1);
			Timer.delay(5);
		}
		else if (autoMode == 6){
			Map.drive._driveRobot(1, 0);
			Timer.delay(3);
			Map.drive._driveRobot(1, 1);
			Timer.delay(3);
			Map.ballscrew.ballsscrew(1);
			Map.ballscrew.Motorlauncher1(1);
			Map.ballscrew.Motorlauncher2(1);
			Timer.delay(5);
	    }
		else if (autoMode == Map.Auto.GEARTWO){
			Map.drive.tankDrive(0.73, 0.8);
			Timer.delay(1.15);
			Map.drive.tankDrive(0, 0);
			Map.drive.polarDrive(-60);
			Map.drive.tankDrive(0, 0);
			Map.drive.tankDrive(0.73, 0.8);
			Timer.delay(1.15);
			Map.drive.tankDrive(0, 0);
		}
		else if (autoMode == Map.Auto.GEARONE){
			Map.drive.tankDrive(0.67, 0.8);
			Timer.delay(1.5);
			Map.drive.tankDrive(0, 0);
		}
		//boo! hehehe scared you!
	}


	
	//ball points left

	//public void leftbolierfar(){
		//Map.drive.__driveRobot(1, 0);
		//Timer.delay(3);
		//Map.drive.__driveRobot(1, -1);
		//Timer.delay(10);
		//Map.ballscrew.ballsscrew(1);
		//Map.ballscrew.Motorlauncher1(1);
		//Map.ballscrew.Motorlauncher2(1);
		//Timer.delay(5);

	//}


	//public void leftboliermid(){
		//Map.drive.__driveRobot(1, 0);
		//Timer.delay(3);
		//Map.drive.__driveRobot(1, -1);
		//Timer.delay(5);
		//Map.ballscrew.ballsscrew(1);
		//Map.ballscrew.Motorlauncher1(1);
		//Map.ballscrew.Motorlauncher2(1);
		//Timer.delay(5);
	//}
	
	

	//public void leftbolierclose(){
		//Map.drive.__driveRobot(1, 0);
		//Timer.delay(3);
		//Map.drive.__driveRobot(1, -1);
		//Timer.delay(3);
		//Map.ballscrew.ballsscrew(1);
		//Map.ballscrew.Motorlauncher1(1);
		//Map.ballscrew.Motorlauncher2(1);
		//Timer.delay(5);
	//}


	//public void rightbolierfar(){
		//Map.drive.__driveRobot(1, 0);
		//Timer.delay(3);
		//Map.drive.__driveRobot(1, 1);
		//Timer.delay(10);
		//Map.ballscrew.ballsscrew(1);
		//Map.ballscrew.Motorlauncher1(1);
		//Map.ballscrew.Motorlauncher2(1);
		//Timer.delay(5);
	//}
	
	//public void rightboliermid(){
		//Map.drive.__driveRobot(1, 0);
		//Timer.delay(3);
		//Map.drive.__driveRobot(1, 1);
		//Timer.delay(5);
		//Map.ballscrew.ballsscrew(1);
		//Map.ballscrew.Motorlauncher1(1);
		//Map.ballscrew.Motorlauncher2(1);
		//Timer.delay(5);
	//}
	
	//public void rightbolierclose(){
		//Map.drive.__driveRobot(1, 0);
		//Timer.delay(3);
		//Map.drive.__driveRobot(1, 1);
		//Timer.delay(3);
		//Map.ballscrew.ballsscrew(1);
		//Map.ballscrew.Motorlauncher1(1);
		//Map.ballscrew.Motorlauncher2(1);
		//Timer.delay(5);
	//}
	
	
	//gear points
	//public void gearOne(){
		//Map.drive.__driveRobot(1, 1);
		//Timer.delay(5);
	//}
		//public void geartwo(){
			//Map.drive.__driveRobot(1,-1);
		//}
	
}		
		
	


