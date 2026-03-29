class Solution {
    public String greatestLetter(String s) {
    boolean[] freq1=new boolean[26];
    boolean[] freq2=new boolean[26];
    char result='0';
    int n=s.length();
    for(int i=0;i<n;i++)
    {
       char ch1=s.charAt(i);
       char ch2=Character.toUpperCase(ch1);
       if(Character.isLowerCase(ch1))
       {
        if(freq2[ch2-'A']&&ch2>result)
         result=ch2;
        freq1[ch1-'a']=true;
       }
       else{
        if(freq1[Character.toLowerCase(ch1)-'a']&&result<ch2)
        result=ch2;
        freq2[ch1-'A']=true;
       }
    } 
    return (result=='0'?"":Character.toString(result));   
    }
}