package com.frc4940.steamworks2017;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;

/**
 * 
 * @author KnightVision
 *
 * DriveTrain.java
 * Manages control functions of the drivetrain
 */

public class DriveTrain {

	RobotDrive wheels; //RobotDrive object
	Gyroscope gyro; //gyroscope
	protected double bearing;
	protected double heading;
	
	public DriveTrain(){
		wheels = new RobotDrive(Map.PWM.LEFTBACKWHEEL,
				Map.PWM.LEFTFRONTWHEEL,
				Map.PWM.RIGHTBACKWHEEL,
				Map.PWM.RIGHTFRONTWHEEL);
		gyro = new Gyroscope();
		bearing = 0.0;
		heading = this.gyro.getAngle();
	}
	
	public void init(){
		
		bearing = this.gyro.getAngle();
		heading = this.gyro.getAngle();
		
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
	
	//automatically reverse steering when going in reverse for teleop
		public void smartDriveGyro(double speed, double _Turn){
			if(speed < 0){
				_Turn *= -1;
			}
			
			this.bearing += 3*_Turn;
			this.heading = gyro.getAngle();
			
			double kp = (bearing - heading)/30;
			wheels.tankDrive((speed)-kp, speed+kp);
		}
	
	//Autonomous Driving Functions
	public int polarDrive(double targetAngle){
		//get angle, set spinning velocity
		double currentAngle = this.gyro.getAngle();
		double angularVelocity = (targetAngle-currentAngle);
		angularVelocity = this.clamp(angularVelocity, -1, 1);
		System.out.println("Ang " + angularVelocity);
		
		if(angularVelocity < 0.07 && angularVelocity > -0.07){
			wheels.tankDrive(0, 0);
			System.out.println("Auto Done!");
			return 1;
		}
		else{
			wheels.tankDrive(0.57 * angularVelocity, -0.57 * angularVelocity);
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
		wheels.tankDrive(speed*.96, speed);
	}
	
	public void driveStraightGyro(double speed, double initAngle){
		double kp = (gyro.getAngle() - initAngle)/30;
		wheels.tankDrive((speed*0.96)-kp, speed+kp);
	}
	
	public void pureStraightGyro(double speed, double initAngle){
		double kp = (gyro.getAngle() - initAngle)/30;
		wheels.tankDrive((speed)-kp, speed+kp);
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
