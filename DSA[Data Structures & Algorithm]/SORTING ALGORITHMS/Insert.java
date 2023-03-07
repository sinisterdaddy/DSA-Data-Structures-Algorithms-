public class Insert {
    void insert(int a[]) 
    {
        int i, j, temp;
        int n = a.length;
        for (i = 1; i < n; i++) {
            temp = a[i];
            j = i - 1;

            while (j >= 0 && temp <= a[j]) 
            {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = temp;
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
        int a[] = { 3, 46, 34, 5, 6, 7, 16, 24, 20, 36 };
        Insert i1 = new Insert();
        System.out.println("\nBefore sorting array elements are - ");
        i1.printArr(a);
        i1.insert(a);
        System.out.println("\n\nAfter sorting array elements are - ");
        i1.printArr(a);
        System.out.println();
    }
}