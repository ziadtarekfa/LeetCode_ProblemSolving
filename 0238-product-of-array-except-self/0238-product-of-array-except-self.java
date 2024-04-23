class Solution {
    public int[] productExceptSelf(int[] nums) {
    int zerosCount = 0;
        int zeroIndex = 0;
        int[] result = new int[nums.length];
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroIndex = i;
                zerosCount++;
            }
            product = nums[i] * product;
        }

        if (zerosCount > 1) {
            Arrays.fill(result, 0);
        } else if (zerosCount == 1) {
            product = 1;
            System.out.println(zeroIndex);
            for (int i = 0; i < nums.length; i++) {
                if (i != zeroIndex) {
                    product = product * nums[i];
                }
            }
            Arrays.fill(result, 0);
            result[zeroIndex] = product;
        } else {
            for (int i = 0; i < nums.length; i++) {
                result[i] = product / nums[i];
            }
        }

        return result;
    }
}