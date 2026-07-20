class Solution {
    public void tofind(int k,int j,List<List<Integer>> ans, ArrayList<Integer>list,int sum,int n){
        if(list.size()==k){
            if(sum==n){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
       if(sum>n||list.size()>k)return;
        for(int i=j;i<=9;i++){
            list.add(i);
            sum=sum+i;
            tofind(k,i+1,ans,list,sum,n);
            list.remove(list.size()-1);
            sum=sum-i;
             //tofind(k,i+2,ans,list,sum,n);
        }

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int i=1;
        List<List<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        int sum=0;

        tofind(k,i,ans,list,sum,n);
        return ans;


    }
}