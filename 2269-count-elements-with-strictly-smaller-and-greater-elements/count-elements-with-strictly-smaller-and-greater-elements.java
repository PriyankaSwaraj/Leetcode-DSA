class Solution {
    public int countElements(int[] nums) {
    int count=0,n=nums.length,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
    for(int i=0;i<n;i++)
    {
        if(nums[i]>max)
        {
            max=nums[i];
        }
        if(nums[i]<min)
        {
            min=nums[i];
        }
    }
    for(int i=0 ;i<n;i++)
    {
        if(nums[i]>min&&nums[i]<max)
        {
            count++;
        }
    }
    return count;    
    }
}