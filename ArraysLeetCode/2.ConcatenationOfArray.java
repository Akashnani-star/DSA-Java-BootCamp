/*

Question:
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

*/

/*

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]

Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
*/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int numsLength = nums.length;
        int ans[] = new int[2*numsLength];
        
        for(int i=0;i<numsLength;i++){
            ans[i] = nums[i];
            ans[numsLength+i] = nums[i];
        }
        return ans;
    }
}