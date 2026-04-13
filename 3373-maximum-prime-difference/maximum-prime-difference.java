class Solution {
    public int maximumPrimeDifference(int[] nums) {
     boolean[] prime=new boolean[101];
     prime[1]=true;
     int n=nums.length;
     for(int i=2;i*i<101;i++)
     {
        if(!prime[i])
        {
            for(int j=i*i;j<101;j += i)
            {
                prime[j]=true;
            }
        }
     } 
     int min=n,max=0;
     for(int i=0;i<n;i++)
     {
        if(!prime[nums[i]])
        {
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
     }
     return max-min;  
    }
}