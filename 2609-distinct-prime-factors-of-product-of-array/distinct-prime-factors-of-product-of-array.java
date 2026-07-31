


class Solution {
    public int distinctPrimeFactors(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            for (int i = 2; i * i <= num; i++) {

                while (num % i == 0) {
                    set.add(i);
                    num /= i;
                }
            }

            if (num > 1) {
                set.add(num);
            }
        }

        return set.size();
    }
}















// class Solution {
//     public boolean isprime(int j){
//          for (int i = 2; i * i <= j; i++) {
//             if (j % i == 0) return false;
//         }
//         return true;
//     }
//     public int distinctPrimeFactors(int[] nums) {
//       HashSet<Integer>list=new HashSet<>();
    
//         for(int i=0;i<nums.length;i++){
//             for(int j=2;j<=nums[i];j++){
//                 if(nums[i]%j==0){
//                     if(isprime(j)){
//                     list.add(j);
//                     }
//                 }
//             }
//         }
//  return list.size();
//         }
//       }
      
