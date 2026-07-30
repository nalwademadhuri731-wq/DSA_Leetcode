class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int [] arr=new int[2];
        int j=0;
        for(int i=1;i<nums.length-1;i++){
         if(nums[i]!=nums[i+1]&&nums[i]!=nums[i-1]){
            arr[j++]=nums[i];
         }
        }
      
            if(nums[0]!=nums[1]){
                arr[j++]=nums[0];
            }
            if(nums[nums.length-1]!=nums[nums.length-2]){
                 arr[j++]=nums[nums.length-1];
            }
        
        return arr;
    }
}