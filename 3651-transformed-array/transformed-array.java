class Solution {
    public int[] constructTransformedArray(int[] nums) {
     int n=nums.length;
     int[] res=new int[n];
     for(int i=0;i<n;i++)
     {
        int a=nums[i];
        if(a==0)
        {
            res[i]=a;
        }
        else if(a>0)
        {
             a += i;
            while(a>=n)
            {
               a -= n;
            }
            res[i]=nums[a];
        }
        else{
             a += i;
                while(a<0)
                {
               a += n; 
                }
            res[i]=nums[a];
        }
     }   
     return res;
    }
}