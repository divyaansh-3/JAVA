package class_assign_2;

abstract class  device {
    String brand;
    device(String brand){
        this.brand= brand;
    }
    abstract void turnOn();
}
interface RemoteControllable {
    void connectToWifi();

    
}
interface PowerSaving {
    String getEnergyRating();

    
}
class SmartTV extends device implements RemoteControllable, PowerSaving{
    SmartTV(String brand){
        super(brand);
    }
    void turnOn(){
        System.out.println(brand + " TV is booting up...");
    }
    public void connectToWifi(){
        System.out.println("Connecting to Home_5g...");
    }
    public String getEnergyRating(){
        return "Energy Rating : 5 star";
    }

}
class ElectricKettle extends device{
    ElectricKettle(String brand){
        super(brand);
    }
    void turnOn(){
        System.out.println(brand+ " kettle is heating water...");
    }
}

public class smarthome {
    public static void main(String[] args) {
        device d = new SmartTV("Sony");
        d.turnOn();

        RemoteControllable r = new SmartTV("LG");
        r.connectToWifi();

        PowerSaving p = new SmartTV("Samsung");
        System.out.println(p.getEnergyRating());

        device kettle = new ElectricKettle("Prestige");
        kettle.turnOn();
    }
    
}
