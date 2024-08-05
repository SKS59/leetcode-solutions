class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        if (index >= 0) {

            for (int i = nums.length - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    swap(nums,index,i);
                    break;
                }
            }
        }
        reverse(nums,index+1,nums.length-1);
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r)
            swap(nums, l++, r--);
    }

    private void swap(int[] nums, int i, int j) {
        final int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
