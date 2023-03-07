import java.util.*;  
public class HashMap2   
{
    static void HashMapCreation(int arr[])  
    {  
 
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();  
        for (int i = 0; i < arr.length; i++)   
        {  
 
            Integer n = hashmap.get(arr[i]);  

            if (hashmap.get(arr[i]) == null)   
            {  
                hashmap.put(arr[i], 1);  
            }  

            else   
            {  
                hashmap.put(arr[i], ++n);  
            }  
        }  

        System.out.println(hashmap);  
    }  
  
    public static void main(String[] args)  
    {  
        int arr[] = { 1,9,44,5,8,90 };  
        HashMapCreation(arr);  
    }  
} 