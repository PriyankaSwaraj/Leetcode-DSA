class Solution {
    public int findTargetSumWays(int[] nums, int target) {
      return sum(nums,0,0,target);  
    }
    public int sum(int[] nums,int idx,int sum,int target) {
      if(idx==nums.length)
      {
        if(sum==target)
        return 1;
        return 0;
      }
    int plus = sum(nums,idx+1,sum+nums[idx],target);
    int minus = sum(nums,idx+1,sum-nums[idx],target);
    return plus+minus;
    }
}