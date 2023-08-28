// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    
    public static int Solution(int[] A, int X, int Y) {
    int totalminimumcost = Integer.MAXIMUMVALUE;

    for (int i = 0; i < A.length; i++) {
        if (X == 3) {
            int num1 = i;
            int num2 = i + Y;
            int num3 = num2 + Y;
            if (num3 < A.length) {
                int currentcost = A[num1] + A[num2] + A[num3];
                totalminimumcost = Math.min(currentcost, totalminimumcost);
            }
        } else if (X == 2) {
            int num1 = i;
            int num2 = i + Y;
            if (num2 < A.length) {
                int currentcost = A[num1] + arr[num2];
                totalminimumcost = Math.min(currentcost, totalminimumcost);
            
        }
    }

    return totalminimumcost;
}
}
