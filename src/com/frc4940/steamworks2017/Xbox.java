package com.frc4940.steamworks2017;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.HIDType;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj.hal.HAL;

public class Xbox {

	static XboxController xbox;

	private Hand hand;

	private int m_outputs;

	private short m_rightRumble;

	private int m_leftRumble;

	public Xbox(int port) {
	    super ();
	    xbox = new XboxController(port);
	    hand = null; 
	    if (hand.equals(Hand.kLeft)) {
	      return;
	    } else {
	      return;
	    }

	}
 public double getY(Hand hand) {
	    if (hand.equals(Hand.kLeft)) {
	      return xbox.getRawAxis(1);
	    } else {
	      return xbox.getRawAxis(5);
	    }
	  }
 
private double getRawAxis1 (final int axis) {
	return axis;}

public double getx(Hand hand) {
    if (hand.equals(Hand.kLeft)) {
      return getRawAxis0(0);
    } else {
      return getRawAxis1(5);
    }
  }
private double getRawAxis0( final int axis) {
	return axis;
}

public boolean getBumper(Hand hand) {
    if (hand.equals(Hand.kLeft)) {
      return getRawButton(5);
    } else {
      return getRawButton(6);}}

public boolean getTrigger(Hand hand) {
    return false;
}

public boolean getTop(Hand hand) {
    return false;
  }

public boolean getRawButton(final int button) {
    return getStickButton ((byte) button);
  }
private boolean getStickButton(byte button) {
	return false;
}


public double getTriggerAxis(Hand hand) {
    if (hand.equals(Hand.kLeft)) {
      return getRawAxis(2);
    } else {
      return getRawAxis(3);
    }
  }
private double getRawAxis(int i) {
	return 0;
}

public boolean getAButton() {
    return getRawButton(1);
  }

public boolean getBButton() {
    return getRawButton(2);
  }

public boolean getXButton() {
    return getRawButton(3);
  }

public boolean getYButton() {
    return getRawButton(4);
  }

public boolean getStickButton(Hand hand) {
    if (hand.equals(Hand.kLeft)) {
      return getRawButton(9);
    } else {
      return getRawButton(10);
    }
  }

public boolean getBackButton() {
    return getRawButton(7);
  }

public boolean getStartButton() {
    return getRawButton(8);
  }

 
  public int getPOV(int pov) {
    return getStickPOV(pov);
  }

  private int getStickPOV(int pov) {
	return 0;
}
public int getPOVCount() {
    return getStickPOVCount() ;
  }

  private int getStickPOVCount() {
	return 0;
}
public HIDType getType() {
    return HIDType.values()[getJoystickType()];
  }

  private int getJoystickType() {
	return 0;
}
public String getName() {
    return getJoystickName();
  }

  private String getJoystickName() {
	return null;
}

  public void setOutput(int outputNumber, boolean value) {
	    m_outputs = (m_outputs & ~(1 << (outputNumber - 1))) | ((value ? 1 : 0) << (outputNumber - 1));
	    HAL.setJoystickOutputs((byte) m_outputs, m_leftRumble, m_rightRumble, m_rightRumble);
	  }

	  public void setOutputs(int value) {
	    m_outputs = value;
	    HAL.setJoystickOutputs((byte)  m_outputs, m_leftRumble, m_rightRumble, m_rightRumble);
	  }

	 
	  public void setRumble(RumbleType type, double value) {
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


