package com.frc4940.steamworks2017;
import com.ctre.CANTalon;
import edu.wpi.first.wpilibj.VictorSP;;

public class BallscrewMotors {
	
	
public BallscrewMotors(int CANport, int victorPort){
<<<<<<< HEAD
	 ballscrew = new CANTalon(CANport); 
=======
//	 ballscrew = new CANTalon(CANport); 
>>>>>>> dev
		 
		 motorlauncher = new VictorSP(victorPort);
	 }
	
<<<<<<< HEAD
 CANTalon ballscrew;
=======
// CANTalon ballscrew;
>>>>>>> dev
 VictorSP motorlauncher;
 public void ballsscrew(double speed){
	ballscrew.set(speed);
 }

 

 //The ball launcher motors in fort of the ballscrew
 public void Motorlauncher(double speed){
	 motorlauncher.set(speed);
 
}



}




	

