package D_Methods.D_Methods;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return true;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else if (arr[mid] > target) {
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String args[]) {
       ;
    }
}

