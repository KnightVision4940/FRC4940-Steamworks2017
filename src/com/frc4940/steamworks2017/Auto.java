package com.frc4940.steamworks2017;

import edu.wpi.first.wpilibj.Timer;

/**
 * 
 * @author KnightVision
 *
 * Auto.java
 * Contains all code used to run the various autonomous modes.
 */
public class Auto {
	
	Timer clock;
	int autoMode = Map.Auto.GEARMID_GYRO; 
	int autoStage = 0;
	double lastStageTime = 0;
	double initAngle = 0;
	
	public void init(int autoNum){
		clock = new Timer();
		clock.reset();
		clock.start();
		Map.drive.gyro.reset();
		Map.drive.disableSafety();
		
		this.autoMode = autoNum;
		this.autoStage = 0;
		this.lastStageTime = 0;
		this.initAngle = Map.drive.getGyro().getAngle();
	}
	
	public void run(){
		System.out.println(Map.drive.getGyro().getAngle());
		/**
		 * DRIVING FORWARDS (NO GEAR)
		 */
		if (autoMode == Map.Auto.DRIVE_FORWARD){
			if (this.autoStage == 0){
				Map.drive.driveStraight(0.4);
				if(clock.get() - this.lastStageTime > 2.5){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
				}
			} else {
				Map.drive.brake();
			}
		}
		/**
		 * RIGHT GEAR
		 */
		else if (autoMode == Map.Auto.GEARTWO){
			if (this.autoStage == 0){
				Map.drive.pureStraightGyro(0.6, this.initAngle);
				if(clock.get() - this.lastStageTime > 3.0){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
				}
			}
			else if (this.autoStage == 1){
				int rotDone = Map.drive.polarDrive(-60);
				if (rotDone == 1){
					this.lastStageTime = clock.get();
					this.autoStage++;
					this.initAngle = Map.drive.getGyro().getAngle();
				}
			} else if (this.autoStage == 2){
				Map.drive.brake();
				if(clock.get() - this.lastStageTime > 0.5){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
					this.initAngle = Map.drive.getGyro().getAngle();
				}
			} else if (this.autoStage == 3){
				Map.drive.pureStraightGyro(0.6, this.initAngle);
				if(clock.get() - this.lastStageTime > 4){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
				}
			} else {
				Map.drive.brake();
			}
		}
		/**
		 * MIDDLE GEAR
		 */
		else if (autoMode == Map.Auto.GEARMID){
			if (this.autoStage == 0){
				Map.drive.driveStraight(0.4);
				if(clock.get() - this.lastStageTime > 7){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
				}
			} else {
				Map.drive.brake();
			}
		}
		/**
		 * LEFT GEAR
		 */
		else if (autoMode == Map.Auto.GEARTHREE){
			if (this.autoStage == 0){
				Map.drive.pureStraightGyro(0.6, this.initAngle);
				if(clock.get() - this.lastStageTime > 3.0){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
				}
			}
			else if (this.autoStage == 1){
				int rotDone = Map.drive.polarDrive(60);
				if (rotDone == 1){
					this.lastStageTime = clock.get();
					this.autoStage++;
					this.initAngle = Map.drive.getGyro().getAngle();
				}
			} else if (this.autoStage == 2){
				Map.drive.brake();
				if(clock.get() - this.lastStageTime > 0.5){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
					this.initAngle = Map.drive.getGyro().getAngle();
				}
			} else if (this.autoStage == 3){
				Map.drive.pureStraightGyro(0.6, this.initAngle);
				if(clock.get() - this.lastStageTime > 4){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
				}
			} else {
				Map.drive.brake();
			}
		}
		
		/**
		 * MIDDLE GEAR WITH GYROSCOPE
		 */
		else if (autoMode == Map.Auto.GEARMID_GYRO){
			if (this.autoStage == 0){
				Map.drive.pureStraightGyro(0.7, this.initAngle);
				if(clock.get() - this.lastStageTime > 5){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
				}
			} else {
				Map.drive.brake();
		
			}
		}
		/**
		 * SANIC BOY
		 */
		else if (autoMode == Map.Auto.GEARMID_FAST){
//			
			if (this.autoStage == 0){
				Map.drive.pureStraightGyro(0.75, this.initAngle);
				if(clock.get() - this.lastStageTime > 12){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
				}
			} else if (this.autoStage == 1){
				int rotDone = Map.drive.polarDrive(180);
				if (rotDone == 1){
					this.lastStageTime = clock.get();
					this.autoStage++;
					this.initAngle = Map.drive.getGyro().getAngle();
				}
			} else if (this.autoStage == 2){
				Map.drive.brake();
				if(clock.get() - this.lastStageTime > 0.5){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
					this.initAngle = Map.drive.getGyro().getAngle();
				}
			} else if (this.autoStage == 3){
				Map.drive.pureStraightGyro(0.75, this.initAngle);
				if(clock.get() - this.lastStageTime > 12){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
				}
			} else {
				Map.drive.brake();
			}
		}
		else if (autoMode == Map.Auto.FULL_FIELD_SPRINT){
			if (this.autoStage == 0){
				Map.drive.pureStraightGyro(1.0, this.initAngle);
				if(clock.get() - this.lastStageTime > 14){
					Map.drive.brake();
					this.lastStageTime = clock.get();
					this.autoStage++;
				}
			} else {
				Map.drive.brake();
		
			}
		}
		/////////////////////////////////
		else if (autoMode == Map.Auto.TEST){
			if (this.autoStage == 0){
				int rotDone = Map.drive.polarDrive(-60);
				if (rotDone == 1){
					this.lastStageTime = clock.get();
					this.autoStage++;
					this.initAngle = Map.drive.getGyro().getAngle();
				}
			} else {
				Map.drive.brake();
			}
		}
		//rip steam power, dang electricity 
		
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
		
	


