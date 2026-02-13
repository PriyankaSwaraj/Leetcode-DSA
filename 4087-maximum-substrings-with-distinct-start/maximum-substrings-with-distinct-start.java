class Solution {
    public int maxDistinct(String s) {
    int[] frequency=new int[26];
    int n=s.length(),count=0;
    for(int i=0;i<n;i++)
    {
        if(frequency[s.charAt(i)-'a']==0)
        {
            count++;
        }
        frequency[s.charAt(i)-'a']++;
    } 
    return count;   
    }
}