package frc.robot.subsystems;

import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import frc.robot.commands.*;

public class Drive extends Subsystem {

    //Motor Controller Statements
    WPI_TalonSRX leftFront = null;
    VictorSPX leftRear = null;
    WPI_TalonSRX rightFront = null;
    VictorSPX rightRear = null;
    
    DifferentialDrive robotDrive = null;

    public Drive() {
        leftFront = new WPI_TalonSRX(RobotMap.LEFT_FRONT_VICTOR);
        leftRear = new VictorSPX(RobotMap.LEFT_REAR_VICTOR);
        leftRear.follow(leftFront);

        rightFront = new WPI_TalonSRX(RobotMap.RIGHT_FRONT_VICTOR);
        rightRear = new VictorSPX(RobotMap.RIGHT_REAR_VICTOR);
        rightRear.follow(rightFront);

        robotDrive = new DifferentialDrive(leftFront, rightFront);
    }
    
    public void arcadeDrive(double leftSpeed, double rightSpeed) {
        robotDrive.arcadeDrive(-rightSpeed, -leftSpeed);
    
    }
    
    
    
    
    protected void initDefaultCommand() {
        setDefaultCommand(new TeleopDrive());
    }

    public void update(double y, double x) {
      robotDrive.arcadeDrive(y, x);
    }

    public void drive(double y, double x) {
        robotDrive.arcadeDrive(y, x);
    }

}