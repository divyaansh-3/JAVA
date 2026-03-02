import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

interface Taxable {
    double calculateTax();
}
abstract class items implements Taxable{
    String itemID;
    String name;
    double base_price;
    items(String itemID, String name , double base_price){
        this.itemID= itemID;
        this.name= name;
        this.base_price= base_price;

    }
    double getPricewithTax(){
        return base_price + calculateTax();
    }
    abstract void display();
}
class PerishableItem extends items{
    String expiry_date;
    PerishableItem(String itemID, String name, double base_price, String expiry_date){
        super(itemID,name,base_price);
        this.expiry_date= expiry_date;
    }
    public double calculateTax(){
        return base_price * 0.05;
    }
    void display() {
        System.out.println("Perishable | ID: " + itemID + " | Name: " + name +
                " | Price: " + base_price + " | Expiry: " + expiry_date);
    }

    
}
class ElectronicItem extends items{
    int warranty_Period;
    ElectronicItem(String itemID, String name, double base_price,int warranty_Period){
        super(itemID,name,base_price);
        this.warranty_Period = warranty_Period;
    }
    public double calculateTax(){
        return base_price * 0.15;
    }
    public void display(){
        System.out.println("Electronic Item | ID: " + itemID + " | Name: " + name +
                " | Price: " + base_price + " | Warranty period: " + warranty_Period + " years");

    }

}


public class implement{
    static HashMap<String, items> inventory = new HashMap<>();
    public static void main(String[] args) {
        inventory.put("P001", new PerishableItem("P001", "Milk", 2.50, "2026-03-10"));
        inventory.put("E501", new ElectronicItem("E501", "Headphones", 120.00, 24));
        displayAllItems();
        searchItem("P002");
        calculateTotalValue();
        sortByPrice();
    }
     static void displayAllItems(){
         System.out.println("\nAll Items:");
        for (items item : inventory.values()) {
            item.display();
        }
    
     } 
     static void searchItem(String id) {
        System.out.println("\nSearch Result:");
        if (inventory.containsKey(id)) {
            inventory.get(id).display();
        } else {
            System.out.println("Item not found");
        }
    }
    static void calculateTotalValue() {
        double total = 0;
        for (items item : inventory.values()) {
            total += item.getPricewithTax();
        }
        System.out.println("\nTotal Inventory Value (Incl. Tax): $" + total);
    }
     static void sortByPrice() {
        ArrayList<items> list = new ArrayList<>(inventory.values());

        list.sort(Comparator.comparingDouble(i -> i.base_price));

        System.out.println("\nItems Sorted by Price:");
        for (items item : list) {
            item.display();
        }
    }

    
}
