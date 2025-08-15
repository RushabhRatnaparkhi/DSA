

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            Set<Character> characters = new HashSet<>();
            int streak = 0;
            int curr = i;

            while (curr < s.length() && !characters.contains(s.charAt(curr))) {
                characters.add(s.charAt(curr));
                streak++;
                curr++;
            }

            res = Math.max(res, streak);
        }

        return res;
    }
}
