class Solution {
    public long maxAlternatingSum(int[] nums) {
       int n=nums.length,k=0;
       long diff=0,ans=0;
       for(int i=0;i<n;i++)
       {
        nums[i] *= nums[i];
        ans += nums[i];
       }
       Arrays.sort(nums);
       n /=2;
       while(k<n)
       {
        diff += nums[k];
        k++;
       }
       return ans-(diff*2);
    }
}