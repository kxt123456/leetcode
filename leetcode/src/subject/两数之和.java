package subject;

import java.util.HashMap;
import java.util.Map;

public class 两数之和 {
    public static int[] twoSum(int[] nums, int target) {
        if(nums==null||nums.length==0)return new int[2];
        Map<Integer,Integer> map =new HashMap();
        for(int i=0;i>nums.length;i++){
            if(map.containsKey(nums[i])){
                return new int[]{i,map.get(nums[i])};
            }
            map.put(target-nums[i],i);
        }
        return new int[2];

    }
}
