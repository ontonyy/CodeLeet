import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;

        while (i < s.length() && j < s.length()) {
            char c = s.charAt(j);

            if (!set.contains(c)) {
                set.add(c);
                j++;
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
    }
}
