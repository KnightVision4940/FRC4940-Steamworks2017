package com.frc4940.steamworks2017;

public class Map {
	
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
			public static final int LEFTFRONTWHEEL = 1;
			public static final int RIGHTFRONTWHEEL = 3;
			public static final int LEFTBACKWHEEL = 0;
			public static final int RIGHTBACKWHEEL = 2;
			public static final int ROLLER_1 = 4;
			public static final int ROLLER_2 = 5;
	}
	public class CAN{
		public static final int BALLSCREW = 0;
		public static final int WINCH = 1;
	}
	
	public class Auto{  
		
		
		public static final int TEST_AUTO = 999;
	}
	
	public class Encoder{
		public static final int ENC_SCALE = 800;
		public static final int ENC_HEIGHT = 500;
		public static final int ENC_LIMIT_SWITCH = -375;
		public static final int ENC_BALLSCREW_MAX_IN = 0;
		public static final int ENC_ARM_OFFSET = 107820;
	}

			
}

