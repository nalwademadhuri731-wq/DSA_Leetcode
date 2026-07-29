class Solution {
   public int tofind(int a,int b,int n,int c){
    if(c==n){
        return b;
    }
    int sum=a+b;
   
    return tofind( b, sum, n, c+1);
   }
    public int fib(int n) {
        if(n==0)return 0;
        if(n==1)return 1;
        if(n==2)return 1;
        return tofind(0,1,n,1);
    }
}