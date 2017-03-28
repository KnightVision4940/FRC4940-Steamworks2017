package com.frc4940.steamworks2017;

import edu.wpi.first.wpilibj.Timer;

public class Auto {
	
	Timer clock;
	int autoMode = Map.Auto.GEARTHREE; 
	int autoStage = 0;
	double lastStageTime = 0;
	
	public void init(int autoNum){
		clock = new Timer();
		clock.reset();
		clock.start();
		Map.drive.gyro.reset();
		Map.drive.disableSafety();
		
		this.autoMode = autoNum;
		this.autoStage = 0;
		this.lastStageTime = 0;
	}
	
	public void run(){
		System.out.println(Map.drive.getGyro().getAngle());
		if (autoMode == Map.Auto.DRIVE_FORWARD){
			if (this.autoStage == 0){
				Map.drive.driveStraight(0.8);
				if(clock.get() - this.lastStageTime > 2){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
				}
			} else {
				Map.drive.brake();
			}
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
			if (this.autoStage == 0){
				Map.drive.driveStraight(0.8);
				if(clock.get() - this.lastStageTime > 2){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
				}
			}
			else if (this.autoStage == 1){
				int rotDone = Map.drive.polarDrive(-30);
				if (rotDone == 1){
					this.lastStageTime = clock.get();
					this.autoStage++;
				}
			} else if (this.autoStage == 2){
				Map.drive.driveStraight(0.8);
				if(clock.get() - this.lastStageTime > 1.3){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
				}
			} else {
				Map.drive.brake();
			}
		}
		else if (autoMode == Map.Auto.GEARONE){
			if (this.autoStage == 0){
				Map.drive.driveStraight(0.8);
				if(clock.get() - this.lastStageTime > 5){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
				}
			} else {
				Map.drive.brake();
			}
		}
		else if (autoMode == Map.Auto.GEARTHREE){
			if (this.autoStage == 0){
				Map.drive.driveStraight(0.8);
				if(clock.get() - this.lastStageTime > 2){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
				}
			}
			else if (this.autoStage == 1){
				int rotDone = Map.drive.polarDrive(30);
				if (rotDone == 1){
					this.lastStageTime = clock.get();
					this.autoStage++;
				}
			} else if (this.autoStage == 2){
				Map.drive.driveStraight(0.8);
				if(clock.get() - this.lastStageTime > 1.3){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
				}
			} else {
				Map.drive.brake();
			}
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
		
	


