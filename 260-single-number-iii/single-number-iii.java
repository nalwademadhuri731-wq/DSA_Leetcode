class Solution {
    public int[] singleNumber(int[] nums) {
       
        int [] arr=new int[2];
        int xor=0;
        for(int i=0;i<nums.length;i++){
           xor^=nums[i];
         }
         int num1=0;
         int num2=0;
         int diff=xor&(-xor)    ; //rightmost element
        
        for(int i=0;i<nums.length;i++){
          if((nums[i]&diff)==0){
           num1^=nums[i];
          }else{
             num2^=nums[i];
          }
         }
      
        arr[0]=num1;
        arr[1]=num2;
        return arr;
    }
}