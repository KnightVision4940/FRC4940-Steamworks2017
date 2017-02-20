package com.frc4940.steamworks2017;
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.VictorSP;;

public class BallscrewMotors {
	
	 CANTalon ballscrew;
	 VictorSP motorlauncher;
	 VictorSP motorLauncher2;
	 DigitalInput limitswitch;
	 
	
	public BallscrewMotors(int CANport, int victorPort, int victorPort2){
		 ballscrew = new CANTalon(CANport); 
			 
		 motorlauncher = new VictorSP(victorPort);
		 motorLauncher2 = new VictorSP(victorPort2);
		 limitswitch  = new DigitalInput (0);
	 }
	

 
 
 public void ballsscrew(double speed){
	ballscrew.set(speed/4);
 }
 
 public void setSpeed (double speed){
		
		 if (limitswitch.get()) {
			ballscrew.set(0);
		}
	}
 
 public void ScrewEncoder(){
	 ballscrew.getEncPosition();
 }
 

 

 //The ball launcher motors in fort of the ballscrew
 public void Motorlauncher1(double speed){
	 motorlauncher.set(speed);
 
}
 public void Motorlauncher2(double speed){
	 motorLauncher2.set(speed);
 }
}




	

