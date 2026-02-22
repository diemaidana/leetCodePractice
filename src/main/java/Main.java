public class Main {
    static void main() {
        int[] nums = {1,2,3,4,5,6,7};

        RotateArray.rotate(nums, 3);

        for (int num : nums) {
            System.out.println(num);
        }

//        int[] nums = {1,1,1,3,3,4,3,2,4,2};
//
//        System.out.println(ContainsDouble.containsDouble(nums));
    }
}
