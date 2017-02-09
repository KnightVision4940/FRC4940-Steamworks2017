package com.frc4940.steamworks2017;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.VictorSP;

public class WinchClimber {

	VictorSP winch = new VictorSP (0);
	
	DigitalInput limitSwitch = new DigitalInput (0);
	
	public void setSpeed (double speed){
		
		if (limitSwitch.get()){
			winch.set(0);
		}
		
		else {
			winch.set(speed);
		}
	}
	
}
