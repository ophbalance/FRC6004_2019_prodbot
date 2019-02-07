package frc.robot.subsystems;

import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.commands.*;

public class EndGame extends Subsystem {
  //Again, it's motor time
  VictorSP front = null;
  VictorSP rear = null;
  VictorSP gotta_go_fast = null;

  @Override
  public void initDefaultCommand() {

    front = new VictorSP(RobotMap.END_GAME_FRONT);
    rear = new VictorSP(RobotMap.END_GAME_REAR);
    gotta_go_fast = new VictorSP(RobotMap.END_GAME_DRIVE);
    
  }

  public void update(double gameSpeed) {

    front.set(gameSpeed);
    rear.set(gameSpeed);
    gotta_go_fast.set(gameSpeed);

  }

  public void down(double gameSpeed) {
    
    front.set(gameSpeed);
    rear.set(gameSpeed);

  }

  public void frontUp(double gameSpeed) {
    
    front.set(-gameSpeed);

  }

  public void rearUp(double gameSpeed) {
    
    rear.set(-gameSpeed);

  }

  public void sanic(double gameSpeed) {
    
    gotta_go_fast.set(gameSpeed);
    
  }
}
