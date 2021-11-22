import java.util.*;

public class Ex_1_4_14 {

    //N^3
    private static boolean fourSum(int[] arr, int target) {
        int N = arr.length;
        Arrays.sort(arr); // nlogn
        
        for (int i = 0; i < N - 4; i++) {
            for (int j = i + 1; j < N - 3; j++) {
                int val = target - (arr[i] + arr[j]);
                int left = j + 1;
                int right = N - 1;
                while (left <= right) {
                    if (arr[left] + arr[right] == val) {
                        System.out.println(" i = "+ arr[i]);
                        System.out.println(" j = "+ arr[j]);
                        System.out.println(" left = "+ arr[left]);
                        System.out.println(" right = "+ arr[right]);
                        return true;
                    }
                    if (arr[left]  + arr[right] > val) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }

        return false;
    }

    private static boolean twoSum(int[] arr, int target) {

        int N = arr.length;
        if (N < 2)
            return false;
        if (N == 2)
            return arr[0] + arr[1] == target;

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < N; i++) {
            int val = target - arr[i];
            if (set.contains(val)) {
                System.out.println("val = " + val + " arr[i] = " + arr[i]);
                // System.out.println(set);
                return true;
            } else {
                set.add(arr[i]);
            }

        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 0, -4, -2, 5, 10, -10, -1, -1, -1 };
        System.out.println(twoSum(arr, 0));
        System.out.println(twoSum(arr, 10));
        System.out.println(fourSum(arr, 10));
    }
}
