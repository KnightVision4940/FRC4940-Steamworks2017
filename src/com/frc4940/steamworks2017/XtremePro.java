package com.frc4940.steamworks2017;

import edu.wpi.first.wpilibj.Joystick;

public class XtremePro {
	public static Joystick controller = new Joystick (1);
	public static double getXAxis(){
		return controller.getRawAxis(0);
	}
	public static double getYAxis(){ 
		return controller.getRawAxis(1);
    }
	public static double getZAxis(){
    	return controller.getZ();
	}
	public static double getTwist(){
		return controller.getRawAxis(2);
	}
	public static double getSlider(){
		return controller.getRawAxis(3);
	}
	public static boolean getTrigger(){
		return controller.getRawButton(1);
	}
	public static boolean getThumb(){
		return controller.getRawButton(2);
	}
	public static boolean getLeftT(){
		return controller.getRawButton(3);
	}
	public static boolean getRightT(){
		return controller.getRawButton(4);
	}
}
