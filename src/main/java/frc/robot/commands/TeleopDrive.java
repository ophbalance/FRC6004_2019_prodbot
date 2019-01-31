package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TeleopDrive extends Command {

    public TeleopDrive() {
    		requires(Robot.r_drive);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    		double pitch = deadband(Robot.m_oi.driverController.getRawAxis(RobotMap.DRIVER_PITCH),.1);
    		double yaw = deadband(Robot.m_oi.driverController.getRawAxis(RobotMap.DRIVER_YAW),.1);
    		//boolean twitch = true;
    		Robot.r_drive.arcadeDrive(pitch, yaw);
    }
    public double deadband(double JoystickValue, double DeadbandCutOff) {
    	double deadbandreturn = 0;
    	if (JoystickValue<DeadbandCutOff&&JoystickValue>(DeadbandCutOff*(-1))) {
    		deadbandreturn = 0 ;
    	}
    	else {
    		deadbandreturn = (JoystickValue-(Math.abs(JoystickValue)/JoystickValue*DeadbandCutOff))/(1-DeadbandCutOff);
    	}
    	return deadbandreturn;
    }
     
    
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    		Robot.r_drive.arcadeDrive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    		end();
    }
}