public class minimum_ascii {

    public static int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        // dp[i][j] = minimum ASCII delete sum to make
        // s1[i..end] and s2[j..end] equal
        int[][] dp = new int[m + 1][n + 1];

        // Case: s1 finished, delete remaining chars of s2
        for (int j = n - 1; j >= 0; j--) {
            dp[m][j] = dp[m][j + 1] + s2.charAt(j);
        }

        // Case: s2 finished, delete remaining chars of s1
        for (int i = m - 1; i >= 0; i--) {
            dp[i][n] = dp[i + 1][n] + s1.charAt(i);
        }

        // Fill DP table from bottom-right to top-left
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                if (s1.charAt(i) == s2.charAt(j)) {
                    // Characters match → keep both
                    dp[i][j] = dp[i + 1][j + 1];
                } else {
                    // Characters differ → choose cheaper delete
                    int deleteFromS1 = s1.charAt(i) + dp[i + 1][j];
                    int deleteFromS2 = s2.charAt(j) + dp[i][j + 1];
                    dp[i][j] = Math.min(deleteFromS1, deleteFromS2);
                }
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        System.out.println(minimumDeleteSum("sea", "eat"));     // 231
        System.out.println(minimumDeleteSum("delete", "leet")); // 403
    }
}
