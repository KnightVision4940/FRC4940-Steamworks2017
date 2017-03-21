package com.frc4940.steamworks2017;

import edu.wpi.first.wpilibj.Timer;
//D@nte was here
public class Auto {
	
	int autoMode = Map.Auto.GEARONE; 
	
	public void run(){
		if (autoMode == 0){
			Map.drive._driveRobot(1, 0);
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
		else if (autoMode == 8){
			Map.drive._driveRobot(1, -1);
			
		}
		else if (autoMode == Map.Auto.GEARONE){
			Map.drive.driveStraight();
			Timer.delay(1);
			Map.drive.polarDrive(0.5, -60);
			Timer.delay(0.5);
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
		
	


