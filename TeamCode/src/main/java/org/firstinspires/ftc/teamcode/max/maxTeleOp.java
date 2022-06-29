package org.firstinspires.ftc.teamcode.max;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Robot;

@TeleOp(name="maxTeleOp")
public class maxTeleOp extends LinearOpMode {
    Robot robot;

    double liftInput;
    int liftPause = 0;

    @Override
    public void runOpMode() {
        robot = new Robot(this);
        waitForStart();

        while (opModeIsActive()) {
            double drive = -gamepad1.left_stick_y/3;
            double turn = gamepad1.right_stick_x/3;
            double strafe = -gamepad1.left_stick_x/3;


            robot.setPowers(drive + turn - strafe, drive - turn + strafe, drive + turn + strafe, drive - turn - strafe);

            robot.aim (gamepad2.left_stick_x/2);

            liftInput = gamepad2.right_stick_y/2;
                robot.lift(liftInput);

            if (gamepad2.y) {
                robot.spin(1);
            } else {
                robot.spin(0);
            }

            if (gamepad2.b) {
                robot.grab(-1);
            } else if (gamepad2.a) {
                robot.grab(1);
            } else {
                robot.grab(0);
            }

            telemetry.addData("Author", "Max");
            telemetry.addData("liftPause", liftPause);
            telemetry.addData("liftInput", liftInput);
            telemetry.update();
        }
    }
}
