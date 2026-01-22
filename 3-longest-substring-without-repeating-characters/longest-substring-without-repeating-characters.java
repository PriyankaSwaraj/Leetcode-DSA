class Solution {
    public int lengthOfLongestSubstring(String s) {
    int n=s.length(),len=0;
    for(int i=0;i<n;i++)
    {
        HashSet<Character> set=new HashSet<>();
        int j=i,count=0;
        while(j<n&&!set.contains(s.charAt(j)))
        {
          count++;
          set.add(s.charAt(j));
          j++;
        }
        len=Math.max(len,count);
    }
    return len;
    }
}