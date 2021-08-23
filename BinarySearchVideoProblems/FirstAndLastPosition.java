// Finding First and Last Position of Element in An Array

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int arr[] = { 5, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 10 };
        int target = 7;
        int ans[] = {-1,-1};
        ans[0] = binarySearch(arr, target, true);
        if(ans[0] != -1){
            ans[1] = binarySearch(arr, target, false);
        }
        for(int index: ans){
            System.out.println(index);
        }
    }

    static public int binarySearch(int arr[], int target, boolean firstPosition) {
        // check if array length is > 0 if false return -1 bcoz it is an empty array
        if (arr.length > 0) {
        } else {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int mid;
        int position = -1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                position = mid;
                if (firstPosition) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return position;
    }
}