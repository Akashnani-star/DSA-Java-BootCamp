public class NextGreatestCharacter {
    public static void main(String[] args) {
        char arr[] = { 'c', 'f', 'j' };
        char target = 'c';
        System.out.println(binarySearch(arr, target));
    }

    static public int binarySearch(char arr[], char target) {
        // check if array length is > 0 if false return -1 bcoz it is an empty array
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else { 
                start = mid + 1;
            }
        }
        return start % arr.length ;
    }
}
