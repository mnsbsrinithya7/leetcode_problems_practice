Check if Array Is Monotonic

Problem

An array is monotonic if it is either:

- Monotone increasing: "nums[i] <= nums[i + 1]"
- Monotone decreasing: "nums[i] >= nums[i + 1]"

Given an integer array "nums", return "true" if the array is monotonic, otherwise return "false".

Approach

- Maintain two counters:
  - "inc" → counts increasing adjacent pairs.
  - "dec" → counts decreasing adjacent pairs.
- Traverse the array and compare each element with the next element.
- If all adjacent pairs are increasing, the array is monotone increasing.
- If all adjacent pairs are decreasing, the array is monotone decreasing.
- Equal elements satisfy both conditions.

Java Solution

class Solution {
    public boolean isMonotonic(int[] nums) {
        int inc = 0;
        int dec = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                inc++;
            }

            if (nums[i] >= nums[i + 1]) {
                dec++;
            }
        }

        return inc == nums.length - 1 || dec == nums.length - 1;
    }
}

Examples

Example 1

Input:  [1, 2, 2, 3]
Output: true

The array is monotone increasing.

Example 2

Input:  [6, 5, 4, 4]
Output: true

The array is monotone decreasing.

Example 3

Input:  [1, 3, 2]
Output: false

The array is neither completely increasing nor completely decreasing.

Complexity

- Time Complexity: "O(n)"
- Space Complexity: "O(1)"
