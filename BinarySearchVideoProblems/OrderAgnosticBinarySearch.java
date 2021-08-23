public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int arr[] = { 10, 7, 4, 3, 2, 1 }; // 1, 2, 3, 4, 7, 10
        int target = 4;
        System.out.println(orderAgnosticBinarySearch(arr, target));
    }

    static public int orderAgnosticBinarySearch(int arr[], int target) {
        boolean asce = arr[1] <= arr[arr.length - 1];
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else {
                if (asce) {
                    if (arr[mid] > target) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                } else {
                    if (arr[mid] > target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
}
