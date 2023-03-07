// GIVEN ARRAY IS {12,33,42,51,66,73,87,99,101} 
// let's say we need to search 66 so we put value of src = 66
//put src= element you want to search

class BinarySearch2 {
    static int binarySearch(int arr[], int beginning, int ending, int src) {
        int mid;
        if (ending >= beginning) {
            mid = (beginning + ending) / 2;
            if (arr[mid] == src) {
                return mid + 1;
            }

            else if (arr[mid] < src) {
                return binarySearch(arr, mid + 1, ending, src);
            }

            else {
                return binarySearch(arr, beginning, mid - 1, src);
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 12, 33, 42, 51, 66, 73, 87, 99, 101 };
        int src = 66;
        int n = arr.length;
        int res = binarySearch(arr, 0, n - 1, src);
        System.out.print("The elements of the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Element to be searched is: " + src);
        if (res == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at " + res + " position of array");
    }
}
