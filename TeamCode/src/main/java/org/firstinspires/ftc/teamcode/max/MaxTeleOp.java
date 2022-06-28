package org.firstinspires.ftc.teamcode.max;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Robot;

@TeleOp(name="MaxTeleOp")
public class MaxTeleOp extends LinearOpMode {
    Robot robot;

    @Override
    public void runOpMode() {
        robot = new Robot(this);
        waitForStart();

        while (opModeIsActive()) {
            double joystickY = gamepad1.left_stick_y;
            robot.setPowers(joystickY, joystickY, joystickY, joystickY);
                telemetry.addData("Author", "Max");
                telemetry.update();
        }
    }
}
