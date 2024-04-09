class Solution {
    public int removeDuplicates(int[] nums) {
                Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int i = 0;
        for (int element : set) {
            nums[i] = element;
            i++;
        }

        return set.size();
    }
}