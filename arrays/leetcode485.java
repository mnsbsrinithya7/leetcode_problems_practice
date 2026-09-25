class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int c = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                c++;
                result = Math.max(result, c);
            } else {
                c = 0;
            }
        }

        return result;
    }
}
