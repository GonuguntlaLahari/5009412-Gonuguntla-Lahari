public class App {
    public static void main(String[] args) throws Exception {
        Light light=new Light();
        Command lightOnCommand=new LightOnCommand(light);
        Command lightOffCommand=new LightOffCommand(light);
        RemoteControl remote=new RemoteControl();
        remote.setCommand(lightOffCommand);
        remote.setCommand(lightOnCommand);
    }
}
