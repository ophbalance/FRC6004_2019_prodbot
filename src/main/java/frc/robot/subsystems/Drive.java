package frc.robot.subsystems;

import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;
import frc.robot.commands.*;

public class Drive extends Subsystem {

    //Motor Controller Statements
    Victor leftFront = null;
    Victor leftRear = null;
    Victor rightFront = null;
    Victor rightRear = null;
    
    DifferentialDrive robotDrive = null;

    public Drive() {
        leftFront = new Victor(RobotMap.LEFT_FRONT_VICTOR);
        leftRear = new Victor(RobotMap.LEFT_REAR_VICTOR);
        SpeedControllerGroup m_left = new SpeedControllerGroup(leftFront, leftRear);

        rightFront = new Victor(RobotMap.RIGHT_FRONT_VICTOR);
        rightRear = new Victor(RobotMap.RIGHT_REAR_VICTOR);
        SpeedControllerGroup m_right = new SpeedControllerGroup(rightFront, rightRear);

        robotDrive = new DifferentialDrive(m_left, m_right);
    }
    
    public void arcadeDrive(double leftSpeed, double rightSpeed) {
        robotDrive.arcadeDrive(-rightSpeed, -leftSpeed);
    
    }
    
    
    
    
    protected void initDefaultCommand() {
        setDefaultCommand(new TeleopDrive());
    }

}