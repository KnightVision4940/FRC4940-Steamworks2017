package com.frc4940.steamworks2017;
import com.frc4940.steamworks2017.Map.Limit.PWM;

import edu.wpi.first.wpilibj.RobotDrive;

public class DriveTrain extends Teleop {
//RobotDrive object
	RobotDrive Wheels = new RobotDrive(PWM.LEFTBACKWHEEL,PWM.LEFTFRONTWHEEL,PWM.RIGHTBACKWHEEL,PWM.RIGHTFRONTWHEEL);
  
	//Method for driving robot
	//Should use in auto
	public void _driveRobot(double _Speed, double _Turn){
		Wheels.drive(_Speed,_Turn);
	}
	
	//Driving based on squared inputs
	//Should be used in teleop
	public void _driveRobotSQ(double _Speed, double _Turn){
		if(_Speed >= 0){
			Wheels.drive(Math.pow(_Speed, 2), _Turn);
		} else if (_Speed <=0){
			Wheels.drive(-Math.pow(_Speed,  2),  _Turn);
		} else {
			Wheels.drive(0, 0); 
		}
	}
	
}
//ps, jack was here *lenny face* 
