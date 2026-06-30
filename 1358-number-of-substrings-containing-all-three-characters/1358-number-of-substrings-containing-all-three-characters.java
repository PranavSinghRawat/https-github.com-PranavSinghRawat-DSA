class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] count = new int[3];
        int low = 0;
        int ans = 0;
        for (int high=0;high<n;high++) {
            count[s.charAt(high)-'a']++;
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                ans += n - high;
                count[s.charAt(low) - 'a']--;
                low++;
            }
        }

        return ans;
    }
}