// CilelingOfANumber   ----> // smallest element in the array greater or = target

public class CilelingOfANumber {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 100;
        System.out.println(binarySearch(arr, target));
    }

    static public int binarySearch(int arr[], int target) {
        // check if array length is > 0 if false return -1 bcoz it is an empty array
        if (arr.length > 0) {
            // if first element is less than or equal target then we return the first
            // element
            if (arr[arr.length - 1] < target) {
                return 0;
            }
        } else {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int mid;
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
        return start;
    }
}
