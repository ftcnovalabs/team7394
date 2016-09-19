package org.ftcTeam.opmodes.novaboard;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.ftcbootstrap.ActiveOpMode;
import org.ftcbootstrap.components.operations.motors.GamePadTankDrive;
import org.ftcTeam.configurations.NovaboardRobot;

/**
 * Use a single  gamepad's joysticks to Tank Drive
 */

@TeleOp
public class GamePadControls2 extends ActiveOpMode {

    private NovaboardRobot robot;
    private GamePadTankDrive tankDrive;

    /**
     * Implement this method to define the code to run when the Init button is pressed on the Driver station.
     */
    @Override
    protected void onInit() {

        robot = NovaboardRobot.newConfig(hardwareMap, getTelemetryUtil());


        getTelemetryUtil().addData("Init", getClass().getSimpleName() + " initialized.");
        getTelemetryUtil().sendTelemetry();

    }

    @Override
    protected void onStart() throws InterruptedException {
        super.onStart();

        //set up tank drive operation to use the gamepad joysticks
        tankDrive = new GamePadTankDrive(this, gamepad1, robot.motor1, robot.motor2);
        tankDrive.startRunMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);


    }


    @Override
    protected void activeLoop() throws InterruptedException {

        tankDrive.update();


        //send any telemetry that may have been added in the above operations
        getTelemetryUtil().sendTelemetry();

    }


}
