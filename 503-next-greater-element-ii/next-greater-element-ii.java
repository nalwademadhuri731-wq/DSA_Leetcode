class Solution {
    public int[] nextGreaterElements(int[] arr) {
        ArrayList<Integer>list =new ArrayList<Integer>();
        Stack<Integer>s=new Stack<>();
        int n=arr.length;
        for(int i=(2*n)-1;i>=0;i--){
            while(!s.isEmpty()&&s.peek()<=arr[i%n]){
                s.pop();
            }
            if(i<n){
                if(s.isEmpty()){
                    list.add(-1);
                }else{
                    list.add(s.peek());
                }
            }
            s.push(arr[i%n]);
        }
        Collections.reverse(list);
        int [] nums=new int [arr.length];
    
        for(int i=0;i<arr.length;i++){
              nums[i]=list.get(i);
        }
        return nums;
    }
}