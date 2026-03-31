class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
    int n=nums.length,count=0;
    for(int i=0;i<n;i++)
    {
        int a=i+k,b=i-k;
        boolean check=true;
        if(a<n&&nums[a]>=nums[i])
        {
            check=false;
        }
        if(b>=0&&nums[b]>=nums[i])
        {
            check=false;
        }
        if(check)
        count += nums[i];
    }  
    return count;  
    }
}