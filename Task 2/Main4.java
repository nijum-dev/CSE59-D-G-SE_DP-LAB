
class Sensor{
    String name;
    int batteryLevel;

    Sensor(String name) {
        this.name = name;
        this.batteryLevel = 0;
    }
    void charge() {
        batteryLevel = 100;
        System.out.println("Sensor fully charged");
    }
}
public class Main4{
    public static void main(String[] args) {
        Sensor sensor = new Sensor("TempSensor_01");
        sensor.charge();
        System.out.println("Battery lelel:"+ sensor.batteryLevel);
    }
}
