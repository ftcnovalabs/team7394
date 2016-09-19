package org.ftcTeam.opmodes;

import org.ftcTeam.opmodes.novaboard.GamePadControls;
import org.ftcTeam.opmodes.novaboard.GamePadControls2;
import org.ftcTeam.opmodes.novaboard.RunMotorForTime;
import org.ftcTeam.opmodes.novaboard.RunMotorUntilTouch;
import org.ftcbootstrap.BootstrapRegistrar;
import org.ftcbootstrap.demos.TelemetryTest;


/**
 * Register Op Modes
 */
public class NovaboardRegistrar extends BootstrapRegistrar {


  protected Class[] getOpmodeClasses() {
    Class[] classes = {

            GamePadControls.class,
            GamePadControls2.class,
            RunMotorForTime.class,
            RunMotorUntilTouch.class,
            TelemetryTest.class

    };

    return classes;
  }


}
