class Solution {
    public int minimumDistance(int[] nums) {
    int max=100000;
    int n=nums.length;
    for(int i=0;i<n;i++)
    {
        int num=nums[i];
        for(int j=i+1;j<n;j++)
        {
            if(nums[j]==num)
            {
                int curr=j-i;
                for(int k=j+1;k<n;k++)
                {
                    if(nums[k]==num)
                    {
                        curr += k-j;
                        curr += k-i;
                        max=Math.min(max,curr);
                        break;
                    }
                }
            }
        }
    } 
    return max==100000?-1:max;   
    }
}