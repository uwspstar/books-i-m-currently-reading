public class Ex_1_4_18 {
    private static final int NOT_FOUND = -99999;

    private static int localMinimum(int[] arr) {

        int N = arr.length;
        if (N < 3)
            return NOT_FOUND;

        int left = 0;
        int right = N - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                return arr[mid];
            }

            if (arr[mid] > arr[mid - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return NOT_FOUND;
    }

    public static void main(String[] args) {
        int[] arr1 = { 10, -9, 20, 25, 21, 40, 50, -20 }; // -9
        int[] arr2 = { -4, -3, 9, 4, 10, 2, 20 }; // 4

        System.out.println(localMinimum(arr1));
        System.out.println(localMinimum(arr2));
    }
}