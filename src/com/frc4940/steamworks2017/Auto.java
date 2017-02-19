package com.frc4940.steamworks2017;

import edu.wpi.first.wpilibj.Timer;
//D@nte was here
public class Auto {
	
	
	DriveTrain drive = new DriveTrain();
	GearHolder gear = new GearHolder();
	BallscrewMotors ballscrewup = new BallscrewMotors(1,2, 1);
	BallscrewMotors launchermotors = new BallscrewMotors(1,2, 1);
	
	int autoMode = 0; 
	
	public void run(){
		if (autoMode == 0){
			drive._driveRobot(1, 0);
		}
		else if (autoMode == 1){
			drive._driveRobot(1, 0);
			Timer.delay(3);
			drive._driveRobot(1, -1);
			Timer.delay(10);
			ballscrewup.ballsscrew(1);
			launchermotors.Motorlauncher1(1);
			launchermotors.Motorlauncher2(1);
		}
		else if (autoMode == 2){
			drive._driveRobot(1, 0);
			Timer.delay(3);
			drive._driveRobot(1, -1);
			Timer.delay(5);
			ballscrewup.ballsscrew(1);
			launchermotors.Motorlauncher1(1);
			launchermotors.Motorlauncher2(1);
		}
		else if (autoMode == 3){
			drive._driveRobot(1, 0);
			Timer.delay(3);
			drive._driveRobot(1, -1);
			Timer.delay(3);
			ballscrewup.ballsscrew(1);
			launchermotors.Motorlauncher1(1);
			launchermotors.Motorlauncher2(1);
		}
		else if (autoMode == 4){
			drive._driveRobot(1, 0);
			Timer.delay(3);
			drive._driveRobot(1, 1);
			Timer.delay(10);
			ballscrewup.ballsscrew(1);
			launchermotors.Motorlauncher1(1);
			launchermotors.Motorlauncher2(1);	
		}
		else if (autoMode == 5){
			drive._driveRobot(1, 0);
			Timer.delay(3);
			drive._driveRobot(1, 1);
			Timer.delay(5);
			ballscrewup.ballsscrew(1);
			launchermotors.Motorlauncher1(1);
			launchermotors.Motorlauncher2(1);
		}
		else if (autoMode == 6){
			drive._driveRobot(1, 0);
			Timer.delay(3);
			drive._driveRobot(1, 1);
			Timer.delay(3);
			ballscrewup.ballsscrew(1);
			launchermotors.Motorlauncher1(1);
			launchermotors.Motorlauncher2(1);		
	    }
		else if (autoMode == 7){ 
			
		}
		else if (autoMode == 8){
			
		}	
    

	//ball points left
	//public void leftbolierfar(double _Speed,  double _Turn){
		//drive._driveRobot(1, 0);
		//Timer.delay(3);
		//drive._driveRobot(1, -1);
		//Timer.delay(10);
		//ballscrewup.ballsscrew(1);
		//launchermotors.Motorlauncher1(1);
		//launchermotors.Motorlauncher2(1);
		
//}


	//public void leftboliermid(double _Speed,  double _Turn){
		//drive._driveRobot(1, 0);
		//Timer.delay(3);
		//drive._driveRobot(1, -1);
		//Timer.delay(5);
		//ballscrewup.ballsscrew(1);
		//launchermotors.Motorlauncher1(1);
		//launchermotors.Motorlauncher2(1);
//}
	
	

	//public void leftbolierclose(double _Speed,  double _Turn){
		//drive._driveRobot(1, 0);
		//Timer.delay(3);
		//drive._driveRobot(1, -1);
		//Timer.delay(3);
		//ballscrewup.ballsscrew(1);
		//launchermotors.Motorlauncher1(1);
		//launchermotors.Motorlauncher2(1);
//}
	

	
//right ball points
	//public void rightbolierfar(double _Speed,  double _Turn){
		//drive._driveRobot(1, 0);
		//Timer.delay(3);
		//drive._driveRobot(1, 1);
		//Timer.delay(10);
		//ballscrewup.ballsscrew(1);
		//launchermotors.Motorlauncher1(1);
		//launchermotors.Motorlauncher2(1);
}
	
	//public void rightboliermid(double _Speed,  double _Turn){
		//drive._driveRobot(1, 0);
		//Timer.delay(3);
		//drive._driveRobot(1, 1);
		//Timer.delay(5);
		//ballscrewup.ballsscrew(1);
		//launchermotors.Motorlauncher1(1);
		//launchermotors.Motorlauncher2(1);
//}
	
	//public void rightbolierclose(double _Speed,  double _Turn){
		//drive._driveRobot(1, 0);
		//Timer.delay(3);
		//drive._driveRobot(1, 1);
		//Timer.delay(3);
		//ballscrewup.ballsscrew(1);
		//launchermotors.Motorlauncher1(1);
		//launchermotors.Motorlauncher2(1);
//}
	
	
	//gear points
	//public void gearOne(double _Speed,double _Turn){
		//drive._driveRobot(1, 1);}

		//public void geartwo(double _Speed,double _Turn){
			//drive._driveRobot(1,-1);
			
	}
=======
//	DriveTrain drive = new DriveTrain();
//	GearHolder gear = new GearHolder();
//	
//	public void driveForward(double _Speed, double _Turn){
//		drive._driveRobot(3, 0);
//	}
//
//
//	public void gearOne(double _Speed,double _Turn){
//		drive._driveRobot(2,1);}
//		
//
//		public void geartwo(double _Speed,double _Turn){
//			drive._driveRobot(2,1);
//			
//	}
>>>>>>> dev

	
}

