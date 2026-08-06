class Solution {
    public int smallestNumber(int n, int t) {
    for(int i=n;i<1000;i++)
    {
        if(div(i)%t==0)
        return i;
    }    
    return n;
    }
    public int div(int n)
    {
        int mul=1;
        while(n>0)
        {
            mul *= n%10;
            n/=10;
        }
        return mul;
    }
}