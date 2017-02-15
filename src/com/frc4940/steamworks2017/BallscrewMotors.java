package com.frc4940.steamworks2017;
//import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.VictorSP;;

public class BallscrewMotors {
	
// CANTalon ballscrew;
 VictorSP motorlauncher;
 public void ballsscrew(double speed){
//	ballscrew.set(speed);
 }

 public BallscrewMotors(int CANport, int victorPort){
// ballscrew = new CANTalon(CANport); 
	 
	 motorlauncher = new VictorSP(victorPort);
 }

 //The ball launcher motors in fort of the ballscrew
 public void Motorlauncher(double speed){
	 motorlauncher.set(speed);
 
}




	
}
