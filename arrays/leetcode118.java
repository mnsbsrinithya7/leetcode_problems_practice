import java.util.*;

/*
 * Problem: Pascal's Triangle
 * LeetCode: 118
 *
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle:
 * - The first and last element of every row are 1.
 * - Every other element is the sum of the two elements directly above it.
 *
 * Example:
 * Input: 5
 *
 * Output:
 * [
 *     [1],
 *     [1, 1],
 *     [1, 2, 1],
 *     [1, 3, 3, 1],
 *     [1, 4, 6, 4, 1]
 * ]
 *
 * Approach:
 * 1. Create an empty list called result to store all rows.
 * 2. For each row, create a new ArrayList.
 * 3. Add 1 at the beginning and end of each row.
 * 4. For elements in between, calculate:
 *
 *       result[i - 1][j - 1] + result[i - 1][j]
 *
 * 5. Add the completed row to result.
 * 6. Return result.
 *
 * Time Complexity:
 * O(numRows^2)
 *
 * There are approximately numRows^2 / 2 elements in the triangle.
 *
 * Space Complexity:
 * O(numRows^2)
 *
 * The result itself contains O(numRows^2) elements.
 */

class Solution {

    public List<List<Integer>> generate(int numRows) {

        // Stores all rows of Pascal's Triangle
        List<List<Integer>> result = new ArrayList<>();

        // Generate each row
        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            // Each row contains i + 1 elements
            for (int j = 0; j <= i; j++) {

                // First and last elements are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } 
                else {

                    // Current element = sum of two elements
                    // directly above it in the previous row
                    int value = result.get(i - 1).get(j - 1)
                              + result.get(i - 1).get(j);

                    row.add(value);
                }
            }

            // Add the completed row to the result
            result.add(row);
        }

        return result;
    }
}
