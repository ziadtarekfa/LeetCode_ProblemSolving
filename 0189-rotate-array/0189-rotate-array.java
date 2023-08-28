class Solution {
    public void rotate(int[] nums, int k) {
            int arrLength = nums.length;
        ArrayList<Integer> arrayList = new ArrayList<>();

        if (arrLength == 1 || k == 0 || arrLength == k) {
            return;
        }
        if (k > arrLength) {
               k= k % arrLength;
        }

        int right = arrLength - k;

        for (int i = right; i < arrLength; i++) {
            arrayList.add(nums[i]);
        }

        for (int i = 0; i < right; i++) {
            arrayList.add(nums[i]);
        }


        int[] result = arrayList.stream().mapToInt(Integer::intValue).toArray();

        System.arraycopy(result, 0, nums, 0, result.length);

    }
}