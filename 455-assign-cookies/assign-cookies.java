class Solution {
    public int findContentChildren(int[] g, int[] s) {
    int m=g.length,n=s.length;
    int count=0,i=0,j=0;
    Arrays.sort(g);
    Arrays.sort(s);
    while(i<m&&j<n)
    {
       if(s[j]>=g[i])
       {
        count++;
        i++;
        j++;
       }
       else{
        j++;
       }
    }
    return count; 
    }
}