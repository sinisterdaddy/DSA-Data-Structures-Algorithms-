public class Selection
{  
    void selection(int a[]) 
{  
    int i, j, small;  
    int n = a.length;  
    for (i = 0; i < n-1; i++)  
    {  
        small = i; 
        for (j = i+1; j < n; j++)  
        if (a[j] < a[small])  
            small = j;  

    int temp = a[small];  
    a[small] = a[i];  
    a[i] = temp;  
    }  
  
}  
void printArr(int a[])  
{  
    int i;  
    int n = a.length;  
    for (i = 0; i < n; i++)  
    System.out.print(a[i] + " ");  
}  
  
    public static void main(String[] args) {  
    int a[] = { 3, 46, 34, 5, 6, 7, 16, 24, 20, 36};  
    Selection i1 = new Selection();  
    System.out.println("\nBefore sorting array elements are - ");  
    i1.printArr(a);  
    i1.selection(a);  
    System.out.println("\nAfter sorting array elements are - ");  
    i1.printArr(a);  
    System.out.println();  
    }  
} 