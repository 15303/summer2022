package org.firstinspires.ftc.teamcode.max;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Robot;

@Autonomous(name="Max - Autonomous")
public class maxAutonomous extends LinearOpMode {

    public void runOpMode() {
        Robot robot = new Robot(this);

        robot.lift(0.2);
        robot.drive(-0.5);
        sleep(600);
        robot.turn(0.5);
        sleep(300);
        robot.spin(0.5);
        sleep(5000);
        robot.turn(-0.5);
        sleep(300);
        robot.drive(0.8);
        sleep(3000);
        robot.turn(0.5);
        sleep(500);
        robot.drive(0);



    }
}