/*
Problem: Remove Duplicates from Sorted Array

Approach:
- The array is already sorted, so duplicate elements will always
  appear next to each other.
- Maintain a variable `c` to represent the position where the next
  unique element should be stored.
- Start `c` at 1 because the first element is always unique.
- Traverse the array starting from index 1.
- Compare the current element with the previous element.
- If `nums[i] != nums[i - 1]`, it means a new unique element is found.
- Store this unique element at `nums[c]` and increment `c`.
- Return `c`, which represents the number of unique elements.

Example:
nums = [1, 1, 2, 2, 3]

1 == 1  -> duplicate
1 != 2  -> unique -> nums[1] = 2
2 == 2  -> duplicate
2 != 3  -> unique -> nums[2] = 3

Result:
nums = [1, 2, 3, ...]
c = 3

Therefore, return 3.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int c = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[c] = nums[i];
                c++;
            }
        }

        return c;
    }
}
