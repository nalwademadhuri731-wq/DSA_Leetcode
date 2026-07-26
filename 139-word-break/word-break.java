class Solution {

    public boolean tofind(String s, int i, HashSet<String> set, Boolean[] dp) {

        if (i == s.length()) {
            return true;
        }

        if (dp[i] != null) {
            return dp[i];
        }

        for (int j = i; j < s.length(); j++) {

            if (set.contains(s.substring(i, j + 1))) {

                if (tofind(s, j + 1, set, dp)) {
                    dp[i] = true;
                    return true;
                }
            }
        }

        dp[i] = false;
        return false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {

        HashSet<String> set = new HashSet<>(wordDict);

        Boolean[] dp = new Boolean[s.length()];

        return tofind(s, 0, set, dp);
    }
}