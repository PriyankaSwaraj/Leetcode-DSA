class Solution {
    public int integerBreak(int n) {
       int result=1,bon=(int)Math.sqrt(n)+1;
       for(int i=2;i<=bon;i++)
       {
          int q=n/i,r=n%i;
          int ans=Math.max((int)(Math.pow(i,q-1))*(r+i),(int)(Math.pow(i,q))*r);
          result=Math.max(result,ans);
       }
       return n<4?n-1:result;
    }
}