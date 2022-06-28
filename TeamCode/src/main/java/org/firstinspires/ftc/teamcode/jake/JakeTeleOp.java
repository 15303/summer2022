package org.firstinspires.ftc.teamcode.jake;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Robot;

@TeleOp(name="JakeTeleOp")
public class JakeTeleOp extends LinearOpMode {
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

            if (gamepad2.dpad_left) {
                robot.aim(-0.2);
            } else if (gamepad2.dpad_right) {
                robot.aim(0.2);
            } else {
                robot.aim(0);
            }

            if (gamepad2.dpad_up) {
                robot.lift(0.3);
            } else if (gamepad2.dpad_down) {
                robot.lift(-0.3);
            } else {
                continue;
                //robot.lift(0.01);
            }

            robot.spin(gamepad2.right_trigger - gamepad2.left_trigger);

            if (gamepad2.a) {
                robot.grab(-1);
            } else if (gamepad2.b) {
                robot.grab(1);
            } else {
                robot.grab(0);
            }

            telemetry.addData("author", "Charles");
            telemetry.update();


        }
    }
}
