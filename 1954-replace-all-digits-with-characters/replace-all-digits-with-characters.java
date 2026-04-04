class Solution {
    public String replaceDigits(String s) {
    StringBuilder sb=new StringBuilder(s);
    int n=s.length();
    for(int i=1;i<n;i += 2)
    {
        int num=s.charAt(i-1)+(s.charAt(i)-48);
        sb.setCharAt(i,(char)(num));
    }    
    return sb.toString();
    }
}