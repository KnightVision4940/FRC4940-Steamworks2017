package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.HIDType;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj.hal.HAL;

public static class Xbox {

	public static XboxController xbox;

	public static int m_outputs;

	public static short m_rightRumble;

	public static int m_leftRumble;

	public Xbox(int port) {
	    xbox = new XboxController(port); 
	}
	
 public static double getY(Hand hand) {
	    if (hand.equals(Hand.kLeft)) {
	      return xbox.getRawAxis(1);
	    } else {
	      return xbox.getRawAxis(5);
	    }
	    
	  }
 

public static double getx(Hand hand) {
    if (hand.equals(Hand.kLeft)) {
      return xbox.getRawAxis(0);
    } else {
      return xbox.getRawAxis(5);
    }
  }

public static boolean getBumper(Hand hand) {
    if (hand.equals(Hand.kLeft)) {
      return xbox.getRawButton(5);
    } else {
      return xbox.getRawButton(6);}}

public static boolean getTrigger(Hand hand) {
    return false;
}

public static boolean getTop(Hand hand) {
    return false;
  }

public static boolean getRawButton(Hand hand) {
    return xbox.getStickButton (hand);
  }



public static double getTriggerAxis(Hand hand) {
    if (hand.equals(Hand.kLeft)) {
      return xbox.getRawAxis(2);
    } else {
      return xbox.getRawAxis(3);
    }
  }

public static boolean getAButton() {
    return xbox.getAButton();
  }

public static boolean getBButton() {
    return xbox.getBButton();
  }

public static boolean getXButton() {
    return xbox.getRawButton(3);
  }

public static boolean getYButton() {
    return xbox.getRawButton(4);
  }

public static boolean getStickButton(Hand hand) {
    if (hand.equals(Hand.kLeft)) {
      return xbox.getRawButton(9);
    } else {
      return xbox.getRawButton(10);
    }
  }

public static boolean getBackButton() {
    return xbox.getRawButton(7);
  }

public static boolean getStartButton() {
    return xbox.getRawButton(8);
  }

 
  public static int getPOV(int pov) {
    return getStickPOV(pov);
  }

  public static int getStickPOV(final int pov) {
	return 0;
}
public static int getPOVCount() {
    return getStickPOVCount() ;
  }

  public static int getStickPOVCount() {
	return 0;
}
public static HIDType getType() {
    return HIDType.values()[getJoystickType()];
  }

  public static int getJoystickType() {
	return 0;
}
public static String getName() {
    return getJoystickName();
  }

  public static String getJoystickName() {
	return null;
}

  public static void setOutput(int outputNumber, boolean value) {
	    m_outputs = (m_outputs & ~(1 << (outputNumber - 1))) | ((value ? 1 : 0) << (outputNumber - 1));
	    HAL.setJoystickOutputs((byte) m_outputs, m_leftRumble, m_rightRumble, m_rightRumble);
	  }

	  public static void setOutputs(int value) {
	    m_outputs = value;
	    HAL.setJoystickOutputs((byte)  m_outputs, m_leftRumble, m_rightRumble, m_rightRumble);
	  }

	 
	  public static void setRumble(RumbleType type, double value) {
	    if (value < 0) {
	      value = 0;
	    } else if (value > 1) {
	      value = 1;
	    }
	    if (type == RumbleType.kLeftRumble) {
	      m_leftRumble = (short) (value * 65535);
	    } else {
	      m_rightRumble = (short) (value * 65535);
	    }
	    HAL.setJoystickOutputs((byte) m_outputs, m_leftRumble, m_rightRumble, m_rightRumble);
	  }

}


