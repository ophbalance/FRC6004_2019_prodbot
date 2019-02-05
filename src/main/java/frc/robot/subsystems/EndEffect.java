/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.*;
import edu.wpi.first.wpilibj.Spark;
import frc.robot.RobotMap;



public class EndEffect extends Subsystem {
  
  //Motor Time!
  Spark left = null;
  Spark right = null;
  Spark swivel = null;
  Spark in_n_out = null;

  public void initDefaultCommand() {

    left = new Spark(RobotMap.END_VICTOR_LEFT);
    right = new Spark(RobotMap.END_VICTOR_RIGHT);
    swivel = new Spark(RobotMap.END_VICTOR_TILT);
    in_n_out = new Spark(RobotMap.END_VICTOR_CLAW);

    setDefaultCommand(new EffectorGo());
  }
  public void update(double endSpeed) {
   left.set(endSpeed);
   right.set(endSpeed);
  }

  public void away(double endSpeed) {
    left.set(-endSpeed);
    right.set(-endSpeed);
  }

  public void go(double endSpeed) {
    left.set(endSpeed);
    right.set(endSpeed);
  }
  
  public void tiltUp(double endSpeed) {
    swivel.set(endSpeed);
  }

  public void tiltDown(double endSpeed) {
    swivel.set(-endSpeed);
  }

  public void close(double endSpeed) {
    in_n_out.set(endSpeed);
  }

  public void open(double endSpeed) {
    in_n_out.set(-endSpeed);
  }

}