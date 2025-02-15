class Solution {
    public int maxVowels(String s, int k) {
        int[] vowels = new int[128];
        int count = 0;
        int ans = 0;

        vowels['a'] = 1;
        vowels['e'] = 1;
        vowels['i'] = 1;
        vowels['o'] = 1;
        vowels['u'] = 1;

        for (int i = 0; i < k; i++) {
            count += vowels[s.charAt(i)];
        }

        ans = count;

        for (int j = k; j < s.length(); j++) {
            count += vowels[s.charAt(j)] - vowels[s.charAt(j - k)];
            ans = Math.max(ans, count);

            if (ans == k)
                return ans;
        }

        return ans;
    }
}