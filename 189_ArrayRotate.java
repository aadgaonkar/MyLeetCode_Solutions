class Solution {
    // this a trick solution and there is no direct approach to come up with this. 
    
// we solve the question in three steps. Let the array be [1,2,3,4,5,6,7]. k=3
  //k here is number of elements we want the array to be rotated to.
    
    // first, we reverse the entire array. now it is: [7,6,5,4,3,2,1]
    //second, since k=3, we reverse the first 3 elements ONLY. now it is:[5,6,7,4,3,2,1]
    //third, we reverse the remaining 4 elements. now it is: [5,6,7,1,2,3,4].
    // this is our result array.
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
