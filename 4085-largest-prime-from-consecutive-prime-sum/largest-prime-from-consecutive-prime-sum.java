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
    long sum=0,count=0;
    for(int i=2;i<=n;i++)
    {
        if(!prime[i])
        {
            sum += (long)i;
            if(sum<=n&&!prime[(int)sum])
            count=sum;
        }
    }
    return (int)count;
    }
}