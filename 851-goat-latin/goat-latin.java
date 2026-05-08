class Solution {
    public String toGoatLatin(String sentence) {
    String result="";
    int i=1;
    for(String str:sentence.split(" "))
    {
        if(i!=1)
        result += " ";
        char ch=str.charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
           result += str;
        }
        else{
            result += str.substring(1,str.length());
            result += Character.toString(ch);
        }
        result += "ma";
        result += "a".repeat(i);
        i++;
    }    
    return result;
    }
}