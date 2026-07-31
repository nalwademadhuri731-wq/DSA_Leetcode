class Solution {
    public int sumFourDivisors(int[] nums) {

        int ans = 0;

        for (int n : nums) {

            int count = 0;
            int sum = 0;

            for (int i = 1; i * i <= n; i++) {

                if (n % i == 0) {

                    if (i == n / i) {
                        count++;
                        sum += i;
                    } else {
                        count += 2;
                        sum += i + n / i;
                    }

                    // Early stop if more than 4 divisors
                    if (count > 4)
                        break;
                }
            }

            if (count == 4)
                ans += sum;
        }

        return ans;
    }
}



// class Solution {
//     public int sumFourDivisors(int[] nums) {

//         int sum = 0;

//         for (int n : nums) {

//             ArrayList<Integer> list = new ArrayList<>();

//             for (int i = 1; i * i <= n; i++) {

//                 if (n % i == 0) {

//                     if (i == n / i)
//                         list.add(i);
//                     else {
//                         list.add(i);
//                         list.add(n / i);
//                     }
//                 }
//             }

//             if (list.size() == 4) {

//                 for (int x : list)
//                     sum += x;
//             }
//         }

//         return sum;
//     }
// }