class Solution {
    public void tofind( HashSet<List<Integer>>ans,ArrayList<Integer>list,int []arr,int i){
        if(i==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[i]);
        tofind(ans,list,arr,i+1);
        list.remove(list.size()-1);
        tofind(ans,list,arr,i+1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       
       ArrayList<Integer>list=new ArrayList<>();
       HashSet<List<Integer>>ans=new HashSet<>();
       Arrays.sort(nums);
       int i=0;
       tofind(ans,list,nums,i);
         List<List<Integer>>ans2=new ArrayList<>(ans);
         return ans2;
    }
}