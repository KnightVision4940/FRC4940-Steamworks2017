package com.frc4940.steamworks2017;

import edu.wpi.first.wpilibj.RobotDrive;

public class DriveTrain {
//RobotDrive object
	RobotDrive wheels;
	
	public DriveTrain(){
		wheels = new RobotDrive(Map.PWM.LEFTBACKWHEEL,
				Map.PWM.LEFTFRONTWHEEL,
				Map.PWM.RIGHTBACKWHEEL,
				Map.PWM.RIGHTFRONTWHEEL);
	}
  
	//Method for driving robot
	//Should use in auto
	public void _driveRobot(double _Speed, double _Turn){
		wheels.drive(_Speed,_Turn);
	}
	
	//Driving based on squared inputs
	//Should be used in teleop
	public void _driveRobotSQ(double _Speed, double _Turn){
		if(_Speed >= 0){
			wheels.drive(Math.pow(_Speed, 2), _Turn);
		} else if (_Speed <=0){
			wheels.drive(-Math.pow(_Speed,  2),  _Turn);
		} else {
			wheels.drive(0, 0); 
		}
	}
	
}
//ps, jack was here *lenny face* 
