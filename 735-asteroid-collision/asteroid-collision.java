
class Solution {
    public int[] asteroidCollision(int[] arr) {

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];

            // Collision possible only when
            // stack top is positive and current is negative
            while (!s.isEmpty() && s.peek() > 0 && current < 0) {

                if (s.peek() < Math.abs(current)) {
                    // Stack asteroid explodes
                    s.pop();
                }
                else if (s.peek() == Math.abs(current)) {
                    // Both explode
                    s.pop();
                    current = 0;
                    break;
                }
                else {
                    // Current asteroid explodes
                    current = 0;
                    break;
                }
            }

            // Current asteroid survived
            if (current != 0) {
                s.push(current);
            }
        }

        int[] ans = new int[s.size()];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = s.get(i);
        }

        return ans;
    }
}

