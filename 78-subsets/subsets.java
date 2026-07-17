class Solution {
    //new approach of power set 
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        
        for(int i=0;i<Math.pow(2,nums.length);i++){
             List<Integer>list=new ArrayList<>();
             for(int j=0;j<nums.length;j++){
                if(((1<<j)&i)!=0){
                    list.add(nums[j]);
                }
             }
             ans.add(list);
        }

     return ans;
    }
}