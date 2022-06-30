package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Robot {
    private OpMode opMode;

    public DcMotor frontLeft;
    public DcMotor frontRight;
    public DcMotor backLeft;
    public DcMotor backRight;

    public DcMotor aimer;
    public DcMotor lifter;
    public DcMotor spinner;

    public CRServo grabber;

    public BNO055IMU imu;

    public Robot(OpMode opMode) {
        this.opMode = opMode;
        frontLeft = opMode.hardwareMap.get(DcMotor.class, "front_left");
        frontRight = opMode.hardwareMap.get(DcMotor.class, "front_right");
        backLeft = opMode.hardwareMap.get(DcMotor.class, "back_left");
        backRight = opMode.hardwareMap.get(DcMotor.class, "back_right");

        aimer = opMode.hardwareMap.get(DcMotor.class, "aimer");
        lifter = opMode.hardwareMap.get(DcMotor.class, "lifter");
        spinner = opMode.hardwareMap.get(DcMotor.class, "spinner");

        grabber = opMode.hardwareMap.get(CRServo.class, "grabber");

        imu = opMode.hardwareMap.get(BNO055IMU.class, "imu");

        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeft.setDirection(DcMotorSimple.Direction.REVERSE);

        lifter.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        lifter.setDirection(DcMotorSimple.Direction.REVERSE);
        lifter.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        aimer.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    public void start() {

    }

    public void setPowers(double fl, double fr, double bl, double br) {
        frontLeft.setPower(fl);
        frontRight.setPower(fr);
        backLeft.setPower(bl);
        backRight.setPower(br);
    }

    public void drive(double power) {
        setPowers(power, power, power, power);
    }

    public void turn(double power) {
        setPowers(power, -power, power, -power);
    }

    public void strafe(double power) {
        setPowers(power, -power, -power, power);
    }

    public void driveComponent(double drive, double turn, double strafe) {
        setPowers(
                drive + turn + strafe,
                drive - turn - strafe,
                drive + turn - strafe,
                drive - turn + strafe
        );
    }

    public void aim(double power) {
        aimer.setPower(power);
    }

    public void lift(double power) {
        lifter.setPower(power);
    }

    public void spin(double power) {
        spinner.setPower(power);
    }

    public void grab(double power) {
        grabber.setPower(power);
    }

    public double getFacing() {
        return imu.getAngularOrientation().firstAngle;
    }

}
