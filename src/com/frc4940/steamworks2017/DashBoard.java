package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import java.util.EventObject;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
 


public class DashBoard {

	SmartDashboard dashboard; 
	SendableChooser autoChooser;
	NetworkTable table;
	
	double visionAngle;
	boolean visionEnabled;
	
	public DashBoard(){
		autoChooser = new SendableChooser();
		autoChooser.addDefault("Drive Forward" , Map.Auto.DRIVE_FORWARD);
		autoChooser.addObject("Gear (one)", Map.Auto.GEARONE);
		SmartDashboard.putData("Auto mode chooser", autoChooser);
		table = NetworkTable.getTable("SmartDashboard");
		visionAngle = 0;
		visionEnabled = false;
	}
	
	public SendableChooser getChooser(){
		return autoChooser;
	}
		
	public void runBoard(){			
		SmartDashboard.putNumber("angle to peg", getAngleToPeg());
		SmartDashboard.putBoolean("isVisionEnabled", visionEnabled);
		table.putBoolean("isVision", visionEnabled);
	}
	
	public double getAngleToPeg(){
		visionAngle = table.getNumber("angle", 0);
		System.out.println("Angle to Peg: " + visionAngle);
		return visionAngle;
	}
	
	public boolean setVisionEnabled(boolean flag){
		this.visionEnabled = flag;
		return this.visionEnabled;
	}
}