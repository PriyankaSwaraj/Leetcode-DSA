class Solution {
    public String reverseByType(String s) {
    char[] ch=s.toCharArray();
    int i=0,j=s.length()-1;
    while(i<j)
    {
        if(Character.isAlphabetic(ch[i])&&Character.isAlphabetic(ch[j]))
        {
            char c=ch[i];
            ch[i]=ch[j];
            ch[j]=c;
            i++;
            j--;
        }
        if(!Character.isAlphabetic(ch[i]))
        {
            i++;
        }
        if(!Character.isAlphabetic(ch[j]))
        {
            j--;
        }
    }    
   i=0;
   j=s.length()-1;
    while(i<j)
    {
        if(!Character.isAlphabetic(ch[i])&&!Character.isAlphabetic(ch[j]))
        {
            char c=ch[i];
            ch[i]=ch[j];
            ch[j]=c;
            i++;
            j--;
        }
        if(Character.isAlphabetic(ch[i]))
        {
            i++;
        }
        if(Character.isAlphabetic(ch[j]))
        {
            j--;
        }
    }
    return new String(ch);
    }
}