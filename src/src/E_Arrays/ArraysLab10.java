package src.E_Arrays;

public class ArraysLab10 {

    public static void main(String[] args) {

        // ===========================
        // TEST YOUR METHODS HERE
        // ===========================

        // Q1: multiplyAll
        // int[] m1 = {2, 3, 4};       // 24
        // int[] m2 = {5, 1, -2};      // -10
        // System.out.println("multiplyAll(m1) = " + multiplyAll(m1));
        // System.out.println("multiplyAll(m2) = " + multiplyAll(m2));

        // Q2: countMatches
        // String[] animals = {"cat", "dog", "cat", "bird", "cat"};
        // System.out.println("countMatches(animals, \"cat\") = " + countMatches(animals, "cat"));
        // System.out.println("countMatches(animals, \"dog\") = " + countMatches(animals, "dog"));
        // System.out.println("countMatches(animals, \"lion\") = " + countMatches(animals, "lion"));

        // Q3: isSortedAscending
        // int[] s1 = {1, 2, 3, 4};
        // int[] s2 = {2, 2, 5, 9};
        // int[] s3 = {3, 2, 5, 6};
        // System.out.println("isSortedAscending(s1) = " + isSortedAscending(s1));
        // System.out.println("isSortedAscending(s2) = " + isSortedAscending(s2));
        // System.out.println("isSortedAscending(s3) = " + isSortedAscending(s3));

        // Q4: findMax
        // int[] grades = {70, 85, 90, 60, 100};
        // int[] single = {42};
        // System.out.println("findMax(grades) = " + findMax(grades));
        // System.out.println("findMax(single) = " + findMax(single));

        // Q5: makeFilledArray
        // int[] filledA = makeFilledArray(5, 9);
        // int[] filledB = makeFilledArray(3, -1);
        // for (int i = 0; i < filledA.length; i++) System.out.print(filledA[i] + " ");
        // System.out.println();
        // for (int i = 0; i < filledB.length; i++) System.out.print(filledB[i] + " ");
        // System.out.println();
    }


    // ============================================================
    // Q1. multiplyAll
    // ============================================================
    public static int multiplyAll(int[] nums) {
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
        }
        return product;
    }


    // ============================================================
    // Q2. countMatches
    // ============================================================
    public static int countMatches(String[] arr, String target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                count++;
            }
        }
        return count;
    }


    // ============================================================
    // Q3. isSortedAscending
    // ============================================================
    public static boolean isSortedAscending(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }


    // ============================================================
    // Q4. findMax
    // ============================================================
    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }


    // ============================================================
    // Q5. makeFilledArray
    // ============================================================
    public static int[] makeFilledArray(int length, int value) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = value;
        }
        return result;
    }
}