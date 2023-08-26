class Solution {
    public int majorityElement(int[] nums) {
            HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int value = entry.getValue();
            if (value > nums.length / 2) {
                return entry.getKey();
            }
        }
        return 0;
    }
}