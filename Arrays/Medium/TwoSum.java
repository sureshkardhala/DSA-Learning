package Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
     public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> sMap = new HashMap<>();
      int []res = new int[2];
      for(int i=0; i<nums.length; i++){
          if(sMap.containsKey(target-nums[i])){
              res[1]=i;
              res[0]=sMap.get(target-nums[i]);
              return res;
          }
          sMap.put(nums[i], i);
      }
      return res;
    }
}
