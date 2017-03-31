package com.frc4940.steamworks2017;

public class Map {
	
	//everything used to control the parts of the robot will be contained here and statically accessed elsewhere
	public static DriveTrain drive = new DriveTrain();
	public static BallscrewMotors ballscrew = new BallscrewMotors(Map.CAN.BALLSCREW, 
																	Map.PWM.ROLLER_1, 
																	Map.PWM.ROLLER_2);
	public static WinchClimber climber = new WinchClimber(Map.CAN.WINCH);
	
	public static void set(int _variable, int _value){
		_variable = _value;

	}
	public class Limit{
		public static final int UPPERARMLIMIT = 0;
		public static final int BALLSCREW_INNER_LIMIT = 1;
		public static final int BALLSCREW_MAX = 2;
	}
		
	public class PWM{		
		//Drivetrain.java
		public static final int LEFTFRONTWHEEL = 6;
		public static final int RIGHTFRONTWHEEL = 1;
		public static final int LEFTBACKWHEEL = 3;
		public static final int RIGHTBACKWHEEL = 0;
		public static final int ROLLER_1 = 4;
		public static final int ROLLER_2 = 5;
	}
	public class CAN{
		public static final int BALLSCREW = 2;
		public static final int WINCH = 1;
	}
	
	public class Auto{
		public static final int DRIVE_FORWARD = 0;
		public static final int LEFTBOILERFAR = 1;
		public static final int LEFTBOILERMID = 2;
		public static final int LEFTBOILERCLOSE = 3;
		public static final int RIGHTBOILERFAR = 4;
		public static final int RIGHTBOILERMID = 5;
		public static final int RIGHTBOILERCLOSE = 6;
		public static final int GEARONE = 7;
		public static final int GEARTWO = 8;
		public static final int GEARTHREE = 99;
	}
	
	public class Encoder{
		public static final int ENC_SCALE = 800;
		public static final int ENC_HEIGHT = 500;
		public static final int ENC_LIMIT_SWITCH = -375;
		public static final int ENC_BALLSCREW_MAX_IN = 0;
		public static final int ENC_ARM_OFFSET = 107820;
	}

			
}



	