class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int []num3=new int [n+m];
 
        int i=0;
        int j=0;
        int k=0;
        while(i<n&&j<m){
            if(nums1[i]<nums2[j]){
                num3[k++]=nums1[i];
                i++;
            }else{
                 num3[k++]=nums2[j];
                 j++;
            }
        }
        while(i<n){
            num3[k++]=nums1[i];
            i++; 
        }
        while(j<m){
             num3[k++]=nums2[j];
             j++;
        }
        double ans=-1;
        if((n+m)%2==1){
           int t=(n+m)/2;
           ans=(double)num3[t];
        }else{
           int a=num3[(n+m)/2];
           int b=num3[((n+m)/2)-1];
           ans=(double)(a+b)/2;
        }
        return ans;
    }
}