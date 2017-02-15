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



}
}

	

	
	
	
	
	

	