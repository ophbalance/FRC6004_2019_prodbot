/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.*;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;



public class EndEffect extends Subsystem {
  
  //Motor Time!
  Victor left = null;
  Victor right = null;
  Victor swivel = null;
  Victor in_n_out = null;

  SpeedControllerGroup mover = new SpeedControllerGroup(left, right);
  
  public void initDefaultCommand() {
    setDefaultCommand(new EffectorGo());
  }

  public void away(double endSpeed) {
    mover.set(-endSpeed);
  }

  public void go(double endSpeed) {
    mover.set(endSpeed);
  }
}