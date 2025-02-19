package frc.robot.commands;

import frc.robot.subsystems.vision.Limelight;
import frc.robot.VisionConstants;
import edu.wpi.first.wpilibj2.command.Command;


/**

 * A simple command that grabs a hatch with the {@link HatchSubsystem}. Written explicitly for

 * pedagogical purposes. Actual code should inline a command this simple with {@link

 * edu.wpi.first.wpilibj2.command.InstantCommand}.

 */

public class LeftReefTrack extends Command {

  // The subsystem the command runs on

  private final Limelight m_Limelight;


  public LeftReefTrack(Limelight subsystem) {
    m_Limelight = subsystem;
    addRequirements(m_Limelight);
  }


  @Override

  public void initialize() {

  }


  @Override

  public boolean isFinished() {

    return true;

  }

}