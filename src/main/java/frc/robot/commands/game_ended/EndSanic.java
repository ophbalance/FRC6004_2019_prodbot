package frc.robot.commands.game_ended;

import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class EndSanic extends TimedCommand {
  public EndSanic(double timeout) {
    // Use requires() here to declare subsystem dependencies
    super(timeout);
    requires(Robot.r_gamer_time);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.r_gamer_time.sanic(.50);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    Robot.r_gamer_time.update(0);
  }
}