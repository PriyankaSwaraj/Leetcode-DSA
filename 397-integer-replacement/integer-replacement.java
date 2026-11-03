class Solution {
    public int integerReplacement(int n) {
        if(n==Integer.MAX_VALUE)
        {
            return 32;
        }
      return recur(n);
    }
    public int recur(int n)
    {
        if(n==1)
        {
            return 0;
        }
        int take=2000,nottake=2000;
        if((n&1)==0)
        {
            take=1+recur(n/2);
        }
        else{
            take=1+recur(n-1);
            nottake=1+recur(n+1);
        }
        return Math.min(take,nottake);
    }
}