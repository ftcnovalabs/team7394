package org.teamSamples.novaboard;

import org.ftcbootstrap.BootstrapRegistrar;
import org.ftcbootstrap.demos.TelemetryTest;
import org.teamSamples.novaboard.opmodes.*;


/**
 * Register Op Modes
 */
public class NovaboardRegistry extends BootstrapRegistrar {


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
