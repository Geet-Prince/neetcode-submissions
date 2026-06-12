
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];

            if (set.contains(rem)) {
                for (int j = 0; j < i; j++) {
                    if (nums[j] == rem) {
                        return new int[]{j, i};
                    }
                }
            }

            set.add(nums[i]);
        }

        return new int[]{};
    }
}