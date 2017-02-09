package com.frc4940.steamworks2017;
import com.ctre.CANTalon;


public class GearHolder {
	
	CANTalon gear;

  boolean wasPressed = !true;	
  boolean isOpen = false;
		  
	public void gearholdertoggle(boolean isPressed){
		
		if (wasPressed == false && isPressed == true){
			isOpen = !isOpen;
			
		}
		
		if (isOpen == true){
//			gear.enable();
		} else {
//			gear.disable();
		}
		
		//|||||||||||||||||||||||||
		wasPressed = isPressed; 

	
	
	}
}
