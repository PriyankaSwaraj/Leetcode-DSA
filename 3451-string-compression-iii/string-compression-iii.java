class Solution {
    public String compressedString(String word) {
    int count=1,n=word.length();
    String newStr="";
    for(int i=1;i<n;i++)
    {
        char ch=word.charAt(i-1);
        if(word.charAt(i)!=ch||count==9)
        {
            newStr += Integer.toString(count);
            newStr += Character.toString(ch);;
            count =0;
        }
        count++;
    }
    newStr += Integer.toString(count)+Character.toString(word.charAt(n-1));
    return newStr;    
    }
}