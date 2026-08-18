class Solution {
    public List<String> buildArray(int[] target, int n) {
       int size=target.length;
       ArrayList<String>list=new ArrayList<>();
       int i=0;
       int t=1;
       while(i<size){
        if(t==target[i]){
            list.add("Push");
            i++;
        }else{
            list.add("Push");
            list.add("Pop");
        }

        t++;
       }

      return list;
    }
}