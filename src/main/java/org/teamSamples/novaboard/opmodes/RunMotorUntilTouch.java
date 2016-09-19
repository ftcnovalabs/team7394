package org.teamSamples.novaboard.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.ftcbootstrap.ActiveOpMode;
import org.ftcbootstrap.components.operations.motors.MotorToTouch;
import org.ftcbootstrap.demos.beginner.MyFirstBot;
import org.ftcbootstrap.demos.beginner.opmodes.OpMode3RunForTime;
import org.teamSamples.novaboard.NovaboardRobot;

@Autonomous
public class RunMotorUntilTouch extends ActiveOpMode {


    private NovaboardRobot robot;
    private MotorToTouch motorToTouch;

    /**
     * Implement this method to define the code to run when the Init button is pressed on the Driver station.
     */
    @Override
    protected void onInit() {

        robot = NovaboardRobot.newConfig(hardwareMap, getTelemetryUtil());

        //create an operation to control a motor from a touch sensor
        motorToTouch = new MotorToTouch( "motor1" , this, robot.motor1, robot.touch1);


        //Note The Telemetry Utility is designed to let you organize all telemetry data before sending it to
        //the Driver station via the sendTelemetry command
        getTelemetryUtil().addData("Init", getClass().getSimpleName() + " initialized.");
        getTelemetryUtil().sendTelemetry();

    }

    /**
     * Implement this method to define the code to run when the Start button is pressed on the Driver station.
     * This method will be called on each hardware cycle just as the loop() method is called for event based Opmodes
     *
     * @throws InterruptedException
     */
    @Override
    protected void activeLoop() throws InterruptedException {

        //run motor full power (1) until the touch sensor is pressed
        if ( motorToTouch.runToTarget(1)) {
            setOperationsCompleted();
        }

        //send any telemetry that may have been added in the above operations
        getTelemetryUtil().sendTelemetry();

    }

}
