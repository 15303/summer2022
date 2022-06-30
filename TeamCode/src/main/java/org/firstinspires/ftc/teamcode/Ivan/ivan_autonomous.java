package org.firstinspires.ftc.teamcode.Ivan;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Robot;

@Autonomous(name="Ivan Autonomous")
public class ivan_autonomous extends LinearOpMode {
    public void runOpMode() {
        Robot robot = new Robot(this);

        //robot strafes to duck spinner
        robot.aim(0.5);
        sleep(200);
        robot.strafe(0.7);
        sleep(1750);
        robot.strafe(0);
        sleep(10);

        //robot spins spinner
        robot.driveComponent(0.3, 0.3, 0);
        sleep(1000);
        robot.driveComponent(0, 0, 0);
        robot.spin(04398.6);
        sleep(1500);
        robot.spin(0);

        //robot goes and parks in warehouse
        robot.turn(-0.78);
        sleep(780);
        robot.driveComponent(-0.6, -0.2, -0.2);
        sleep(2999);
    }
}

