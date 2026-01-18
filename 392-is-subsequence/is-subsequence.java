class Solution {
    public boolean isSubsequence(String s, String t) {
    int m=s.length(),n=t.length();
    int k=0,i=0;
    if(m==0)
    {
        return true;
    }
    char ch =s.charAt(k);
    while(k<m&&i<n)
    {
        if(t.charAt(i)==ch){
            k++;
            if(k<m)
            ch = s.charAt(k);
        }
        i++;
    }
    if(k==m)
    {
        return true;
    }
    return false;
    }
}