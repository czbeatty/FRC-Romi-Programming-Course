// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.OnBoardIO;

public class ToggleLightsBasedOnGyro extends CommandBase {
  OnBoardIO m_io;

  public ToggleLightsBasedOnGyro(OnBoardIO io) {
    m_io = io;
    addRequirements(io);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double gyroAngle = m_io.m_drivetrain.m_gyro.getAngleZ();

    if (Math.abs(gyroAngle) < 5) {
      setLightsGreen();
    }
    else {
      setLightsRed();
    }
    
    System.out.println("Gyro angle: " + gyroAngle);
  }

  private void setLightsGreen() {
    m_io.setGreenLed(true);
    m_io.setRedLed(false);
  }

  private void setLightsRed() {
    m_io.setGreenLed(false);
    m_io.setRedLed(true);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
