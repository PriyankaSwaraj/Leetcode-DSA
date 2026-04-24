class Solution {
    public boolean isValid(String word) {
    int n=word.length();
    if(n<3)
    {
        return false;
    }    
    boolean vowel=false,cont=false;
    for(char ch:word.toCharArray())
    {
        if(Character.isLetter(ch))
        {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') 
        {
            vowel=true;
        }
        else{
            cont=true;
        }
        }
        else if(!Character.isDigit(ch))
        {
            return false;
        }
    }
    return vowel&&cont;
    }
}