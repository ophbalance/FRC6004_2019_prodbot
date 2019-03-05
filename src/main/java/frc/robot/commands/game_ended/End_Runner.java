package frc.robot.commands.game_ended;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;

public class End_Runner extends CommandGroup {
    public End_Runner() {
      addSequential(new EndDown(3.0));
      addSequential(new EndSanic(2.0));
      addSequential(new EndFrontUp(3.0));
      //addSequential(new FlyYouFools(1.0));
      addSequential(new EndRearUp(3.0));
      //addSequential(new FlyYouFools(1.0));
    }
  }