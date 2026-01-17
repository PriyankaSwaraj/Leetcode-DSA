class Solution {
    public int firstUniqChar(String s) {
    int[] arr = new int[26];
    int n = s.length();
    for(int i=0;i<n;i++)
    {
        int a = (int)(s.charAt(i));
        int b= a-97;
        arr[b]++;
    }
    for(int i=0;i<n;i++)
    {
        int a = (int)(s.charAt(i));
        int b= a-97;
        if(arr[b]==1)
        {
            return i;
        }
    }
    return -1;
    }
}