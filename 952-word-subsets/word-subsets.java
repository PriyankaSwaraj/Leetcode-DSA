class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
    ArrayList<String> result=new ArrayList<>();
    int[] freq1=new int[26];
    String str=words2[0];
    int n=words2.length,l=str.length();
    for(int i=0;i<l;i++)
    {
        freq1[str.charAt(i)-'a']++;
    }
    for(int i=1;i<n;i++)
    {
        int[] freq2=new int[26];
        String s=words2[i];
        int m=s.length();
        for(int j=0;j<m;j++)
        {
            freq2[s.charAt(j)-'a']++;
        }
        for(int j=0;j<26;j++)
        {
            freq1[j]=Math.max(freq1[j],freq2[j]);
        }
    }
    int k=words1.length;
    for(int j=0;j<k;j++)
    {
        int[] freq2=new int[26];
        String s=words1[j];
        int m=s.length();
        for(int i=0;i<m;i++)
        {
            freq2[s.charAt(i)-'a']++;
        }
        boolean check=true;
        for(int i=0;i<26;i++)
        {
            if(freq1[i]>freq2[i])
            {
                check=false;
                break;
            }
        }
        if(check)
        result.add(s);
    }
    return result;
    }
}