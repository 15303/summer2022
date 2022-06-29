package org.firstinspires.ftc.teamcode.charles;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Robot;


@Autonomous(name="Charles - Autonomous")
public class CharlesAutonomous extends LinearOpMode {

    public void runOpMode() {
        Robot robot = new Robot(this);

        waitForStart();

        //drive away from wall to carousel
        robot.driveComponent(-0.5, -0.1, 0);
        sleep(400);
        robot.driveComponent(-0.5, 0.1, 0);
        sleep(700);
        robot.drive(-0.5);
        sleep(200);
        robot.drive(0);

        //spin carousel
        robot.spin(0.3);
        sleep(4000);
        robot.spin(0);

        //drive to warehouse
        robot.driveComponent(0.5, -0.2, 0);
        sleep(500);
        robot.drive(0.5);
        sleep(4000);
        robot.drive(0);

    }
}
