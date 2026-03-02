class Solution {
    public int maxFreqSum(String s) {
     int[] freq=new int[26];
     for(char ch:s.toCharArray())
     {
        freq[ch-'a']++;
     }
     int max1=0,max2=0;
     for(int i=0;i<26;i++)
     {
        char ch=(char)(i+97);
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            max1=Math.max(max1,freq[i]);
        }
        else{
            max2=Math.max(max2,freq[i]);
        }
     }
     return max1+max2;
    }
}