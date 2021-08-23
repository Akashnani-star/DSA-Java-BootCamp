public class PeakInMountainArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 77, 2 };
        System.out.println(arr[findPeakWithDuplicates(arr)]);
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

    static int findPeakWithDuplicates(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        int ans = Integer.MIN_VALUE;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (arr[mid] > ans) {
                ans = mid;
            }
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

}
