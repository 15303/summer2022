package org.firstinspires.ftc.teamcode.jake;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Robot;

@TeleOp(name="Test")
public class JakeTeleOp extends LinearOpMode {
    Robot robot;

    @Override
    public void runOpMode() {
        robot = new Robot(this);
        waitForStart();

        while (opModeIsActive()) {
            double joystickY = gamepad1.left_stick_y;
            robot.setPowers(joystickY, joystickY, joystickY, joystickY);
            if (gamepad1.dpad_left) {
                robot.frontLeft.setPower(1);
            }

        }
    }
}
