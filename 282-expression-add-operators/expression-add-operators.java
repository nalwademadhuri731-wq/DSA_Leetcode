
class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> addOperators(String num, int target) {

        backtrack(num, target, 0, "", 0, 0);
        return ans;
    }

    public void backtrack(String num, int target, int index,
                          String path, long value, long last) {

        if (index == num.length()) {
            if (value == target) {
                ans.add(path);
            }
            return;
        }

        for (int i = index; i < num.length(); i++) {

            // Prevent leading zeros
            if (i != index && num.charAt(index) == '0')
                break;

            String currStr = num.substring(index, i + 1);
            long curr = Long.parseLong(currStr);

            if (index == 0) {

                backtrack(num, target,
                        i + 1,
                        currStr,
                        curr,
                        curr);

            } else {

                // +
                backtrack(num, target,
                        i + 1,
                        path + "+" + currStr,
                        value + curr,
                        curr);

                // -
                backtrack(num, target,
                        i + 1,
                        path + "-" + currStr,
                        value - curr,
                        -curr);

                // *
                backtrack(num, target,
                        i + 1,
                        path + "*" + currStr,
                        value - last + last * curr,
                        last * curr);
            }
        }
    }
}