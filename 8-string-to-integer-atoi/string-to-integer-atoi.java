class Solution {
    public int myAtoi(String s) {
      String str="";
      int n=s.length(),i=0;
      while(i<n&&s.charAt(i)==' ')
      {
        i++;
      }
      int num=1;
      long result=0;
      if(i<n&&(s.charAt(i)=='-'||s.charAt(i)=='+'))
      {
        if(s.charAt(i)=='-')
        num *= -1;
        i++;
      }
      while(i<n&&Character.isDigit(s.charAt(i)))
      {
        long digit=s.charAt(i)-'0';
        if(result>Integer.MAX_VALUE/10||result==Integer.MAX_VALUE/10&&digit>7)
        {
            return num==-1?Integer.MIN_VALUE:Integer.MAX_VALUE;
        }
        result = (result*10)+digit;
        i++;
      }
      return num*(int)result;
    }
}