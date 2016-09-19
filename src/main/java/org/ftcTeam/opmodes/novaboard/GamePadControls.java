package org.ftcTeam.opmodes.novaboard;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.ftcbootstrap.ActiveOpMode;
import org.ftcbootstrap.components.operations.motors.GamePadMotor;
import org.ftcbootstrap.components.operations.servos.GamePadServo;
import org.ftcTeam.configurations.NovaboardRobot;


@TeleOp
public class GamePadControls extends ActiveOpMode {

    private NovaboardRobot robot;
    private GamePadMotor motorFromStick;
    private GamePadServo yaServo;
    private GamePadServo xbServo;

    /**
     * Implement this method to define the code to run when the Init button is pressed on the Driver station.
     */
    @Override
    protected void onInit() {

        robot = NovaboardRobot.newConfig(hardwareMap, getTelemetryUtil());

        //Note The Telemetry Utility is designed to let you organize all telemetry data before sending it to
        //the Driver station via the sendTelemetry command
        getTelemetryUtil().addData("Init", getClass().getSimpleName() + " initialized.");
        getTelemetryUtil().sendTelemetry();

    }

    @Override
    protected void onStart() throws InterruptedException {
        super.onStart();

        motorFromStick = new GamePadMotor(this,  gamepad1, robot.motor1, GamePadMotor.Control.LEFT_STICK_Y);

        //operate the claw with GamePadServo.Control. Use the X and B buttons for up and down and the  X and B buttons for left and right
        //claw = new GamePadClaw(this, gamepad1, robot.leftservo, robot.rightservo, GamePadServo.Control.X_B, 0.8);
        yaServo = new GamePadServo(this,gamepad1,robot.servo1, GamePadServo.Control.Y_A , 0.0 );
        xbServo = new GamePadServo(this,gamepad1,robot.servo2, GamePadServo.Control.X_B , 0.0 );

    }

    /**
     * Implement this method to define the code to run when the Start button is pressed on the Driver station.
     * This method will be called on each hardware cycle just as the loop() method is called for event based Opmodes
     *
     * @throws InterruptedException
     */
    @Override
    protected void activeLoop() throws InterruptedException {

        //update the motors with the gamepad joystick values
        motorFromStick.update();
        yaServo.update();
        xbServo.update();

        //send any telemetry that may have been added in the above operations
        getTelemetryUtil().sendTelemetry();



    }

}
