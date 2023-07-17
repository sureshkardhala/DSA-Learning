package Arrays.Easy;

public class FindNumberAppearsOne {
    public int singleNumber(int[] nums) {
        //Better Approach

       /* Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0)+1);
        }
        int res=-1;
        for(Map.Entry<Integer, Integer> e: hashMap.entrySet()){
            if(e.getValue() == 1){
                res = e.getKey();
                break;
            }
        }
        return res;*/

        //Best Approach
        int xor=0;
        for(int i=0; i<nums.length ;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
}
