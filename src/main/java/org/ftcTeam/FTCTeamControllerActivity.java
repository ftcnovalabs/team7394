package org.ftcTeam;

import com.qualcomm.robotcore.eventloop.opmode.OpModeRegister;

import org.firstinspires.ftc.robotcontroller.internal.FtcRobotControllerActivity;
import org.ftcTeam.opmodes.NovaboardRegistrar;

public class FTCTeamControllerActivity extends FtcRobotControllerActivity {


  @Override
  protected OpModeRegister createOpModeRegister() {


      //return new Registrar1();
      //return new Registrar2();
      //return new TrainingBeginnerRegistrar();

      return new NovaboardRegistrar();



  }


}
