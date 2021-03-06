class Solution {
    public void rotate(int[][] matrix) {
      int n=matrix.length;
    
      //first we transpose. basically exchanging rows and columns
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=0;
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //now we reverse. keep in mind to loop only till n/2 in the inner loop as we only traverse through half of the elements to exchange them. if we traverse to the other it would just reverse the matrix back to the original one.
        // also to make sure we have to exchange the element with its opposite one the formula is n-1-j
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=0;
                temp=matrix[i][j];
                 matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
    }
}
