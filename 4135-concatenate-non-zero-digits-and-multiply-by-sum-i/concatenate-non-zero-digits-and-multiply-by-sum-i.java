class Solution {
    public long sumAndMultiply(int n) {
    long sum=0;
        String str ="";
        while(n>0)
            {
                long a = (long)n%10;
                sum += a;
                if(a!=0)
                {
                str += Long.toString(a);
                }
                n=n/10;
            }
        String sb = new StringBuilder(str).reverse().toString();
        if(str=="")
        {
            return (long)0;
        }
        return Long.parseLong(sb)*sum;
    }
}