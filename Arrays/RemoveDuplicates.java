import java.util.*;

public class RemoveDuplicates {
    public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
		int nums [] = new int[arr.size()];
		for(int i=0; i<nums.length; i++){
			nums[i]=arr.get(i);
		}
		int j=0;
		for(int i=1; i<n; i++){
			if(nums[j] != nums[i]){
				j++;
				nums[j]= nums[i];
			}
		}
		return j+1;
	}
    
}

