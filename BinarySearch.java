public class BinarySearch {





// Recursive implementation of binary search algorithm

    public static void main(String[] args) {
        int[] A = {10, 11, 18, 30, 42, 63};
        int x = 30;

        int low = 0;
        int high = A.length - 1;
        int index = binarySearch(A, low, high, x);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }





    }

    // The output is found at index 3
    static int binarySearch(int[] A, int low, int high, int x)
    {

        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (x == A[mid]) {
            return mid;
        }
        else if (x < A[mid]) {
            return binarySearch(A, low,  mid - 1, x);
        }
        else {
            return binarySearch(A, mid + 1,  high, x);
        }

    }
}
