import java.util.HashSet;
import java.util.Set;

public class ContainsDouble {

    public static Boolean containsDouble(int[] nums) {
        Set<Integer> numbers = new HashSet<Integer>();

        for(int num : nums) {
            if(!numbers.add(num)){
                return true;
            }
        }


//        for (int i = 0; i < nums.length; i++) {
//            int valor = nums[i];
//            for(int j = i+1; j < nums.length; j++) {
//                if(nums[j] == valor) {
//                    return true;
//                }
//            }
//        }

        return false;
    }
}
