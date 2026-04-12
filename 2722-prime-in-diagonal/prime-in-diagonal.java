class Solution {
    public int diagonalPrime(int[][] nums) {
    int n=nums.length,max=0;
    for(int i=0;i<n;i++)
    {
        if(isPrime(nums[i][i]))
        max=Math.max(max,nums[i][i]);
    }    
    for(int i=0,j=n-1;i<n;i++,j--)
    {
        if(isPrime(nums[i][j]))
        max=Math.max(max,nums[i][j]);
    }
    return max;
    }
    public boolean isPrime(int n)
    {
        if(n==1)
        return false;
        if(n==2)
        return true;
        for(int i=2;i*i<=n;i++)
        {
          if(n%i==0)
          return false;
        }
        return true;
    }
}