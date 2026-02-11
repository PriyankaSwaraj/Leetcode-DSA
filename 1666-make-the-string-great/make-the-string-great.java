class Solution {
    public String makeGood(String s) {
   StringBuilder sb=new StringBuilder();
   int n=s.length();
   sb.append(s.charAt(0));
   for(int i=1;i<n;i++)
   {
    if(sb.length()<1)
    {
        sb.append(s.charAt(i));
        continue;
    }
    char ch1=sb.charAt(sb.length()-1);
    char ch2=s.charAt(i);
    if(Character.toLowerCase(ch1)==Character.toLowerCase(ch2)&&
      Character.isLowerCase(ch1)!=Character.isLowerCase(ch2))
      {
        sb.deleteCharAt(sb.length()-1);
        continue;
      }
      sb.append(ch2);
   }
   return sb.toString();
    }
}