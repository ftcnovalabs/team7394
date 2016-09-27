package org.ftcTeam;

import com.qualcomm.robotcore.eventloop.opmode.OpModeRegister;


import org.ftcbootstrap.components.phone.AccelerometerComponent;
import org.firstinspires.ftc.robotcontroller.internal.FtcRobotControllerActivity;
import org.ftcTeam.opmodes.*;

public class FTCTeamControllerActivity extends FtcRobotControllerActivity {


  @Override
  protected OpModeRegister createOpModeRegister() {


      //return new Registrar1();
      //return new Registrar2();
      return new NovaboardRegistrar();



  }


}
