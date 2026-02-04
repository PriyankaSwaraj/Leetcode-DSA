class Solution {
    public int minLength(String s) {
     int a=s.indexOf("AB");  
     int b=s.indexOf("CD");
    StringBuilder sb=new StringBuilder(s);
     while(a!=-1||b!=-1)
     {
        if(a!=-1)
        {
        sb.delete(a,a+2);
        }
        b=sb.indexOf("CD");
        if(b!=-1)
        {
            sb.delete(b,b+2);
        }
        a=sb.indexOf("AB");
     } 
     return sb.length();
    }
}