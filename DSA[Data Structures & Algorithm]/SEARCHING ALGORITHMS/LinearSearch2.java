class LinearSearch {  
static int linearSearch(int a[], int n, int src) {  

  for (int i = 0; i < n; i++)  
    {  
        if (a[i] == src)  
        return i+1;  
    }  
  return -1;  
}  
public static void main(String args[]) {  
  int a[] = {1,2,3,4,5,6,7,8,9,10}; 
  int src = 10;  
  int n = a.length; 
  int res = linearSearch(a, n, src); 
  System.out.println();  
  System.out.print("The elements of the array are - ");  
  for (int i = 0; i < n; i++)  
  System.out.print(" " + a[i]);  
  System.out.println();  
  System.out.println("Element to be searched is - " + src);  
  if (res == -1)  
  System.out.println("Element is not present in the array");  
  else  
  System.out.println("Element is present at " + res+"th" +" position of array");  
}  
}  