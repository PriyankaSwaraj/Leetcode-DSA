class Solution {
    public int[] transformArray(int[] nums) {
        int count=0,n=nums.length;
      for(int i=0;i<n;i++)
      {
        if(nums[i]%2==0)
        {
            count++;
        }
      }  
    for(int i=0;i<count;i++)
    {
        nums[i]=0;
    }
    for(int j=count;j<n;j++)
    {
        nums[j]=1;
    }
      return nums;
    }
}