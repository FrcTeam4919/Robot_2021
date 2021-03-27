package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.Intake;

public class ShooterIntake extends Command{
    private boolean isFinished = false;
    public ShooterIntake(){
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return isFinished;
    }

    @Override
    protected void execute() {
        Intake.succ();
    }

    @Override
    protected void end() {
        Intake.stop();
    }
    public ShooterIntake Stop() {
        isFinished = true;
        return this;
    }
}
