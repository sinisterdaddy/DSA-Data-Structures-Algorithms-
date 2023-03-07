import java.util.*;

public class HashMap3 {
    /* Driver Code */
    public static void main(String arg[]) {
        
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();

        lhm.put("One", "isha");
        lhm.put("Two", "mick");
        lhm.put("Three", "sam");
        System.out.println(lhm);
        System.out.println("Getting value for key 'one': " + lhm.get("One"));
        System.out.println("Size of the Hashmap: " + lhm.size());
        System.out.println("Is Hashmap empty? " + lhm.isEmpty());
        System.out.println("Contains key 'two'? " + lhm.containsKey("Two"));
        System.out.println("Contains value 'nia? " + lhm.containsValue("Kanishk"));
        System.out.println("delete element 'one': " + lhm.remove("One"));
        System.out.println(lhm);
    }
}
