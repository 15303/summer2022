package org.firstinspires.ftc.teamcode.Ivan;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Robot;

@TeleOp(name="IvanTeleOp")
public class IvanTeleOp extends LinearOpMode {
    Robot robot;

    @Override
    public void runOpMode() {
        robot = new Robot(this);
        waitForStart();

        while (opModeIsActive()) {
            double drive = -gamepad1.left_stick_y;
            double turn = gamepad1.left_stick_x;
            double strafe = gamepad1.right_stick_x;

            robot.setPowers(drive + turn - strafe, drive - turn + strafe, drive + turn + strafe, drive - turn - strafe);
            robot.aim(gamepad2.left_stick_x);
            robot.lift(gamepad2.left_stick_y);
            if (gamepad2.right_bumper) {
                robot.spin(0.7);
                //TODO: make power negative if spinning other way
            }
            else {
                robot.spin(0);
            }
            robot.grab(gamepad2.right_trigger-gamepad2.left_trigger);
            if (gamepad2.right_trigger==0) {
                robot.grab(0.1);
            }



            telemetry.addData("makeor", "Ivan");
            telemetry.update();

        }
    }
}