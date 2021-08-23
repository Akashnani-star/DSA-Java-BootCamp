// FloorOfANumber ---> greatest element in the array smaller or = target

public class FloorOfANumber {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 1000;
        System.out.println(binarySearch(arr, target));
    }

    static public int binarySearch(int arr[], int target) {
        // check if given array is empty if yes return -1
        if (arr.length > 0) {
            // if first element is greater than or equal target then we return the first
            // element
            if (arr[0] >= target) {
                return 0;
            }
        } else {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return mid;
    }
}
