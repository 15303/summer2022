package org.firstinspires.ftc.teamcode.max;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Robot;

@TeleOp(name="maxTeleOp")
public class maxTeleOp extends LinearOpMode {
    Robot robot;

    @Override
    public void runOpMode() {
        robot = new Robot(this);
        waitForStart();

        while (opModeIsActive()) {
            double drive = -gamepad1.left_stick_y;
            double turn = gamepad1.right_stick_x;
            double strafe = gamepad1.left_stick_x;


            robot.setPowers(drive + turn - strafe, drive - turn + strafe, drive + turn + strafe, drive - turn - strafe);

            robot.aim (gamepad2.left_stick_x);
            robot.lift(gamepad2.right_stick_y);

            if (gamepad2.a) {
                robot.spin(1);
            } else {
                robot.spin(0);
            }

            if (gamepad2.right_trigger > 0) {
                robot.grab(1);
            } else if (gamepad2.left_trigger > 0) {
                robot.grab(1);
            } else {
                robot.grab(0);
            }

            telemetry.addData("Author", "Max");
            telemetry.update();
        }
    }
}
