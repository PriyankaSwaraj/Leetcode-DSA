class Solution {
    public List<String> commonChars(String[] words) {
    int[] freq=new int[26];
    int n=words.length,m=words[0].length();
    List<String> arr=new ArrayList<>();
    for(int i=0;i<m;i++)
    {
        freq[words[0].charAt(i)-97]++;
    }
    for(int i=1;i<n;i++)
    {
        int[] freq2=new int[26];
        for(int j=0;j<words[i].length();j++)
        {
          freq2[words[i].charAt(j)-97]++;  
        }
        for(int j=0;j<26;j++)
        {
            freq[j]=Math.min(freq[j],freq2[j]);
        }
    }
    for(int i=0;i<26;i++)
    {
        if(freq[i]>0)
        {
            int a=freq[i];
            while(a>0)
            {
                char ch=(char)(i+97);
                arr.add(Character.toString(ch));
                a--;
            }
        }
    }
    return arr;
    }
}