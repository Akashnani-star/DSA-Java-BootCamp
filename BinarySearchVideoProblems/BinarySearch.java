public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 4, 4, 4, 4, 4, 7, 10 };
        int target = 4;
        System.out.println(binarySearch(arr, target));
    }

    static public int binarySearch(int arr[], int target) {
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
        return -1;
    }
}