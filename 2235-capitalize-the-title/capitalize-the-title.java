class Solution {
    public String capitalizeTitle(String title) {
    String[] words=title.split(" ");
    int n=words.length;
    StringBuilder sb=new StringBuilder();
    for(String str: words)
    {
        int m=str.length();
        if(m<=2)
        {
           String s= str.toLowerCase();
            sb.append(s);
        }
        else{
            String s=Character.toUpperCase(str.charAt(0))+str.substring(1).toLowerCase();
            sb.append(s);
        }
        sb.append(" ");
    }
    sb.deleteCharAt(sb.length()-1);
    return sb.toString();
    }
}