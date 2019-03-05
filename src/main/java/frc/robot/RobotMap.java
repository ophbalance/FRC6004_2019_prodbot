/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  //Motor for Lift
  public static final int LIFT_VICTOR = 3 ;

  //Motors for End Effector
  public static final int END_VICTOR_LEFT = 5;
  public static final int END_VICTOR_RIGHT = 6;
  public static final int END_VICTOR_TILT = 7;
  public static final int END_VICTOR_CLAW = 8;

  //Motors for End Game
  public static final int END_GAME_FRONT = 0;
  public static final int END_GAME_REAR = 1;
  public static final int END_GAME_DRIVE = 2;

  // Joysticks and their usages
  public static final int OI_DRIVER_CONTROLLER = 0;
  public static final int OI_OP_CONTROLLER = 1;

  //Driver Controls with Variable Control
  public static final int DRIVER_PITCH = 1;
  public static final int DRIVER_ROLL = 0;
  public static final int DRIVER_YAW = 2;
  public static final int DRIVER_LEVER = 3;

  //OP Controller Variable Control
  public static final int OP_LEFT = 1;
  public static final int OP_RIGHT = 5;
  public static final int OP_YAW = 2;
  public static final int OP_LEVER = 3;
}
