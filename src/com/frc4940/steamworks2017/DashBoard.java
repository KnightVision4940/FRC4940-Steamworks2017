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
	int i;
	
	public DashBoard(){
		autoChooser = new SendableChooser();
		autoChooser.addDefault("Drive Forward" , Map.Auto.GEARTHREE);
		autoChooser.addObject("Gear (one)", Map.Auto.GEARONE);
		autoChooser.addObject("Gear (right)", Map.Auto.GEARTWO);
		autoChooser.addObject("Gear (Left)", Map.Auto.GEARTHREE);
		SmartDashboard.putData("Auto mode chooser", autoChooser);
		
		table = NetworkTable.getTable("SmartDashboard");
		visionAngle = 0;
		visionEnabled = false;
	}
	
	public SendableChooser getChooser(){
		return autoChooser;
	}
		
	public void runBoard(){			
		SmartDashboard.putNumber("angle to peg", table.getNumber("helpMe", 32));
		SmartDashboard.putNumber("YES", table.getNumber("pegAngle", 3));
		SmartDashboard.putBoolean("isVisionEnabled", visionEnabled);
		table.putBoolean("isVision", visionEnabled);
	}
	
	public double getAngleToPeg(){
		visionAngle = table.getNumber("angle", 0);
//		System.out.println("Angle to Peg: " + visionAngle);
		return visionAngle;
	}
	
	public boolean setVisionEnabled(boolean flag){
		this.visionEnabled = flag;
		return this.visionEnabled;
	}
	
	public int getAutoNumber(){
		return (int)autoChooser.getSelected();
	}
}