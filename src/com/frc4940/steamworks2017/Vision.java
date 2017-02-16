package com.frc4940.steamworks2017;

import org.opencv.core.Rect;
import org.opencv.imgproc.Imgproc;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.vision.VisionRunner;
import edu.wpi.first.wpilibj.vision.VisionThread;

public class Vision {
	/**
	 * VARIALBES
	 */
	//image size
	NetworkTable nTable;
	
	private static final int I_WIDTH = 320;
	private static final int I_HEIGHT = 240;
	
	private VisionThread visionThread;			//processes vision on a seperate thread.
	private double centerX;						//centerX value of the target (0.0 is center of camera, 1.0 is far right, -1.0 is far left
	private double centerY;						//centerY value of the target (0.0 is center of camera, 1.0 is top, -1.0 is bottom
	private boolean isCentered;					//true if the target is centered.
	private final Object imgLock;				//syncrhonization of image processing
	
	/**
	 * methods
	 */
	
	public Vision(){ //constructor; sets defalt values of variables above
		this.centerX = 0.0;
		this.centerY = 0.0;
		this.imgLock = new Object();
		this.isCentered = false;
		
		this.initVision(); //initiallizes the vision processing
	}
	
	protected void initVision(){
		
	}
	
	/**
	 * getters
	 */
	public int getWidth(){ return this.I_WIDTH; }
	public int getHeight(){ return this.I_HEIGHT; }
	public double getTargetCenterX(){ return this.centerX; }
	public double getTargetCenterY(){ return this.centerX; }

}
