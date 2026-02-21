class Solution {
    public String reverseOnlyLetters(String s) {
     int i=0,j=s.length()-1;
     StringBuilder sb=new StringBuilder(s);
     while(i<j)
     {
        char ch1=s.charAt(i);
        char ch2=s.charAt(j);
        if(Character.isLetter(ch1)&&Character.isLetter(ch2))
        {
          sb.setCharAt(i,ch2);
          sb.setCharAt(j,ch1);
          i++;
          j--;
        }
        if(!Character.isLetter(ch1))
        {
            i++;
        }
        if(!Character.isLetter(ch2))
        {
            j--;
        }
     }
     return sb.toString();
    }
}