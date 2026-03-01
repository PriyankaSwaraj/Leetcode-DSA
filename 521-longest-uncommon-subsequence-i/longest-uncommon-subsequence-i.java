class Solution {
    public int findLUSlength(String a, String b) {
      int m=a.length(),n=b.length();
      if(m<n)
      {
        m=n;
      }  
     return a.equals(b)?-1:m;   
    }
}