class Solution {
    public int longestValidParentheses(String s) {
      Stack<Integer> s1=new Stack<>();
      Stack<Integer> s2=new Stack<>();
      int n=s.length(),len=0,mlen=0;
      for(int i=0;i<n;i++)
      {
        if(s.charAt(i)=='(')
        {
            s1.push(i);
        }
        else
        {
            if(s1.size()>s2.size())
            s2.push(i);
            else{
                len=Math.max(len,Math.min(s1.size(),s2.size()));
                s1.clear();
                s2.clear();
            }
        }
      }   
      while(s2.size()>s1.size())
      {
        s2.pop();
      }
      while(!s1.isEmpty()&&!s2.isEmpty())
      {
        int c=s1.pop();
        if(s2.peek()>c)
        {
           mlen++;
           s2.pop();
        }
        else{
            len=Math.max(len,mlen);
            mlen=0;
        }
      }
     len=Math.max(len,mlen);
      return len*2;
    }
}