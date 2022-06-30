package org.firstinspires.ftc.teamcode.combined;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.Robot;

@Autonomous(name = "Jake - Autonomous")
public class CombinedAutonomous extends LinearOpMode{
    @Override
    public void runOpMode(){
        Robot robot = new Robot(this);
        waitForStart();

        robot.turn(0.3);
        sleep(1000);
        robot.turn(0);

        robot.spin(0.5);
        sleep(3000);
        robot.spin(0);

        robot.turn(-0.3);
        sleep(1000);
        robot.turn(0);

        robot.lift(0.3);
        robot.driveComponent(0.6, 0, -0.1);
        sleep(4000);
        robot.drive(0);
        /*

        robot.drive(-1);
        sleep(1000);
        robot.drive(0);

        sleep(2000);

        robot.turn(1);
        sleep(1000);
        robot.turn(0);

        sleep(2000);

        robot.lift(1);
        sleep(1000);
        robot.lift(0);

        sleep(2000);

        robot.drive(1);
        sleep(5000);
        robot.drive(0);

        sleep(2000);

         */

    }
}
