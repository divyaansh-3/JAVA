package class_assign3;
abstract class Robot{
    private String batteryid;
    protected double chargeLevel;
    Robot(String batteryid, double chargeLevel){
        this.batteryid= batteryid;

        this.chargeLevel = (chargeLevel<0) ? 0: chargeLevel ;
    }
    public String getbatteryid(){
        return batteryid;
    }
    void reportStatus(){
        System.out.println("Robot id : " + this.getbatteryid() + " charge level is: "+ chargeLevel + " %");
    }
    abstract void performTask();
}
class DroneRobot extends Robot{
    DroneRobot(String batteryid, double chargeLevel){
        super(batteryid, chargeLevel);
    }
    @Override
    void performTask(){
        if(chargeLevel < 15){
            System.out.println("Battery is low");
            return;
        }
        else{
            chargeLevel -=15;
            System.out.println("DroneRobot is working");
        }
        super.reportStatus();
    }

}
class GroundRobot extends Robot{
    GroundRobot(String batteryid, double chargeLevel){
        super(batteryid, chargeLevel);
    }
    @Override
    void performTask(){
        if(chargeLevel<5){
            
            System.out.println("Battery is low");
        return;

        }
        else{
            chargeLevel-=5;
            System.out.println("GroundRobot is working!");
        }
                super.reportStatus();

    }
}

public class AWar {
    public static void main(String[] args) {
        
    
    Robot a= new DroneRobot("D-1", 20);
    Robot b= new GroundRobot("G-5", 10);
    Robot c= new DroneRobot("D-2", 10);
    a.performTask();
    b.performTask();
    c.performTask();
    }


    
}
