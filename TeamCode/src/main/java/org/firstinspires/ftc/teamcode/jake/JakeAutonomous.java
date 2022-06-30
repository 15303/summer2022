package org.firstinspires.ftc.teamcode.jake;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Robot;

@Autonomous(name = "Jake - Autonomous")
public class JakeAutonomous extends LinearOpMode{
    @Override
    public void runOpMode(){
        Robot robot = new Robot(this);
        waitForStart();

        robot.turn(0.3);
        sleep(1000);
        robot.turn(0);

    }
}
