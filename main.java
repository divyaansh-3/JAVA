
import java.util.Arrays;
















class main {
    // java is case sensitive , and the name of the file should match the name of the class along with the cases.
    public static void main(String[] args) {
        String name ="divyaansh";
        System.out.println("Hello Java from VS Code");
        // shortcut to write this whole print function is sout+tab button.
        //println prints the statement inside the quote while print without ln prints the statement without a next line.
        System.out.println("hello world"); 

        //variables in java:-
        //primitive and non primitive same as js.
        //bytes, short,int,long,float,double,char,boolean(primitive)
        /*string,
        string name ="divyaansh";
        we can also use new keyword.
        string name = new string("divyaansh");
        */ 
       
       System.out.println(name);
       System.out.println("hello! my name is "+name);
       // in case of non primitive data types, we can use different methods on the variables.
       //like length(),charat(index),str.replace(old , new)
       String name1= "divyaansh parmar";
       System.out.println(name1.substring(0,9));
       //java is 0 indexed and while finding the substring last index is not included.
       //strings are immutable.

       //array
       int[] age= new int[3];
       age[0]=34;
       age[1]=345;
       for(int i=0;i<3;i++){
        System.out.println(age[i]);
       }
       
       //unlike c++ where if a variable is uninitialised ,a random garbage value is stored in it.
       //but in case of java , an uninitialised variable is initialised to zero.
       // on printing only age , a random value is printed not the values stored in the array.
        
       // like strings where we could use some methods, here also in case of arrays we have two imp properties.
       //length and sort.
       System.out.println(age.length);
       Arrays.sort(age);
              for(int i=0;i<3;i++){
        System.out.println(age[i]);
       }
       
       

    }
}
