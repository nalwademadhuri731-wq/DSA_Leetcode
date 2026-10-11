class Solution {
    public int longestOnes(int[] nums, int k) {
        //if(k==0)return 0;
         int c=0;
        int r=0;
        int l=0;
        int z=0;
        int len=0;
        int max=0;
        while(r<nums.length){
            if(nums[r]==0)z+=1;
            
            while(z>k){
                if(nums[l]==0)z--;
                l++; 
              }
            if(z<=k){
              len=(r-l+1);
              if(len>max){
                max=len;
              }

              
              
            }
            r++;

        }
        
        
        
        return max;
    }
}