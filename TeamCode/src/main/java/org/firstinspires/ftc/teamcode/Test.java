package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Test")
public class Test extends LinearOpMode {
    @Override
    public void runOpMode() {
        DcMotor one = hardwareMap.get(DcMotor.class, "one");
        DcMotor two = hardwareMap.get(DcMotor.class, "two");
        DcMotor thr = hardwareMap.get(DcMotor.class, "thr");
        DcMotor fou = hardwareMap.get(DcMotor.class, "fou");

        waitForStart();

        while (opModeIsActive()) {
            double p = gamepad1.left_stick_y;
            one.setPower(p);
            two.setPower(p);
            thr.setPower(p);
            fou.setPower(p);
        }
    }
}
