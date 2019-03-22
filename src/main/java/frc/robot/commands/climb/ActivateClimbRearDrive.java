/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.climb;

import frc.robot.subsystems.ClimbRearDrive;

import edu.wpi.first.wpilibj.command.Command;

public class ActivateClimbRearDrive extends Command {

    private double _speed;

    public ActivateClimbRearDrive(double speed) {
        requires(ClimbRearDrive.getInstance());
        _speed = speed;
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
        ClimbRearDrive.getInstance().setClimbRearDriveMotor(_speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return true;
    }

    @Override
    protected void interrupted() {
        ClimbRearDrive.getInstance().setClimbRearDriveMotor(0.0);
    }

}