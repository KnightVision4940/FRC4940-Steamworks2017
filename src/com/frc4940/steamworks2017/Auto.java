package com.frc4940.steamworks2017;

import edu.wpi.first.wpilibj.Timer;
//D@nte was here
public class Auto {
	
	
	DriveTrain drive = new DriveTrain();
	GearHolder gear = new GearHolder();
<<<<<<< HEAD
	BallscrewMotors ballscrewup = new BallscrewMotors(1,2,3);
	BallscrewMotors launchermotors = new BallscrewMotors(1,2,3);
	
	//just driving foward
	public void driveForward(){
		drive._driveRobot(1, 0);
		Timer.delay(7);
=======
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
<<<<<<< HEAD
		else if (autoMode == 2)
>>>>>>> dev
	}
=======
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
>>>>>>> dev
    

	
	//ball points left
<<<<<<< HEAD
	public void leftbolierfar(){
		drive._driveRobot(1, 0);
		Timer.delay(3);
		drive._driveRobot(1, -1);
		Timer.delay(10);
		ballscrewup.ballsscrew(1);
		launchermotors.Motorlauncher1(1);
		launchermotors.Motorlauncher2(1);
		Timer.delay(5);

	}


	public void leftboliermid(){
		drive._driveRobot(1, 0);
		Timer.delay(3);
		drive._driveRobot(1, -1);
		Timer.delay(5);
		ballscrewup.ballsscrew(1);
		launchermotors.Motorlauncher1(1);
		launchermotors.Motorlauncher2(1);
		Timer.delay(5);
	}
	
	

	public void leftbolierclose(){
		drive._driveRobot(1, 0);
		Timer.delay(3);
		drive._driveRobot(1, -1);
		Timer.delay(3);
		ballscrewup.ballsscrew(1);
		launchermotors.Motorlauncher1(1);
		launchermotors.Motorlauncher2(1);
		Timer.delay(5);
	}
=======
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
>>>>>>> dev
	

	
//right ball points
<<<<<<< HEAD
	public void rightbolierfar(){
		drive._driveRobot(1, 0);
		Timer.delay(3);
		drive._driveRobot(1, 1);
		Timer.delay(10);
		ballscrewup.ballsscrew(1);
		launchermotors.Motorlauncher1(1);
		launchermotors.Motorlauncher2(1);
		Timer.delay(5);
	}
	
	public void rightboliermid(){
		drive._driveRobot(1, 0);
		Timer.delay(3);
		drive._driveRobot(1, 1);
		Timer.delay(5);
		ballscrewup.ballsscrew(1);
		launchermotors.Motorlauncher1(1);
		launchermotors.Motorlauncher2(1);
		Timer.delay(5);
	}
	
	public void rightbolierclose(){
		drive._driveRobot(1, 0);
		Timer.delay(3);
		drive._driveRobot(1, 1);
		Timer.delay(3);
		ballscrewup.ballsscrew(1);
		launchermotors.Motorlauncher1(1);
		launchermotors.Motorlauncher2(1);
		Timer.delay(5);
	}
	
	
	//gear points
	public void gearOne(){
		drive._driveRobot(1, 1);
		Timer.delay(5);
=======
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
			
>>>>>>> dev
	}
		public void geartwo(){
			drive._driveRobot(1,-1);
		}
	
}		
		
	


