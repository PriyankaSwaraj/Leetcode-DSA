class Solution {
    public String rearrangeString(String s, char x, char y) {
     int[] word = new int[26];
     for(char ch:s.toCharArray())
     {
       word[ch-'a']++;
     }  
     int y1=word[y-'a'];
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<y1;i++)
     {
        sb.append(y);
     }
     for(int i=0;i<26;i++)
     {
        char ch=(char)('a'+i);
        int x1=word[i];
        if(ch != y)
        {
            for(int j=0;j<x1;j++)
            {
                sb.append(ch);
            }
        }
     }
     return sb.toString();
    }
}