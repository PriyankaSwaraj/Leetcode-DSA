class Solution {
    public int vowelStrings(String[] words, int left, int right) {
    int count=0,n=words.length;
    for(int i=left;i<=right;i++)
    {
        String str=words[i];
        if(isVowel(str.charAt(0))&&isVowel(str.charAt(str.length()-1)))
        {
            count++;
        }
    }    
    return count;
    }
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || 
               ch == 'o' || ch == 'u';
    }

}