package org.firstinspires.ftc.teamcode.charles;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Robot;


@Autonomous(name="Charles - Autonomous")
public class CharlesAutonomous extends LinearOpMode {

    public void runOpMode() {
        Robot robot = new Robot(this);

        robot.drive(0.5);
        sleep(1000);
        robot.drive(0);

    }
}
