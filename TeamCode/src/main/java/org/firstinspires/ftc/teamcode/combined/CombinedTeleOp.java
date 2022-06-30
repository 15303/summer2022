package org.firstinspires.ftc.teamcode.combined;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Robot;

@TeleOp(name="CombinedTeleOp")
public class CombinedTeleOp extends LinearOpMode {
    Robot robot;

    double liftInput;
    int liftPause = 0;
    boolean isGrabbing;

    @Override
    public void runOpMode() {
        robot = new Robot(this);
        waitForStart();

        while (opModeIsActive()) {
            double drive = (gamepad1.right_trigger - gamepad1.left_trigger);
            double turn = gamepad1.right_stick_x;
            double strafe = -gamepad1.left_stick_x;

//            robot.setPowers(drive + turn - strafe, drive - turn + strafe, drive + turn + strafe, drive - turn - strafe);
            robot.driveComponent(drive, turn, strafe);

            robot.aim (-gamepad2.left_stick_x/2);
            liftInput = gamepad2.left_stick_y/2;
                robot.lift(liftInput);

            if (gamepad2.y) {
                robot.spin(1);
            } else {
                robot.spin(0);
            }

            if (gamepad2.a) {
                robot.grab(-1);
                isGrabbing = true;
            } else if (gamepad2.b) {
                robot.grab(1);
                isGrabbing = false;
            } else {
                if (isGrabbing) {
                    robot.grab(-0.2);
                }
            }

            telemetry.addData("Author", "Combined");
            telemetry.addData("liftPause", liftPause);
            telemetry.addData("liftInput", liftInput);
            telemetry.update();
        }
    }
}
