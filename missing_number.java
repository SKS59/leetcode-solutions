class Solution {
    public int missingNumber(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++)
            sum1+=nums[i];
        for(int i=0;i<=nums.length;i++)
            sum2+=i;
        return sum2-sum1;

    }
}

// class Solution {
//     public int missingNumber(int[] nums) {
//         int ans=0;
//         int sum2=0;
//         for(int i=0;i<nums.length;i++)
//             ans^=nums[i];
//         for(int i=0;i<=nums.length;i++)
//             ans^=i;
//         return ans;

//     }
// }
