//Root Package
package frc.robot.commands;

//Local
import frc.robot.subsystems.SwerveSubsystem;
//Libraries
import edu.wpi.first.wpilibj2.command.CommandBase;
import java.util.Objects;

public class TeleoperatedDriveCommand extends CommandBase
{
  //Suppress Warnings
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})


  //Instance Variables
  private final SwerveSubsystem Parent_Subsystem;


  //Pre-Defined
  private boolean Command_Complete;


  //Constructors
  public TeleoperatedDriveCommand(SwerveSubsystem Parent, double Left_X, double Left_Y, double Right_X)
  {
    //Define Instances
    Parent_Subsystem = Parent;
    Command_Complete = false;
    //Add Command To Subsystem
    addRequirements(Parent_Subsystem);
  }

  //Initialize Command
  @Override
  public void initialize() {}

  //Execute Command
  @Override
  public void execute() {}

  //End Command
  @Override
  public void end(boolean interrupted) 
  {
    if(Objects.equals(interrupted,true)){Command_Complete = true;}
  }

  //Check Command Complete
  @Override
  public boolean isFinished() {
    return Command_Complete;
  }
}

