class Solution {
    public int[] twoSum(int[] nums, int target) {
        //to sum problem 
       int[] twoSum1=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    twoSum1[0]=i;
                    twoSum1[1]=j;
                }
            }
        }
        return twoSum1;
    }
}