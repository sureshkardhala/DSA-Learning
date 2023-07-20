package Arrays.Medium;

public class RotateMatrix90 {
    public static void reverse(int matrix[][], int i){
        int l=0;
        int r= matrix[i].length-1;
        while(l<r){
            int temp=matrix[i][l];
            matrix[i][l]=matrix[i][r];
            matrix[i][r]=temp;
            l++;
            r--;
        }
    }
    public void rotate(int[][] matrix) {
        // int matrix1[][] = new int[matrix.length][matrix[0].length];
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         matrix1[j][matrix.length-1-i]=matrix[i][j];
        //     }
        // }

        //  for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         matrix[i][j]=matrix1[i][j];
        //     }
        // }

        //Transposing matrix
        
        for(int i=0; i<matrix.length-1; i++){
            for(int j=i+1; j<matrix.length; j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0; i<matrix.length; i++){
            reverse(matrix, i);
        }
    }
}
