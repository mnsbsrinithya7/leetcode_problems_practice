/*
Problem: Find the Index of the First Occurrence in a String (LeetCode 28)

Approach:
- Store the first character of the needle.
- Traverse the haystack and look for positions where the first character matches.
- From each matching position, compare the remaining characters of the needle with the haystack one by one.
- If all characters match, return the starting index.
- If no complete match is found, return -1.

Time Complexity: O((n - m + 1) × m)
Space Complexity: O(1)
*/

class Solution {
    public int strStr(String haystack, String needle) {

        char c = needle.charAt(0);

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.charAt(i) == c) {

                int j = 0;
                int k = i;

                while (j < needle.length() &&
                       k < haystack.length() &&
                       needle.charAt(j) == haystack.charAt(k)) {

                    j++;
                    k++;
                }

                if (j == needle.length()) {
                    return i;
                }
            }
        }

        return -1;
    }
}
