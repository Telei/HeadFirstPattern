package command.client;

public class GarageDoor {
    String location;

    public GarageDoor() {
        location="";
    }

    public GarageDoor(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location+" garage door is on");
    }
    public void off(){
        System.out.println(location+" garage door is off");
    }
}
