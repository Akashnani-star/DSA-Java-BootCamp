/*

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

*/

/*

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]

Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]

*/

class Solution {
    public int[] runningSum(int[] nums) {
        int numsLength = nums.length;
        int ans[] = new int[numsLength];
        
        int prevSum = ans[0] = nums[0];
        
        for(int i=1;i<numsLength;i++){
            ans[i] = prevSum += nums[i];
        }
        return ans;
    }
}