class Solution {
    public char repeatedCharacter(String s) {
     int[] arr = new int[26];
    int n = s.length();
    for(int i=0;i<n;i++)
    {
        int a = (int)(s.charAt(i));
        int b=a-97;
        arr[b]++;
        if(arr[b]==2)
        {
            return s.charAt(i);
        }
    }
    return 'a';   
    }
}