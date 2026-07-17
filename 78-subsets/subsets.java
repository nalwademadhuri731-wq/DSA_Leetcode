class Solution {
    //TO find the subsets :-Recurssion problem 
    public void  tofind(int i,List<List<Integer>>ans,
    List<Integer>list,int [] nums){
        if(i==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        tofind(i+1,ans,list,nums);

        list.remove(list.size()-1);
        tofind(i+1,ans,list,nums);


    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();

        tofind(0,ans,list,nums);
        return ans;
    }
}