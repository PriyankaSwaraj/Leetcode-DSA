class Solution {
    public int maxNumberOfBalloons(String text) {
    int[] freq1=new int[26];
    int[] freq2=new int[26];
    for(char ch:text.toCharArray())
    {
        freq2[ch-'a']++;
    } 
    String str="balloon";
    char[] word=str.toCharArray();
    for(char ch:word)
    {
        freq1[ch-'a']++;
    }   
    int count=Integer.MAX_VALUE;
    for(char ch:word)
    {
        count=Math.min(count,freq2[ch-'a']/freq1[ch-'a']);
    }
    return count;
    }
}