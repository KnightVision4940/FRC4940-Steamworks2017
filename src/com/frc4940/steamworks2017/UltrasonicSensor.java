package com.frc4940.steamworks2017;

import edu.wpi.first.wpilibj.Ultrasonic;

public class UltrasonicSensor {
	 Ultrasonic uSensor = new Ultrasonic(0, 1); 
	 //Returns the range in inches, you must have pinged before doing this.
	 public double getRangeInches(){
		    return uSensor.getRangeInches();
		}
	 //Pings the ultrasonic sensor. 
	 public void ping(){
		 uSensor.ping();
	 }
	 //Does both previous functions in 1 command.
	 public double getRange(){
		    uSensor.ping();
		    return uSensor.getRangeInches();
		}
	 //You input a double and the function will return true if the usensor detects a smaller range and false if your number is smaller.
	 public boolean howClose(double a){
		 uSensor.ping();
		 double range = getRangeInches();
		 if (range <= a){
			 return true;
		 }
		 else{
			 return false;
		 }
		 
		 
		
	 }
	 
	 
	
	

	
}
