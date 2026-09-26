

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

