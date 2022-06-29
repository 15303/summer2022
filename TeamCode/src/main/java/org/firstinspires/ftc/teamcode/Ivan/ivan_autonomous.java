package org.firstinspires.ftc.teamcode.Ivan;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Robot;

@Autonomous(name="Ivan Autonomous")
public class ivan_autonomous extends LinearOpMode {
    public void runOpMode() {
        Robot robot = new Robot(this);

        robot.drive(0.5);
        sleep(1000);
        robot.drive(0);
    }
}

