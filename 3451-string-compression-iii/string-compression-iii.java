class Solution {
    public String compressedString(String word) {
    int count=1,n=word.length();
    StringBuilder sb=new StringBuilder();
    for(int i=1;i<n;i++)
    {
        char ch=word.charAt(i-1);
        if(word.charAt(i)!=ch||count==9)
        {
            sb.append(count);
            sb.append(ch);
            count =0;
        }
        count++;
    }
    sb.append(count);
    sb.append(word.charAt(n-1));
    return sb.toString();    
    }
}