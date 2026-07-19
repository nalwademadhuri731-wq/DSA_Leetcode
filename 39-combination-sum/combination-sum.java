class Solution {

    public void  tofind(int i,int sum,List<Integer> list,List<List<Integer>>ans,int target,int []arr){
          if(sum==target){
            ans.add(new ArrayList<>(list));
            return;
          }
          if(i==arr.length||sum>target){
            return;
          }
          sum=sum+arr[i];
          list.add(arr[i]);
          tofind(i,sum,list,ans,target,arr);
          sum=sum-arr[i];
          list.remove(list.size()-1);
          tofind(i+1,sum,list,ans,target,arr);


    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        int i=0;
        int sum=0;
        tofind(i,sum,list,ans,target,candidates);
        return ans;
    }
}