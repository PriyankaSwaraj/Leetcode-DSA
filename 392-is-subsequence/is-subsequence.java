class Solution {
    public boolean isSubsequence(String s, String t) {
     int n=s.length(),m=t.length();
     int i=0,j=0;
     while(i<n&&j<m)
     {
        if(t.charAt(j)==s.charAt(i))
        {
            i++;
            j++;
        }
        else{
            j++;
        }
     }   
     return i==n;
    }
}