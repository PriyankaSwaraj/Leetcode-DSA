class Solution {
    public int largestInteger(int[] nums, int k) {
    int[] freq=new int[51];
    int n=nums.length;
    for(int i=0;i<=n-k;i++)
    {
        boolean[] check=new boolean[51];
        for(int j=i;j<i+k;j++)
        {
            if(!check[nums[j]])
            {
                freq[nums[j]]++;
                check[nums[j]]=true;
            }
        }
    }    
    int res=-1;
    for(int num:nums)
    {
        if(freq[num]==1)
        {
            res=Math.max(res,num);
        }
    }
    return res;
    }
}