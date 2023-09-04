class Solution {
    public boolean canJump(int[] nums) {
                int n = nums.length;
        int i = 0;

        boolean found;

        while (i < n) {
            if (nums[i] >= n-1 || n == 1) {
                return true;
            }

            if (nums[i] == 0) {
                if (i == n - 1) {
                    return true;
                }
                int j = i - 1;
                int value = 2;
                found = false;
                while (j >= 0) {
                    if (nums[j] >= value) {
                        i=j;
                        found = true;
                        break;
                    }
                    value++;
                    j--;
                }
                if (!found) {
                    return false;
                }
            }
            i = i + nums[i];
        }


        return true;
    }
}