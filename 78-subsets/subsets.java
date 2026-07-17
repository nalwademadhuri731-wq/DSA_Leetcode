class Solution {
    //new approach of power set 
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        ans.add(new ArrayList<>());

        for(int num:nums){
             int n=ans.size();
             for(int j=0;j<n;j++){
               List<Integer>temp=new ArrayList<>(ans.get(j));
               temp.add(num);
               ans.add(temp);
             }
             
        }

     return ans;
    }
}