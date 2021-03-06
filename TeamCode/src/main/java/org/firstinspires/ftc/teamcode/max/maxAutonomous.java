package org.firstinspires.ftc.teamcode.max;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Robot;

@Autonomous(name="Max - Autonomous")
public class maxAutonomous extends LinearOpMode {

    public void runOpMode() {
        Robot robot = new Robot(this);

        waitForStart();

        robot.lift(0.1);
        sleep(1000);
        robot.lift(0);
        robot.drive(-0.5);
        sleep(1000);
        robot.drive(0);
        robot.turn(0.3);
        sleep(2000);
        robot.turn(0);
        robot.spin(0.5);
        sleep(5000);
        robot.spin(0);
        robot.turn(-0.3);
        sleep(2000);
        robot.turn(0);
        robot.drive(0.8);
        sleep(3000);
        robot.drive(0);
        robot.turn(0.3);
        sleep(4000);
        robot.turn(0);
    }

}