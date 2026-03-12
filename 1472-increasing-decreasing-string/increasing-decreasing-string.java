class Solution {
    public String sortString(String s) {
    int[] freq=new int[26];
    char[] chars=s.toCharArray();
    for(char ch:chars)
    {
        freq[ch-'a']++;
    }    
    StringBuilder sb=new StringBuilder();
    int count=0,n=s.length();
     while(count<n)
     {
        for(int i=0;i<26;i++)
        {
            if(freq[i]>0)
            {
                sb.append((char)(i+97));
                freq[i]--;
                count++;
            }
        }
        for(int i=25;i>=0;i--)
        {
            if(freq[i]>0)
            {
                sb.append((char)(i+97));
                freq[i]--;
                count++;
            }
        }
     }
     return sb.toString();
    }
}