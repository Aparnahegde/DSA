//Find the given sum is present in the array {4, 5, 1, 10} and sum =6

import java.util.HashSet;

public class PairSumCheck {
    public static boolean isSumPresent(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(sum - num)) {
                return true; // Found a pair
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 10};
        int sum = 6;

        System.out.println("Is sum present: " + isSumPresent(arr, sum));
    }
}
