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
            if (gamepad2.dpad_right) {
                robot.aim(0.5);
            }
            else{
                robot.aim(0); }
            if (gamepad2.dpad_up) {
                robot.lift(0.5);
            }
            else if (gamepad2.dpad_down)
            {
                robot.lift(-0.5);
            }
            else {
                robot.lift(0);
            }
            if (gamepad2.right_bumper) {
                robot.spin(0.7);
                //TODO: make power negative if spinning other way
            }
            else {
                robot.spin(0);
            }

            telemetry.addData("makeor", "Ivan");
            telemetry.update();

        }
    }
}