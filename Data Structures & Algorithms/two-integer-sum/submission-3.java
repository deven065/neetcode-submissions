class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int row = 0; row < nums.length - 1; row++) {
            for (int col = row + 1; col < nums.length; col++) {
                if (target == nums[row] + nums[col]) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
