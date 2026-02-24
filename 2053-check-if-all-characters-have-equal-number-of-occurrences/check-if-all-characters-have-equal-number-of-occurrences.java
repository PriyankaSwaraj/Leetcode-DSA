class Solution {
    public boolean areOccurrencesEqual(String s) {
    int[] freq1=new int[26];
    char[] num=s.toCharArray();
    for(char ch:num)
    {
        freq1[ch-'a']++;
    }    
    HashSet<Integer> set=new HashSet<>();
    for(char ch:num)
    {
        set.add(freq1[ch-'a']);
    }
    return set.size()==1;
    }
}