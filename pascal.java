class Solution {
    public List<List<Integer>> generate(int numRows) {
        //making a list of lists to store the result.
        
      List<List<Integer>> result=new ArrayList<>();
        
        // "row" list will store the elements in the current row.This being the row we are currently traversing through.It will be a temporary basically meaning as soon as we move to the next row its value be 0 again. If we don't do this we will be mixing our sums. 
        
    
        //prev list will store the elements to the previous row.This cannot be made null as we need to keep updating it as we move to the next row.
        
        //we initialise the prev with null and will initialise row later.
        
        List<Integer> row, prev=null;
        
        for(int i=0;i<numRows;++i){
            //initialising row here helps us to renew the values as soon as the inner loop is finished.
            row=new ArrayList<Integer>();
            for(int j=0;j<=i;++j){

                if(j==0||j==i){//to insure first and last elements are always 1
                    row.add(1);
                }
                else{
                    row.add(prev.get(j-1)+prev.get(j));//for the sum we access the prev list
                }
                
            }
            //once we're done with the inner loop we update the prev list with the values of the current row. This will help us calculate the sum.
            prev=row;
                result.add(row);//adding the row to the result.
        }return result;
    }
}
