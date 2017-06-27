package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.ADXRS450_Gyro;

/**
 * 
 * @author KnightVision
 *
 * Gyroscope.java
 * Wrapper for gyroscope functionality
 */

public class Gyroscope {
	
	ADXRS450_Gyro gyro;
	
	public Gyroscope(){
		gyro = new ADXRS450_Gyro();
	}  
	
	public double getAngle(){
		return gyro.getAngle();
	}	
    
	public void reset(){
		gyro.reset();  
	}
	public double getRate(){
		return gyro.getRate();
	}
	
	public void calibrategyro(){
		gyro.calibrate();
	}
	public void printangle(){
		System.out.println("GYRO ANGLE:" + gyro.getAngle());
	}
	
}
