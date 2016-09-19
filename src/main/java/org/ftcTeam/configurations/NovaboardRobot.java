package org.ftcTeam.configurations;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;

import org.ftcbootstrap.RobotConfiguration;
import org.ftcbootstrap.components.utils.TelemetryUtil;

/**
 * NovaboardRobot Saved Configuration
 * <p/>
 * It is assumed that there is a configuration on the phone running the Robot Controller App with the same name as this class and
 * that  configuration is the one that is marked 'activated' on the phone.
 * It is also assumed that the device names in the 'init()' method below are the same  as the devices named for the
 * saved configuration on the phone.
 */
public class NovaboardRobot extends RobotConfiguration {

    //sensors
    public TouchSensor touch1;


    //motors
    public DcMotor motor1;
    public DcMotor motor2;
    public Servo servo1;
    public Servo servo2;


    /**
     * Factory method for this class
     *
     * @param hardwareMap
     * @param telemetryUtil
     * @return
     */
    public static NovaboardRobot newConfig(HardwareMap hardwareMap, TelemetryUtil telemetryUtil) {

        NovaboardRobot config = new NovaboardRobot();
        config.init(hardwareMap, telemetryUtil);
        return config;

    }

    /**
     * Assign your class instance variables to the saved device names in the hardware map
     *
     * @param hardwareMap
     * @param telemetryUtil
     */
    @Override
    protected void init(HardwareMap hardwareMap, TelemetryUtil telemetryUtil) {

        setTelemetry(telemetryUtil);


        touch1 = (TouchSensor) getHardwareOn("touch1", hardwareMap.touchSensor);

        servo1 = (Servo) getHardwareOn("servo1", hardwareMap.servo);
        servo2 = (Servo) getHardwareOn("servo2", hardwareMap.servo);
        motor1 = (DcMotor) getHardwareOn("motor1", hardwareMap.dcMotor);
        motor2 = (DcMotor) getHardwareOn("motor2", hardwareMap.dcMotor);
        motor2.setDirection(DcMotor.Direction.REVERSE);

    }


}
