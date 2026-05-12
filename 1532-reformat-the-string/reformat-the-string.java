class Solution {
    public String reformat(String s) {
     StringBuilder sb1=new StringBuilder();
     StringBuilder sb2=new StringBuilder();
     for(Character ch: s.toCharArray())
     {
        if(Character.isDigit(ch))
        {
            sb1.append(ch);
        }
        else{
            sb2.append(ch);
        }
     }
     int n=sb1.length(),m=sb2.length();  
     StringBuilder result= new StringBuilder();
     if(Math.abs(n-m)>1)
     {
        return "";
     }
     int i=0; 
     while(i<n&&i<m)
     {
        result.append(sb1.charAt(i));
        result.append(sb2.charAt(i));
        i++;
     }
    if(i<m)
    {
        result.insert(0,sb2.charAt(i));
    }
    if(i<n)
    {
        result.append(sb1.charAt(i));
    }
     return result.toString();
    }
}