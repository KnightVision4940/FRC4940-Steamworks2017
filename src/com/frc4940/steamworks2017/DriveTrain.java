package com.frc4940.steamworks2017;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;

public class DriveTrain {
//RobotDrive object
	RobotDrive wheels;
	Gyroscope gyro; 
	
	public DriveTrain(){
		wheels = new RobotDrive(Map.PWM.LEFTBACKWHEEL,
				Map.PWM.LEFTFRONTWHEEL,
				Map.PWM.RIGHTBACKWHEEL,
				Map.PWM.RIGHTFRONTWHEEL);
		gyro = new Gyroscope(); 
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
	
	//automatically reverse steering when going in reverse for teleop
	public void smartDrive(double _Speed, double _Turn){
		if(_Speed < 0){
			_Turn *= -1;
		}
		
		if(_Speed >= 0){
			wheels.drive(Math.pow(_Speed, 2), _Turn);
		} else if (_Speed <=0){
			wheels.drive(-Math.pow(_Speed,  2),  _Turn);
		} else {
			wheels.drive(0, 0); 
		}
	}
	
	//Autonomous Driving Functions
	public int polarDrive(double targetAngle){
		//get angle, set spinning velocity
		double currentAngle = this.gyro.getAngle();
		double angularVelocity = (targetAngle-currentAngle);
		angularVelocity = this.clamp(angularVelocity, -1, 1);
		System.out.println("Ang " + angularVelocity);
		
		if(angularVelocity < 0.1 && angularVelocity > -0.1){
			wheels.tankDrive(0, 0);
			System.out.println("Auto Done!");
			return 1;
		}
		else{
			wheels.tankDrive(0.45 * angularVelocity, -0.45 * angularVelocity);
			return 0;
		}
	}
	
	public void tankDrive(double speedL, double speedR){
		wheels.tankDrive(speedL, speedR);
	}
	
	public void brake(){
		wheels.tankDrive(0, 0);
	}
	
	public void driveStraight(double speed){
		wheels.tankDrive(speed*0.9, speed);
	}
	
	public void enableSafety(){
		wheels.setSafetyEnabled(true);
	}
	
	public void disableSafety(){
		wheels.setSafetyEnabled(false);
	}
	
	public Gyroscope getGyro(){ return this.gyro; }
	
	double clamp(double value, double min, double max) {
		   return Math.min(Math.max(value, min), max);
	}
	
}
//ps, jack was here *lenny face* 
