Merge Sorted Array

Problem

Given two sorted integer arrays "nums1" and "nums2", merge "nums2" into "nums1" so that "nums1" becomes sorted in non-decreasing order.

The first "m" elements of "nums1" are valid elements, and "nums1" has enough space to hold all "n" elements of "nums2".

Approach

- Maintain three pointers:
  - "i" → points to the last position of "nums1".
  - "j" → points to the last valid element of "nums1".
  - "k" → points to the last element of "nums2".
- Traverse from the back of both arrays to avoid overwriting elements in "nums1".
- Compare "nums1[j]" and "nums2[k]".
- Place the larger element at "nums1[i]".
- If "j < 0", directly place the remaining elements from "nums2".
- Continue until all elements of "nums2" are merged.

Java Solution

class Solution { 
    public void merge(int[] nums1, int m, int[] nums2, int n) { 
        int i=m+n-1; 
        int j=m-1; 
        int k=n-1; 
        while(k>=0){ 
            if(j<0 || nums2[k]>=nums1[j]){ 
                nums1[i]=nums2[k]; 
                i--; 
                k--; 
            }else{ 
                nums1[i]=nums1[j]; 
                i--; 
                j--; 
            } 
        } 
    } 
}

Examples

Example 1

Input: [1, 2, 3, 0, 0, 0]
m = 3
nums2 = [2, 5, 6]
n = 3
Output: [1, 2, 2, 3, 5, 6]

The elements are merged from the back while maintaining sorted order.

Example 2

Input: [1]
m = 1
nums2 = []
n = 0
Output: [1]

There are no elements in "nums2" to merge.

Example 3

Input: [0]
m = 0
nums2 = [1]
n = 1
Output: [1]

Since "nums1" has no valid elements, the element from "nums2" is directly placed into "nums1".

Complexity

- Time Complexity: "O(m + n)"
- Space Complexity: "O(1)"

