package D_Methods;

public  class LinearSearch {
    public static boolean numberSearch(int[] arr, int target) {
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1, 5, 6, 7, 8, 4, 3, 6, 7 , 9, 10};
        boolean result = numberSearch(arr ,  7);
        System.out.println(result);
    }
}

