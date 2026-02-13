class Solution {
    public int maxDistinct(String s) {
    int[] frequency=new int[26];
    int n=s.length(),count=0;
    for(int i=0;i<n;i++)
    {
        int ch=(int)s.charAt(i)-97;
        if(frequency[ch]==0)
        {
            count++;
        }
        frequency[ch]++;
    } 
    return count;   
    }
}