class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
    int count=0,n=words.length;
    boolean[] freq=new boolean[26];
    for(char ch:allowed.toCharArray())
    {
        freq[ch-'a']=true;
    }
    for(int i=0;i<n;i++)
    {
        boolean check=true;
        for(char ch : words[i].toCharArray())
        {
            if(!freq[ch-'a'])
            {
                check=false;
                break;
            }
        }
        if(check)
        {
            count++;
        }
    }
    return count++;
    }
}