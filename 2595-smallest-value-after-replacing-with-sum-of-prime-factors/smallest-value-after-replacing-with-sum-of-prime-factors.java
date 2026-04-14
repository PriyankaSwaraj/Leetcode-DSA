class Solution {
    public int smallestValue(int n) {
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
     int sum2=n;
     while(prime[n])
     { 
        int i=2,sum=0,n1=n;
     while(i<=n1&&n>0)
     {
        if(!prime[i]&&n%i==0)
        {
            while(n%i==0)
            {
                sum += i;
                n /=i;
            }
        }
        i++;
     }
     if(n1==sum)
     {
     break;
     }
     n=sum;
     sum2=sum;
     }
     return sum2;  
    }
}