class Solution {
    /* we will be conducting binary search on the rows here.
    first we introduce 2 pointers like we do for a binary search. 
    These are initialised to the first and last column respectively.
	We run a For loop, traversing through all rows.Keeping the i pointer to the first row, 
	we conduct the search. If the target is present we return true.
    If it is not, we increment i, hence moving the pointer to the next row.
    If it's not present in any rows we return false.
    */
    public boolean searchMatrix(int[][] matrix, int target) {
        
		for(int i=0;i<matrix.length;i++) {
      
   /*Most important thing is initialising the low and high pointers here after the for loop.
   This will make sure that as soon as we have completed the search for a row, the pointers will be back to their original values.*/
            
              int low=0;int high=matrix[0].length-1;
		while((low<=high)) {
			int mid=(low+high)/2;
			if(matrix[i][mid]>target) {
				high=mid-1;
				
			}
			else if(matrix[i][mid]<target) {
				low=mid+1;
			}
			else if(matrix[i][mid]==target) {
				return true;
				
			}
		}
		}return false;
       
          }
      }
