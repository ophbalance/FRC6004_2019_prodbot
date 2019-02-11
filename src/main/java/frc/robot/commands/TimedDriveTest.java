package frc.robot.commands;


import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;
import frc.robot.subsystems.*;

public class TimedDriveTest extends TimedCommand {

  private static final Drive DRIVE = Robot.r_drive;


  public TimedDriveTest(double timeout) {
    super(timeout);
    requires(DRIVE);
  }

  @Override
  protected void initialize() {
    DRIVE.drive(.25);
  }

  @Override
  protected void end() {
    DRIVE.update(0);
  }
}