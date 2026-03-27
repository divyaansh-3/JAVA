package class_assign_2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.TransferHandler;

abstract class transport{
    String trackingid;
    String destination;
    transport(String trackingid, String destination){
        this.trackingid = trackingid;
        this.destination = destination;
    }
    abstract void dispatch();
}
interface GPS{
    void getCoordinates(); 

    
}
interface Autonomous{
    void selfNavigate();
}
class DeliveryDrone extends transport implements GPS, Autonomous{
    DeliveryDrone(String trackingid, String destination){
        super(trackingid, destination);
    }
    void dispatch(){
        System.out.println("Drone "+ trackingid + " taking off...");

    }
    public void getCoordinates(){
        System.out.println("40.7128 N, 74.0060 W");
    }
    public void selfNavigate(){
        System.out.println("Drone navigating autonomously...");
    }
}
class Truck extends transport{
    Truck(String trackingid , String destination){
        super(trackingid, destination);
    }
    void dispatch(){
        System.out.println("Truck "+ trackingid+ " leaving warehouse...");
    }
}
class Cargoship extends transport{
    Cargoship(String trackingid, String destination){
        super(trackingid,destination);
    }
    void dispatch(){
        System.out.println("CArgo ship "+ trackingid + " sailing....");
    }
}

public class logistic {
    public static void main(String[] args) {
        transport t = new DeliveryDrone("D101", "NYC");
        t.dispatch();
        GPS g = new DeliveryDrone("D101", "NYC");
        g.getCoordinates();
        if ( t instanceof GPS){
            System.out.println("t supports GPS");
        }
        else{
            System.out.println("t does not support GPS");
        }
        List<transport> transports = new ArrayList<>();
        transports.add(new DeliveryDrone("D201","LA"));
        transports.add(new DeliveryDrone("T101","Chicago"));
        transports.add(new DeliveryDrone("S501","London"));

        System.out.println("\n--- Dispatching All----");

        for(transport tr : transports){
            tr.dispatch();
            if( tr instanceof GPS){
                ((GPS) tr).getCoordinates();
            }
        }

    }
    
}
