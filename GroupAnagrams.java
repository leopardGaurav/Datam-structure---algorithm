import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26]; // frequency array for letters a-z

            // Count frequency of each character
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            // Build key from frequency array
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append(count[i]).append('#'); // delimiter needed
            }
            String key = sb.toString();

            // Add string to corresponding group
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }

    // Main method to test the solution
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);

        System.out.println(result);
    }
}
