/*
Problem: Longest Common Prefix

Approach:
- Take the first string as the reference.
- Traverse each character of the first string.
- For every character, compare it with the character at the same index in all other strings.
- If any string is shorter or a character does not match, return the prefix formed so far.
- Otherwise, append the matching character to the result.
- Continue until all characters of the first string are processed.

Time Complexity: O(n × m)
Space Complexity: O(m)
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder array = new StringBuilder();

        for (int k = 0; k < strs[0].length(); k++) {

            char c = strs[0].charAt(k);

            for (int j = 0; j < strs.length; j++) {

                if (k >= strs[j].length()) {
                    return array.toString();
                }

                if (strs[j].charAt(k) != c) {
                    return array.toString();
                }
            }

            array.append(c);
        }

        return array.toString();
    }
}
