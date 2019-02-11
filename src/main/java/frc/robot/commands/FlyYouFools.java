package frc.robot.commands;


import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;


public class FlyYouFools extends TimedCommand {


    public FlyYouFools(double timeout) {
    super(timeout);
    requires(Robot.r_drive);
  }

  @Override
  protected void initialize() {
  }
  @Override
  protected void execute() {
    Robot.r_drive.drive(.5, 0);
  }
  @Override
  protected void end() {
    Robot.r_drive.update(0, 0);
  }
}