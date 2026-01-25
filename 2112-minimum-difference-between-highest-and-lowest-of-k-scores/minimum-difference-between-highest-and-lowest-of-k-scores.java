class Solution {
    public int minimumDifference(int[] nums, int k) {
     Arrays.sort(nums);
     int n=nums.length,max=Integer.MAX_VALUE;
     for(int i=0;i<=n-k;i++)
     {
        max=Math.min(max,nums[i+k-1]-nums[i]);
     }
     return max;
    }
}