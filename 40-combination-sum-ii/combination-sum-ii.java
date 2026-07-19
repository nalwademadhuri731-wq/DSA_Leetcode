class Solution {

     public void  tofind(int i,List<Integer> list,List<List<Integer>>ans,int target,int []arr){
          if(target==0){
            ans.add(new ArrayList<>(list));
            return;
          }
        
          for(int idx=i;idx<arr.length;idx++){
           if(idx>i&&(arr[idx]==arr[idx-1]))continue;
           if(arr[idx]>target)break;

           list.add(arr[idx]);
            tofind(idx+1,list,ans,target-arr[idx],arr);
            list.remove(list.size()-1);
          }
    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        //code here
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        int i=0;
         tofind(i,list,ans,target,arr);
       
        return ans;
    }
}

// list = list.stream().distinct().collect(Collectors.toCollection(ArrayList::new));