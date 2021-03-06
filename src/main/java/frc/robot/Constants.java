/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class DriveTrainValues {
        public static final int leftFrontPort = 0;
        public static final int leftBackPort = 1;
        public static final int rightFrontPort = 2;
        public static final int rightBackPort = 3;
        public static final double unnecessarySpeedValue = 0.8;
    }

    public static final class ShooterValues {
        public static final int shooterMotor1Port = 4;
        public static final int shooterMotor2Port = 5;
    }

}
