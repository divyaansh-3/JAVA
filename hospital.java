class Doctor{
    int doctorid;
    String name;
    String spec;
    Doctor(int i,String n,String s){
        this.doctorid=i;
        this.name=n;
        this.spec=s;
    }
    public void display(){
        System.out.println("------Doctor's Detail-------");
        System.out.println("Doctor's name is: "+name);
        System.out.println("Doctor id is: "+doctorid);
        System.out.println("Doctor specialisation is : "+spec);

    }
    
}
class Patient{
    int patientid;
    String name;
    String disease;
    Patient(int i,String n,String s){
        this.patientid=i;
        this.name=n;
        this.disease=s;
    }
    public void display(){
        System.out.println("------Patient's Detail-------");
        System.out.println("Patient's name is: "+name);
        System.out.println("Patient's id is: "+patientid);
        System.out.println(name+"'s disease is : "+disease);

    }
    
}
public class hospital {
    public static void main(String[] args) {
        Doctor d= new Doctor(1,"parth","chutiya");
        Patient p= new Patient(2,"punit","cheating");
        d.display();
        p.display();
    }

    
}
