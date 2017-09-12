package command.remoteControl;

import command.client.GarageDoor;
import command.client.Light;
import command.client.Stereo;
import command.command.Command;
import command.command.impl.*;
import command.remoteCommand.RemoteControl;
import command.remoteCommand.SimpleRemoteControl;

public class RemoteControlTest {
    public static void main(String[] args){
        SimpleRemoteControl remote=new SimpleRemoteControl();
        Light light=new Light();
        LightOnCommand lightOn=new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        GarageDoor garageDoor=new GarageDoor();
        GarageDoorOpenCommand openOn=new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(openOn);
        remote.buttonWasPressed();


        RemoteControl remoteControl=new RemoteControl();
        Light bedLight=new Light("Bed room ");
        Light livingLight=new Light("Living room ");
        garageDoor=new GarageDoor(" dwelling ");
        Stereo stereo=new Stereo("Living room");

       LightOnCommand bedRoomLightOn=new LightOnCommand(bedLight);
       LightOffCommand bedRoomLightoff=new LightOffCommand(bedLight);

       LightOnCommand livingRoomLightOn=new LightOnCommand(livingLight);
       LightOffCommand livingRoomlightOff=new LightOffCommand(livingLight);

       GarageDoorOpenCommand garageDoorOpenCommand=new GarageDoorOpenCommand(garageDoor);
        StereoOnCommand stereoOnCommand=new StereoOnCommand(stereo);

        remoteControl.setCommand(0,livingRoomLightOn,livingRoomlightOff);
        remoteControl.setCommand(1,bedRoomLightOn,bedRoomLightoff);
        remoteControl.setCommand(2,garageDoorOpenCommand,garageDoorOpenCommand);
        remoteControl.setCommand(3,stereoOnCommand,stereoOnCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);

        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        Command[] partyOn={bedRoomLightOn,livingRoomLightOn};
        Command[] partyOff={bedRoomLightoff,livingRoomlightOff};
        MacroCommand partyOnMacro=new MacroCommand(partyOn);
        MacroCommand partyOffMacro=new MacroCommand(partyOff);
       remoteControl.setCommand(0,partyOnMacro,partyOffMacro);
        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
    }

}
