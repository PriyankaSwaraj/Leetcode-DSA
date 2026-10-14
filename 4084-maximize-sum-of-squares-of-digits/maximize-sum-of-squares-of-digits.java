class Solution {
    public String maxSumOfSquares(int num, int sum) {
      String str="";
      int n=sum/9,m=sum%9,no=num;
      str += "9".repeat(n);
      num -= n;
      if(num>0)
      {
      str += Integer.toString(m);
      m=0;
      }
      if(num>1)
      str += "0".repeat(num-1);
      return m==0?str:"";
    }
}