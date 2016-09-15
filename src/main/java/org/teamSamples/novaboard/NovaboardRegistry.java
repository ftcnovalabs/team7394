package org.teamSamples.novaboard;

import org.ftcbootstrap.BootstrapRegistrar;
import org.ftcbootstrap.demos.TelemetryTest;
import org.teamSamples.novaboard.opmodes.GamePadControls;
import org.teamSamples.novaboard.opmodes.RunMotorForTime;


/**
 * Register Op Modes
 */
public class NovaboardRegistry extends BootstrapRegistrar {


  protected Class[] getOpmodeClasses() {
    Class[] classes = {

            GamePadControls.class,
            RunMotorForTime.class,
            TelemetryTest.class

    };

    return classes;
  }


}
