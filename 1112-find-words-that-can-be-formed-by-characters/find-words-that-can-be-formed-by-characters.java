class Solution {
    public int countCharacters(String[] words, String chars) {
    int[] freq1=new int[26];
    int n=words.length,m=chars.length(),count=0;
    for(int i=0;i<m;i++)
    {
        freq1[chars.charAt(i)-97]++;
    }    
    for(int i=0;i<n;i++)
    {
        int k=words[i].length(),check=1;
        int[] freq2=new int[26];
        for(int j=0;j<k;j++)
        {
            int ch=(int)(words[i].charAt(j)-97);
            freq2[ch]++;
            if(freq1[ch]<freq2[ch])
            {
                check=0;
                break;
            }
        }
        if(check>0)
        {
            count += k;
        }
    }
    return count;
    }
}