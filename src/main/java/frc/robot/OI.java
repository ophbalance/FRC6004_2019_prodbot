/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import frc.robot.commands.effector.*;
import frc.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  
  public Joystick driverController = new Joystick(RobotMap.OI_DRIVER_CONTROLLER);
  public Joystick opController = new Joystick(RobotMap.OI_OP_CONTROLLER);
  
  //public Button upLift = new JoystickButton(opController, 5);

  //End Effector Buttons for Player Usage
  public Button effectOpen = new JoystickButton(opController, 7);
  public Button effectClose = new JoystickButton(opController, 8);
  public Button effectForward = new JoystickButton(opController, 9);
  public Button effectBackward = new JoystickButton(opController, 10);
  public Button effectTiltUp = new JoystickButton(opController, 11);
  public Button effectTiltDown = new JoystickButton(opController, 12);

  //public Button driveTest = new JoystickButton(opController, 1);

  //End Game Buttons for Player Usage
  public Button endGo = new JoystickButton(opController, 1);
  public Button endRearDown = new JoystickButton(opController, 2);
  public Button endRearUp = new JoystickButton(opController, 3);
  public Button endFrontUp = new JoystickButton(opController, 4);
  public Button endFrontDown = new JoystickButton(opController, 5);
  public Button endDown = new JoystickButton(opController, 6);
  public OI () {

    //upLift.whileHeld(new LiftUp());

    //whileHeld for all End Effector Buttons
    effectOpen.whileHeld(new EffectOpen());
    effectClose.whileHeld(new EffectClose());
    effectForward.whileHeld(new EffectorGo());
    effectBackward.whileHeld(new EffectorRunAway());
    effectTiltUp.whileHeld(new EffectUp());
    effectTiltDown.whileHeld(new EffectDown());
    
    //whileHeld for the EndGame mech, also known as Thanos kills half of all lifeforms
    endGo.whileHeld(new EndSanic());
    endRearDown.whileHeld(new EndRearDown());
    endRearUp.whileHeld(new EndRearUp());
    endFrontUp.whileHeld(new EndFrontUp());
    endFrontDown.whileHeld(new EndFrontDown());
    endDown.whileHeld(new EndDown());
  }
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
