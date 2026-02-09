class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    int[] freq1=new int[26];
    int[] freq2=new int[26];
    int n=ransomNote.length(),m=magazine.length();
    for(int i=0;i<m;i++)
    {
        freq1[magazine.charAt(i)-97]++;
    }    
    for(int i=0;i<n;i++)
    {
        int ch=(int)(ransomNote.charAt(i)-97);
        freq2[ch]++;
        if(freq1[ch]<freq2[ch])
        {
            return false;
        }
    }
   return true;
    }
}