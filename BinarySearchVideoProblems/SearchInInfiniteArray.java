public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 14, 14, 14, 14 };
        int target = 15;
        System.out.println(searchInInfiniteArray(arr, target));

    }

    static int searchInInfiniteArray(int arr[], int target) {

        int start = 0;
        int end = 0;
        int temp;
        while (true) {
            try{
                boolean endGreatherThanTarget = arr[end] < target;
                if (endGreatherThanTarget) {
                    temp = start;
                    start = end + 1;
                    end = ((((end - temp) + 1) * 2) + start);
                } else {
                    break;
                }
            }catch(IndexOutOfBoundsException ie){
                System.out.println("Given Array Is not an Infinite Array");
                System.exit(1);
            }
        }
        if (arr[end] == target) {
            return end;
        } else {
            return binarySearch(arr, target, start, end);
        }
    }

    static public int binarySearch(int arr[], int target, int start, int end) {
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