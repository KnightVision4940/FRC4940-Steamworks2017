package com.frc4940.steamworks2017;
import com.ctre.CANTalon;

public class BallscrewMotors {
	
 CANTalon ballscrew;
 
 public void ballsscrew(double speed){
	ballscrew.set(speed);
 }

 public BallscrewMotors(int port){
 ballscrew = new CANTalon(port); 
	 
	 
 }
	
}

