package org.firstinspires.ftc.teamcode.max;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Robot;

@Autonomous(name="Max - Autonomous")
public class maxAutonomous extends LinearOpMode {

    public void runOpMode() {
        Robot robot = new Robot(this);

        robot.lift(0.1);
        robot.drive(-0.5);
        sleep(1000);
        robot.turn(0.5);
        sleep(100);
        robot.spin(0.5);
        sleep(5000);
        robot.turn(-0.5);
        sleep(100);
        robot.drive(0.8);
        sleep(3000);
        robot.turn(0.5);
        sleep(200);
        robot.drive(0);
    }

}