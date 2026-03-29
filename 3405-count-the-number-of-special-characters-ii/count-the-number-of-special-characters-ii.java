class Solution {
    public int numberOfSpecialChars(String word) {
     int[] freq1=new int[26];
     int[] freq2=new int[26];
     int n=word.length(),count=0;
     for(int i=0;i<n;i++)
     {
        char ch=word.charAt(i);
        if(Character.isLowerCase(ch))
        {
            freq1[ch-'a']=i+1;
        }
        else{
            if(freq2[ch-'A']<1)
            freq2[ch-'A']=i+1;
        }
     }
     for(int i=0;i<26;i++)
     {
        if(freq1[i]>0&&freq2[i]>freq1[i])
        count++;
     }
     return count;
    }
}