class Solution {
    public int getLucky(String s, int k) {
    int sum=0;
    int m=s.length();
    for(int i=0;i<m;i++)
    {
        char ch=s.charAt(i);
        int n=(int)ch-96;
        while(n>0)
        {
        sum += n%10;
        n /=10;
        }
    }
     k--;
     while(k>0&&sum>9)
     {
        int sum1=0;
      while(sum>0)
      {
        sum1 += sum%10;
        sum /= 10;
      }
      sum=sum1;
      k--;
     }
    return sum;
    }
}