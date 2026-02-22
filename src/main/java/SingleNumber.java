import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static int findSingleNumber(int[] nums){
        if(nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);
        // 1 1 2 2 4
        // 1 2 2
        Set<Integer> aux = new HashSet<Integer>();
        Integer result = null;
        for(int i = 0; i < nums.length-1; i++) {
            if(aux.add(nums[i]) && nums[i+1] != nums[i]){
                result = nums[i];
            }
        }
        if(result == null) {
            result = nums[nums.length-1];
        }

//        int valor = -1;
//        int i = 0;
//        while(valor == -1 && i < nums.length) {
//            if(nums[i] != nums[i+1]) {
//                valor = nums[i];
//            }
//
//            i++;
//        }

        return result;
    }

}
