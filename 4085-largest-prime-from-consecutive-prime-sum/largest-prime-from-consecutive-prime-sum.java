class Solution {
    public int largestPrime(int n) {
    boolean[] prime=new boolean[n+1];
    for(int i=2;i*i<=n;i++)
    {
        if(!prime[i])
        {
            for(int j=i*i;j<=n;j += i)
            {
                prime[j]=true;
            }
        }
    }    
    int sum=0,count=0,i=2;
    while(i<=n&&sum<=n)
    {
        if(!prime[i])
        {
            sum += i;
            if(sum<=n&&!prime[sum])
            {
               count=sum;
            }
        }
        i++;
    }
    return count;
    }
}