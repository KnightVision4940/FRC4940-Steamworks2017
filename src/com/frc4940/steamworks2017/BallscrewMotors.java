package com.frc4940.steamworks2017;
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.VictorSP;;

public class BallscrewMotors {
	
	
public BallscrewMotors(int CANport, int victorPort){
	 ballscrew = new CANTalon(CANport); 
		 
		 motorlauncher = new VictorSP(victorPort);
	 }
	
 CANTalon ballscrew;
 VictorSP motorlauncher;
 public void ballsscrew(double speed){
	ballscrew.set(speed);
 }

 

 //The ball launcher motors in fort of the ballscrew
 public void Motorlauncher1(double speed){
	 motorlauncher.set(speed);
 
}
 public void Motorlauncher2(double speed){
	 motorlauncher.set(speed);

 }
}




	

