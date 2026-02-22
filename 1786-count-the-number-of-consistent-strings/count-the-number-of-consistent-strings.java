class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
    HashSet<Character> set1=new HashSet<>();
    int count=0,n=words.length;
    for(char ch:allowed.toCharArray())
    {
        set1.add(ch);
    } 
    for(int i=0;i<n;i++)
    {
      boolean check=true;
      for(char ch: words[i].toCharArray())
      {
        if(!set1.contains(ch))
        {
            check=false;
            break;
        }
      }
      if(check)
      {
        count++;
      }
    }
    return count;
    }
}