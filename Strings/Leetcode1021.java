/*
Problem: Remove Outermost Parentheses 

Approach:
- Maintain a variable `level` to track the current depth of nested parentheses.
- For every opening parenthesis '(':
  - Increment the nesting level.
  - Append it to the result only if it is not the outermost opening parenthesis.
- For every closing parenthesis ')':
  - Decrement the nesting level.
  - Append it to the result only if it is not the outermost closing parenthesis.
- Return the resulting string after removing the outermost parentheses from each primitive substring.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int level = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                level++;
                if (level > 1) {
                    result.append('(');
                }
            } else {
                level--;
                if (level > 0) {
                    result.append(')');
                }
            }
        }

        return result.toString();
    }
}
