package Arrays.Easy;
public class SecondSmallestLargest {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int largestElement = a[0];
        int secondeLargestElement = a[1];

        int smallestElement = a[0];
        int secondeSmallestElement = a[1];

        if(smallestElement > secondeSmallestElement){
            int temp= secondeSmallestElement;
            secondeSmallestElement=smallestElement;
            smallestElement=temp;
        }

        if(largestElement < secondeLargestElement){
            int temp=largestElement;
            largestElement=secondeLargestElement;
            secondeLargestElement=temp;
        }


        for(int i=0; i<n; i++){
            if(largestElement < a[i]){
                secondeLargestElement=largestElement;
                largestElement=a[i];
            }
            if(secondeLargestElement < a[i] && largestElement!=a[i]){
                secondeLargestElement=a[i];
            }
            if(smallestElement > a[i]){
                secondeSmallestElement = smallestElement;
                smallestElement=a[i];
            }
            if(secondeSmallestElement > a[i] && smallestElement!=a[i]){
                    secondeSmallestElement = a[i];
            }
        }
        int [] arr = new int [2];
        arr[0]=secondeLargestElement;
        arr[1]=secondeSmallestElement;
        return arr;
    }
}

