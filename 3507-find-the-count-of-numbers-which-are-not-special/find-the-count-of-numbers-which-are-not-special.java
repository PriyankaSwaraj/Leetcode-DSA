class Solution {
    public int nonSpecialCount(int l, int r) {
    double s=Math.sqrt(r);
    int m=(int)s+1;
    boolean[] prime=new boolean[m];
   for(int i=2;i<m;i++)
   {
    if(!prime[i])
    {
        for(int j=i*i;j<m;j +=i)
        {
            prime[j]=true;
        }
    }
   }
   int count=r-l+1;
   for(int i=2;i<m;i++)
   {
    if(!prime[i])
    {
        if(i*i>=l&&i*i<=r)
        count--;
    }
   }
    return count;
    }
}