// Find if there is a pair with a given sum in the rotated sorted Array
// Given an array arr[] of distinct elements size N that is sorted and then around an unknown point, the task is to check if the array has a pair with a given sum X.
// Examples : 
// Input: arr[] = {11, 15, 6, 8, 9, 10}, X = 16
// Output: true
// Explanation: There is a pair (6, 10) with sum 16

// Input: arr[] = {11, 15, 26, 38, 9, 10}, X = 35
// Output: true
// Explanation: There is a pair (26, 9) with sum 35

// Input: arr[] = {11, 15, 26, 38, 9, 10}, X = 45
// Output: false
// Explanation: There is no pair with sum 45.

class PairInSortedRotated {
    static boolean pairInSortedRotated(int arr[], int n, int x) {
        int i;
        for (i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1])
                break;
        int l = (i + 1) % n;
        int r = i;
        while (l != r) {
            if (arr[l] + arr[r] == x)
                return true;
            if (arr[l] + arr[r] < x)
                l = (l + 1) % n;
            else
                r = (n + r - 1) % n;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 8, 9, 10 };
        int X = 16;
        int N = arr.length;

        if (pairInSortedRotated(arr, N, X))
            System.out.print("true");
        else
            System.out.print("false");
    }
}
