public class BinarySearch {






   // Prints the target
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(arr, 7));
    }

    // We know  binarySearch(int[] arr, int target) takes an integer array arr and an integer target as input
    //function returns the index of the target in the arr if it exists, otherwise it returns -1.
    //function binarySearch(int[] arr, int left, int right, int target) is a helper function that performs the binary search recursively.
    // your left is your low and right is your high
    //If left is greater than right, the function returns -1, indicating that the target is not in the arr
    //If middle element of arr equal to target return index of middle element,
    // If middle element of arr less then target it recursively searches right half.
    //If middle element of arr greater than target it recursively searches the left half
    public static int binarySearch(int[] arr, int target) {
        return binarySearch(arr, 0, arr.length - 1, target);
    }
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, right, target);
        }
        return binarySearch(arr, left, mid - 1, target);
    }


}
