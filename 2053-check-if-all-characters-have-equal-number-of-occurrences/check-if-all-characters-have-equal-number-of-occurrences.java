class Solution {
    public boolean areOccurrencesEqual(String s) {
    int[] freq1=new int[26];
    char[] num=s.toCharArray();
    for(char ch:num)
    {
        freq1[ch-'a']++;
    }    
   int n=freq1[num[0]-'a'];
    for(char ch:num)
    {
        if(freq1[ch-'a']!=n)
        {
            return false;
        }
    }
    return true;
    }
}