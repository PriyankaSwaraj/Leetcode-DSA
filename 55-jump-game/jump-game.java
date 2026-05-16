class Solution {
    public boolean canJump(int[] nums) {
    int n=nums.length;
    for(int i=1;i<n;i++)
    {
        boolean check=false;
      for(int j=0;j<i;j++)
      {
        if(nums[j]+j>=i)
        {
            check=true;
            break;
        }
      }
      if(!check)
      return check;
    } 
    return true;   
    }
}