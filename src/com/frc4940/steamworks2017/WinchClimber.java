package com.frc4940.steamworks2017;

import edu.wpi.first.wpilibj.DigitalInput;
import com.ctre.CANTalon;

public class WinchClimber {
	CANTalon _winch; 
	WinchClimber(int _CANPort){
		_winch = new CANTalon(_CANPort);
	}
	
	DigitalInput limitSwitch = new DigitalInput (0);
	
	public void initEncoder(){
		_winch.setEncPosition(0);
		
	}
	
	public void setSpeed (double speed){
		
		if (limitSwitch.get()){
			_winch.set(0);
		}
		
		else {
			_winch.set(speed/4);
		}
	}
	
	public int getWinchPosition(){
		return _winch.getEncPosition();
	}		
}
