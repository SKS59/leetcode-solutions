class Solution {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int majorityNum = nums[0];
        int vote = 0;
        for (int num : nums) {
            vote += num == majorityNum ? 1 : -1;
            if (vote == 0) {
                majorityNum = num;
                vote = 1;
            }
        }
        return majorityNum;
    }
}
