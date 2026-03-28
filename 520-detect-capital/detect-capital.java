class Solution {
    public boolean detectCapitalUse(String word) {
    boolean check1=false,check2=false;
    int n=word.length();
    for(int i=0;i<n;i++)
    {
        char ch=word.charAt(i);
        if(Character.isLowerCase(ch))
        {
            check1=true;
        }
        if(Character.isUpperCase(ch)&&i!=0)
        {
            check2=true;
        }
    }
    return !(check1&&check2);    
    }
}