import java.util.*;  
public class HashTable1  
{  
    /* Driver Code */  
    public static void main(String args[])  
    {  
     
        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();  
 
        hm.put(3, "You are visiting");  
        hm.put(5, "Hello");  
        hm.put(1, "home");  
        hm.put(2, "college");  

        System.out.println(hm);  
    }  
}