class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
     int n=letters.length;
     char ch=letters[0];
     for(int i=0;i<n;i++)
     {
        if(letters[i]>target)
        {
            ch=letters[i];
            break;
        }
     }
     return ch;
    }
}