class Solution {
    public int reverseDegree(String s) {
     int degree=0,n=s.length();
     for(int i=0;i<n;i++)
     {
        char ch=s.charAt(i);
        int pos=ch-(71+(2*(ch-'a')));
        degree += pos*(i+1);
     }
     return degree;   
    }
}