package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Drive {
    DcMotor lf;
    DcMotor rf;
    DcMotor rb;
    DcMotor lb;

    public Drive(OpMode opMode, String lf, String rf, String rb, String lb) {
        this.lf = opMode.hardwareMap.get(DcMotor.class, lf);
        this.lb = opMode.hardwareMap.get(DcMotor.class, lb);
        this.rf = opMode.hardwareMap.get(DcMotor.class, rf);
        this.rb = opMode.hardwareMap.get(DcMotor.class, rb);
    }
}
