package Arrays.Medium;

public class SortElements {
    public static void merge(int[] arr, int si, int mi, int ei){
        int[] mergedArray = new int[ei - si +1];
        int idx1= si;
        int idx2=mi+1;
        int x=0;
        while(idx1 <= mi && idx2 <= ei ){
            if(arr[idx1] <= arr[idx2]){
                mergedArray[x++] = arr[idx1++];
            } else{
                mergedArray[x++] = arr[idx2++];
            }
        }

        while(idx1<=mi){
            mergedArray[x++] = arr[idx1++];
        }

        while(idx2<=ei){
            mergedArray[x++] = arr[idx2++];
        }

        for(int i=0, j=si; i<mergedArray.length; i++, j++){
            arr[j] = mergedArray[i];
        }

    }
    
    public static void sort(int []arr, int l, int r){
        if(l<r){
            int m=l+(r-l)/2;
            sort(arr, l,m);
            sort(arr, m+1,r);
            merge(arr, l, m, r);
        }

    }

    public void sortColors(int[] nums) {
        sort(nums, 0, nums.length-1);   
    }
}
