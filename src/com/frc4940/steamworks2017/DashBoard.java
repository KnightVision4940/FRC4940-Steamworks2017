package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
 


public class DashBoard {

	SendableChooser <String> chooser;
		
	public static void board(){	
		 
		SmartDashboard.putNumber("drive left" ,8);
		SmartDashboard.putNumber("Climbing Encoder", 9);
		SmartDashboard.putNumber("drive right" ,7);
		SmartDashboard.putNumber("ballscrew" , 4);
		SmartDashboard.putNumber("balllauncher", 2);
		SmartDashboard.putNumber("speed of drive train", 1-4);
		SmartDashboard.putNumber("directionLeft", 10 );
		SmartDashboard.putNumber("directionRight", 11 );
		SmartDashboard.putNumber("gyro angle", 13 );
		SmartDashboard.putNumber("encoder drive",14);
		
		
		SmartDashboard.putBoolean("auto one", true);
		SmartDashboard.putBoolean("auto two", false);
		SmartDashboard.putBoolean("auto three", false);
		SmartDashboard.putBoolean("auto four", false);	
		SmartDashboard.putBoolean("auto five", false);
		SmartDashboard.putBoolean("auto six", false);

SmartDashboard.putBoolean("auto one", true);
SmartDashboard.putBoolean("auto two", false);
SmartDashboard.putBoolean("auto three", false);
SmartDashboard.putBoolean("auto four", false);	
SmartDashboard.putBoolean("auto five", false);
SmartDashboard.putBoolean("auto six", false);
}
}