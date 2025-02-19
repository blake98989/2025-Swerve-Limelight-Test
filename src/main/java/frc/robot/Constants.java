// Copyright 2021-2025 FRC 6328
// http://github.com/Mechanical-Advantage
//
// This program is free software; you can redistribute it and/or
// modify it under the terms of the GNU General Public License
// version 3 as published by the Free Software Foundation or
// available in the root directory of this project.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU General Public License for more details.

package frc.robot;

import edu.wpi.first.wpilibj.RobotBase;
import edu.wpi.first.math.util.Units;


/**
 * This class defines the runtime mode used by AdvantageKit. The mode is always "real" when running
 * on a roboRIO. Change the value of "simMode" to switch between "sim" (physics sim) and "replay"
 * (log replay from a file).
 */
public final class Constants {
  public static final Mode simMode = Mode.SIM;
  public static final Mode currentMode = RobotBase.isReal() ? Mode.REAL : simMode;


  public static final class CoralSubsystemConstants {
    public static final int kElevatorMotorCanId = 31;
    public static final int kArmMotorCanId = 34;
    public static final int kIntakeMotorCanId = 35;
  
    public static final class ElevatorSetpoints {
      public static final int kFeederStation = 0;
      public static final int kLevel1 = 0;
      public static final int kLevel2 = 0;
      public static final int kLevel3 = 100;
      public static final int kLevel4 = 150;
    }
  
    public static final class ArmSetpoints {
      public static final double kFeederStation = -33;
      public static final double kLevel1 = 0;
      public static final double kLevel2 = -2;
      public static final double kLevel3 = -2;
      public static final double kLevel4 = -19;
    }
  
    public static final class IntakeSetpoints {
      public static final double kForward = 0.5;
      public static final double kReverse = -0.5;
    }
  }
  
  public static final class AlgaeSubsystemConstants {
    public static final int kIntakeMotorCanId = 33;
    public static final int kPivotMotorCanId = 32;
  
    public static final class ArmSetpoints {
      public static final double kStow = -4.178;
      public static final double kHold = -6.203;
      public static final double kDown = 0;
    }
  
    public static final class IntakeSetpoints {
      public static final double kForward = 0.5;
      public static final double kReverse = -0.5;
      public static final double kHold = 0.25;
    }
  }

  public static final class SimulationRobotConstants {
    public static final double kPixelsPerMeter = 20;
  
    public static final double kElevatorGearing = 25; // 25:1
    public static final double kCarriageMass =
        4.3 + 3.15 + 0.151; // Kg, arm + elevator stage + chain
    public static final double kElevatorDrumRadius = 0.0328 / 2.0; // m
    public static final double kMinElevatorHeightMeters = 0.922; // m
    public static final double kMaxElevatorHeightMeters = 1.62; // m
  
    public static final double kArmReduction = 60; // 60:1
    public static final double kArmLength = 0.433; // m
    public static final double kArmMass = 4.3; // Kg
    public static final double kMinAngleRads =
        Units.degreesToRadians(-50.1); // -50.1 deg from horiz
    public static final double kMaxAngleRads =
        Units.degreesToRadians(40.9 + 180); // 40.9 deg from horiz
  
    public static final double kIntakeReduction = 135; // 135:1
    public static final double kIntakeLength = 0.4032262; // m
    public static final double kIntakeMass = 5.8738; // Kg
    public static final double kIntakeMinAngleRads = Units.degreesToRadians(80);
    public static final double kIntakeMaxAngleRads = Units.degreesToRadians(180);
    public static final double kIntakeShortBarLength = 0.1524;
    public static final double kIntakeLongBarLength = 0.3048;
    public static final double kIntakeBarAngleRads = Units.degreesToRadians(-60);
    
  }

  public static final class OIConstants {
    public static final int kDriverControllerPort = 0;
    public static final double kDriveDeadband = 0.1;
    public static final double kTriggerButtonThreshold = 0.2;
  }



  public static enum Mode {
    /** Running on a real robot. */
    REAL,

    /** Running a physics simulator. */
    SIM,

    /** Replaying from a log file. */
    REPLAY
  }
}
