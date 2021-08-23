public class ElementInPeakArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 0 };
        int target = 0;
        System.out.println(findElement(arr, target));
    }

    static int findElement(int[] arr, int target) {
        int peak = findPeak(arr);
        int position = orderAgnosticBinarySearch(arr, target, 0, peak);
        if (position == -1) {
            position = orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
        }
        return position;
    }

    static int findPeak(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static public int orderAgnosticBinarySearch(int arr[], int target, int start, int end) {
        boolean asce = arr[start] <= arr[end];
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
