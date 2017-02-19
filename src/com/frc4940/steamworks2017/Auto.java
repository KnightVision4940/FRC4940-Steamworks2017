package com.frc4940.steamworks2017;

import edu.wpi.first.wpilibj.Timer;
//D@nte was here
public class Auto {


	DriveTrain drive = new DriveTrain();
	GearHolder gear = new GearHolder();
	BallscrewMotors ballscrewup = new BallscrewMotors(1,2);
	BallscrewMotors launchermotors = new BallscrewMotors(1,2);
	
	//just driving foward
	public void driveForward(double _Speed, double _Turn){
		drive._driveRobot(3, 0);
	}

	//ball points left
	public void leftbolierfar(double _Speed,  double _Turn){
		drive._driveRobot(3, 0);
		Timer.delay(3);
		drive._driveRobot(3, -1);
		Timer.delay(10);
		ballscrewup.ballsscrew(1);
		launchermotors.Motorlauncher(1);
		
}


	public void leftboliermid(double _Speed,  double _Turn){
		drive._driveRobot(3, 0);
		Timer.delay(3);
		drive._driveRobot(3, -1);
		Timer.delay(5);
		ballscrewup.ballsscrew(1);
		launchermotors.Motorlauncher(1);
		
}
	
	

	public void leftbolierclose(double _Speed,  double _Turn){
		drive._driveRobot(3, 0);
		Timer.delay(3);
		drive._driveRobot(3, -1);
		Timer.delay(3);
		ballscrewup.ballsscrew(1);
		launchermotors.Motorlauncher(1);
		
}
	

	
//right ball points
	public void rightbolierfar(double _Speed,  double _Turn){
		drive._driveRobot(3, 0);
		Timer.delay(3);
		drive._driveRobot(3, 1);
		Timer.delay(10);
		ballscrewup.ballsscrew(1);
		launchermotors.Motorlauncher(1);
		
}
	
	public void rightboliermid(double _Speed,  double _Turn){
		drive._driveRobot(3, 0);
		Timer.delay(3);
		drive._driveRobot(3, 1);
		Timer.delay(5);
		ballscrewup.ballsscrew(1);
		launchermotors.Motorlauncher(1);
		
}
	
	public void rightbolierclose(double _Speed,  double _Turn){
		drive._driveRobot(3, 0);
		Timer.delay(3);
		drive._driveRobot(3, 1);
		Timer.delay(3);
		ballscrewup.ballsscrew(1);
		launchermotors.Motorlauncher(1);
		
}
	
	
	//gear points
	public void gearOne(double _Speed,double _Turn){
		drive._driveRobot(2, 1);}

		public void geartwo(double _Speed,double _Turn){
			drive._driveRobot(2,-1);
			
	}

	
}

