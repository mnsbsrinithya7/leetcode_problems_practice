```java
/*
Problem: Check if Array Is Sorted and Rotated

Approach:
- A sorted array has elements in non-decreasing order.
- After rotating a sorted array, there can be at most one position
  where the current element is greater than the next element.
- Maintain a variable `missed` to count these order breaks.
- Treat the array as circular by using `(i + 1) % n`.
  This allows the last element to be compared with the first element.
- If the number of order breaks is at most 1, the array is sorted
  and rotated.

Example:
nums = [3, 4, 5, 1, 2]

3 <= 4  ✓
4 <= 5  ✓
5 > 1   ✗  -> missed = 1
1 <= 2  ✓
2 <= 3  ✓  -> circular comparison

Since `missed <= 1`, return true.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean check(int[] nums) {

        int missed = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] > nums[(i + 1) % n]) {
                // % n makes the array circular
                missed++;
            }
        }

        return missed <= 1;
    }
}
```
