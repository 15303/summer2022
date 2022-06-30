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
            double drive = -gamepad1.right_trigger-gamepad1.left_trigger;
            double turn = gamepad1.left_stick_x;
            double strafe = gamepad1.right_stick_x;

            robot.setPowers(drive + turn - strafe, drive - turn + strafe, drive + turn + strafe, drive - turn - strafe);
            robot.aim(gamepad2.left_stick_x/2);
            robot.lift(gamepad2.right_stick_y/2);
            if (gamepad2.right_bumper) {
                robot.spin(0.4);
            }
            else {
                robot.spin(0);
            }
            robot.grab(gamepad2.right_trigger-gamepad2.left_trigger);
            if (gamepad2.right_trigger==0) {
                robot.grab(0.1);
            }
            if (gamepad1.a) {
                robot.drive(1);
            }
            if (gamepad1.b) {
                robot.drive(-0.8);
            }
            telemetry.addData("makeor", "Ivan");
            telemetry.update();

            }

        }
    }
// P1: Right trigger   TODO accelerate/forwards
// P1: Left trigger  TODO backwards
// P1: Joysticks TODO left and right
// P1: A button  TODO boosts forward
// P1: B button  TODO boosts backwards?????
// P1: Left and right bumpers  TODO strafe left and right
// P2: Arm is left stick moving sideways, lifting is right stick moving  TODO vertically.
// P2: Right and left triggers  TODO grabber
// P2: Right bumper  TODO spins duck