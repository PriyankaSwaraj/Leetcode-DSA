class Solution {
    public int numberOfSpecialChars(String word) {
     boolean[] freq1=new boolean[26];
     boolean[] freq2=new boolean[26];
     int n=word.length(),count=0;
     for(int i=0;i<n;i++)
     {
        char ch=word.charAt(i);
        if(Character.isLowerCase(ch))
        {
            freq1[ch-'a']=true;
        }
        else{
            freq2[ch-'A']=true;
        }
     }   
    for(int i=0;i<26;i++)
    {
        if(freq1[i]&&freq2[i])
        count++;
    }
    return count;
    }
}