class Solution {
    public int maxSum(int[] nums) {
    int sum=-1,n=nums.length;
    int[] large=new int[n];
    for(int i=0;i<n;i++)
    {
        int num=nums[i];
        int lar=0;
        while(num>0)
        {
            lar=Math.max(num%10,lar);
            num /= 10;
        }
        large[i]=lar;
    }    
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(large[i]==large[j])
            {
                sum =Math.max(sum,nums[i]+nums[j]);
            }
        }
    }
    return sum;
    }
}