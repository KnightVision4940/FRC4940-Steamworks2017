package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
 


public class DashBoard {

	SmartDashboard dashboard; 
	SendableChooser <String> chooser;
		
	public void board(){	
		 
SmartDashboard.putNumber("drive left" ,8);
SmartDashboard.putNumber("Climbing Encoder", 9);
SmartDashboard.putNumber("drive right" ,7);
SmartDashboard.putNumber("ballscrew" , 4);
SmartDashboard.putNumber("balllauncher", 2);

SmartDashboard.putBoolean("auto one", true);
SmartDashboard.putBoolean("auto two", false);
SmartDashboard.putBoolean("auto three", false);
SmartDashboard.putBoolean("auto four", false);	
SmartDashboard.putBoolean("auto five", false);
SmartDashboard.putBoolean("auto six", false);
}
}