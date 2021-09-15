// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;

/**
 * Do NOT add any static variables to this class, or any initialization at all. Unless you know what
 * you are doing, do not modify this file except to change the parameter class to the startRobot
 * call.
 */
public final class Main {
  private Main() {}

  /**
   * Main initialization function. Do not perform any initialization here.
   *
   * <p>If you change your main robot class, change the parameter type.
   */
  public static void main(String... args) {
    int numberOfWheelsOnRobot = 2;
    double robotSpeedInchesPerSecond = 3.1;

    System.out.print("Number of wheels on the robot: ");
    System.out.println(numberOfWheelsOnRobot);

    System.out.print("The robot's current speed: ");
    System.out.println(robotSpeedInchesPerSecond);

    // The robot has stopped! Update the speed to 0 inches per second.
    robotSpeedInchesPerSecond = 0;

    System.out.print("The robot stopped! Now its new speed is: ");
    System.out.println(robotSpeedInchesPerSecond);
    
    RobotBase.startRobot(Robot::new);
  }
}
