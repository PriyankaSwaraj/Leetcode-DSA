class Solution {
    public int rearrangeCharacters(String s, String target) {
     int[] freq=new int[26];
     int[] freq2=new int[26];
     int n=s.length(),m=target.length();
     for(int i=0;i<n;i++)
     {
        freq[s.charAt(i)-97]++;
     }
     int count=101;
     for(int i=0;i<m;i++)
     {
       freq2[target.charAt(i)-97]++;
     }
     for(int i=0;i<26;i++)
     {
        if(freq2[i]!=0)
        {
        count=Math.min(count,freq[i]/freq2[i]);
        }
     }     
     return count;
    }
}