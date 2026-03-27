package class_assign_2;
abstract class libraryitem{
    private String itemid;
    private String title;
    protected boolean isReserved ;
    libraryitem(String itemid,String title){
        this.itemid= itemid;
        this.title= title;
        this.isReserved= false;
    }
    public String getTitle(){
        return title;
    }

    void showDetails(){
        System.out.println("ITEMid is : "+ itemid);
        System.out.println("Title of the item is : "+ title);
        
    }
    abstract void processLoan();

}
class textbook extends libraryitem{
    textbook(String itemid, String title){
        super(itemid,title);
    }
    void processLoan(){
        if(!isReserved){
            isReserved = true;
            System.out.println("Textbook '"+getTitle()+ " issued for 14 days");
        }
        else{
            System.out.println("Error: '"+getTitle() + " is already on loan");
        }
    }
}
class ResearchPaper extends libraryitem{
    ResearchPaper(String itemid, String title){
        super(itemid, title);
    }
    void processLoan(){
            System.out.println("Generating secure PDF download link");
     }
}

public class library {
    public static void main(String[] args) {
        libraryitem a = new textbook("B101", "Java Core");
        a.processLoan();
        
        a.processLoan();
        libraryitem b = new ResearchPaper("R99", "AI Ethics");
        b.processLoan();
    }

    
}
