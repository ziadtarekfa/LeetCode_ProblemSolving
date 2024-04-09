class Solution {
    public int removeElement(int[] nums, int val) {
                int[] result = new int[nums.length];
        int j = 0;
        for (int num : nums) {
            if (num != val) {
                result[j] = num;
                j++;
            }
        }
        System.arraycopy(result, 0, nums, 0, result.length);
        return j;
    }
}