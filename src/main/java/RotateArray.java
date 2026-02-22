public class RotateArray {

    public static void rotate(int[] nums, int k) {

        if(nums.length == 0) {
            return;
        }

        if(k > nums.length) {
            k = k % nums.length;
        }

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k);
        reverse(nums, k+1, nums.length-1);
    }

    private static void reverse (int[] nums, int start, int end) {
        for(int i = start; i < end; i++) {
            int valor = nums[i];
            nums[i] = nums[end];
            nums[end] = valor;
            end--;
        }
    }
}
