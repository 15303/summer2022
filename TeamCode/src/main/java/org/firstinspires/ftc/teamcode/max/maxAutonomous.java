package org.firstinspires.ftc.teamcode.max;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Robot;

@Autonomous(name="Max - Autonomous")
public class maxAutonomous extends LinearOpMode {

    public void runOpMode() {
        Robot robot = new Robot(this);

        robot.drive(0.5);
        sleep(1000);
        robot.drive(0);


    }
}