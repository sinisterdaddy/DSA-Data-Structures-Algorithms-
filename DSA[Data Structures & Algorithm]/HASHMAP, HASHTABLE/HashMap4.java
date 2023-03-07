import java.util.concurrent.*;

public class HashMap4 {
    
    public static void main(String[] args)  
    {  

        ConcurrentHashMap<Integer, String> ch = new ConcurrentHashMap<Integer, String>();  
        ch.put(201, "How");  
        ch.put(202, "are");  
        ch.put(203, "you");  

        System.out.println("ConcurentHashMap: " + ch);  
  
        ch.putIfAbsent(202, "How");  

        System.out.println("\nConcurentHashMap: " + ch);  

        ch.replace(201, "How", "Who");  

        System.out.println("\nConcurentHashMap: " + ch);  
 
        ch.remove(203, "you");  

        System.out.println("\nConcurentHashMap: " + ch);  
    }
}