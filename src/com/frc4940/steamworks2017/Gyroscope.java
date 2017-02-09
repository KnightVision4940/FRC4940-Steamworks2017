package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.AnalogGyro;
public class Gyroscope {
	AnalogGyro gyro = new AnalogGyro(0);  
	
	public double getAngle(){
		return gyro.getAngle();
		
	}	


	public void reset(){
		gyro.reset();  
	}
	public double getRate(){
		return gyro.getRate();
	}
	
	public void calibrate(){
		gyro.calibrate();
	}
	
	public void initGyro(){
		gyro.initGyro(); 
	}
	
	
	
}


