



public class name1 {
    public static void main(String[] args) {
        String str ="divyaansh";
        String str1="";
        int n=str.length();
        for(int i=n-1; i>=0; i--)
        {
            str1= str1+ str.charAt(i);
        }
        System.out.println(str1);
 String str2 = new StringBuilder(str).reverse().toString(); 
System.out.println(str2);  
 }
    
}
