public class Subarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int length = arr.length;

        for (int start = 0; start < length; start++) {
            for (int end = start; end < length; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
}

