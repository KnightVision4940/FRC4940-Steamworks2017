package com.frc4940.steamworks2017;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import com.ctre.CANTalon; //currently unused; proper class to import to use the CAN speed controllers

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 * 
 * Essentially, this is the main class that the robot runs off of.
 * Most code will NOT be written here though;
 * we will write all the logic in other classes, and just run a single line here per class to call them
 * 
 * If you are ever confused, Google the answer! Also check on reddit.com/r/frc (or their discord) and/or chiefdelphi.com/forums
 * Still confused? Then post the question on Slack channel and someone will help you out.
 * Have fun!!!
 */
public class Robot extends IterativeRobot {
	/**
	 * VARIABLES
	 */
	final String defaultAuto = "Default";
	final String customAuto = "My Auto";
	String autoSelected;
	SendableChooser<String> chooser = new SendableChooser<>();
	
	Teleop teleop = new Teleop();
	Auto auto = new Auto();
	Vision vision = new Vision();

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		/**
		 * This adds buttons to select autonomous mode on the dashboard
		 */
		chooser.addDefault("Default Auto", defaultAuto);
		chooser.addObject("My Auto", customAuto);
		SmartDashboard.putData("Auto choices", chooser);
		
		DashBoard.board();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString line to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the
	 * switch structure below with additional strings. If using the
	 * SendableChooser make sure to add them to the chooser code above as well.
	 */
	@Override
	public void autonomousInit() {
		autoSelected = chooser.getSelected();
		// autoSelected = SmartDashboard.getString("Auto Selector",
		// defaultAuto);
		System.out.println("Auto selected: " + autoSelected);
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {
		/**
		 * TWO IMPORTANT NOTES ABOUT AUTONOMOUS
		 * 
		 * 1) this runs on a loop, but we've used the autonomousInit() method
		 * 		in years past. i kinda wanna try using this method this year tho.
		 * 
		 * 2) Don't write the code directly in here, but in a seperate Autonomous class. all that we write here
		 * 		will be a single function call, where we pass in the string autoSelected and do all this in that class
		 */
		switch (autoSelected) {
		case customAuto:
			// Put custom auto code here
			break;
		case defaultAuto:
		default:
			// Put default auto code here
			break;
		}
	}
	
	/**
	 * This function initializes teleop
	 */
	@Override
	public void teleopInit(){
		teleop.init();
	}

	/**
	 * This function is called periodically during operator control
	 * Put all the driver code in here
	 */
	@Override
	public void teleopPeriodic() {
		 teleop.run();
		 vision.run(teleop.getGyroAngle());
	}
	
	
	
	/**
	 * This function is called when test mode is initiated
	 */
	@Override
	public void testInit() {
		
	}

	/**
	 * This function is called periodically during test mode
	 */
	@Override
	public void testPeriodic() {
		
	}
}
//stew was here ;)
