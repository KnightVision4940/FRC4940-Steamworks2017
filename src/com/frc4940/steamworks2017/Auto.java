package com.frc4940.steamworks2017;

public class Auto {

	DriveTrain drive = new DriveTrain();
	GearHolder gear = new GearHolder();
	
	public void driveForward(double _Speed, double _Turn){
		drive._driveRobot(3, 0);
	}


	public void gearOne(double _Speed,double _Turn){
		drive._driveRobot(2,1);}
		

		public void geartwo(double _Speed,double _Turn){
			drive._driveRobot(2,1);
			
	}

	
}

