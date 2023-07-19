package Arrays.Medium;

public class MajorityOfElement {
    public int majorityElement(int[] nums) {
        //Better Appraoch
         /* Map<Integer, Integer> hMap = new HashMap<>();
          for(int i=0; i<nums.length;i++){
              hMap.put(nums[i], hMap.getOrDefault(nums[i], 0)+1);
          }
          int count=0,element=-1;
          for(Map.Entry<Integer, Integer> e : hMap.entrySet()){
              if(nums.length/2 < e.getValue() && count <e.getValue()){
                  count=e.getValue();
                  element=e.getKey();
              }
          }
          return element;*/
  
          //Best Appraoch by Moor's Voting Algorithm
          int count=1, element=nums[0];
          for(int i=1; i<nums.length; i++){
              if(element == nums[i]) count++;
              else count--;
              if(count<0){
                  count=0;
                  element=nums[i];
              }
          }
          if(count <0) return -1;
          return element;
      }
}
