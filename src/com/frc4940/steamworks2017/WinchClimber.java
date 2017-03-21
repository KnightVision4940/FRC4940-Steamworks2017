package com.frc4940.steamworks2017;

import com.ctre.CANTalon;

public class WinchClimber {
	CANTalon _winch; 
	WinchClimber(int _CANPort){
		_winch = new CANTalon(_CANPort);
	}
	
	public void setSpeed (double speed){		
		_winch.set(speed * 0.8);
	}
		
}
