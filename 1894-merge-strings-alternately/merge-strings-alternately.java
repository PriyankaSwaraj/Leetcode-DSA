class Solution {
    public String mergeAlternately(String word1, String word2) {
      StringBuilder str=new StringBuilder();
      int m=word1.length(),n=word2.length(),i=0;
      while(i<m&&i<n)
      {
        str.append(word1.charAt(i));
        str.append(word2.charAt(i)); 
        i++;
      }
      str.append(word1.substring(i,m));
      str.append(word2.substring(i,n));
      return str.toString();
    }
}