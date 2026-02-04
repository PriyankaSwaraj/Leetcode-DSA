class Solution {
    public String removeOccurrences(String s, String part) {
    int n=s.length(),m=part.length();
    StringBuilder sb=new StringBuilder(s);
    int a=a=sb.indexOf(part);
    while(a!=-1)
    {
        sb.delete(a,a+m);
        a=sb.indexOf(part);
    }  
    return sb.toString();
    }
}