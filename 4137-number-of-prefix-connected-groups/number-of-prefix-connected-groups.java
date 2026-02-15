class Solution {
    public int prefixConnected(String[] words, int k) {
      Arrays.sort(words);
      int n=words.length,count=0;
      for(int i=0;i<n;i++)
      {
        if(words[i].length()<k)
        {
            continue;
        }
        String word1=words[i].substring(0,k);
        boolean check =false;
        for(int j=i+1;j<n;j++)
        {
            i=j-1;
         if(words[j].length()<k)
        {
            continue;
        } 
        String word2=words[j].substring(0,k);
        if(!word1.equals(word2))
        {
            break;
        } 
        check=true; 
        }
        if(check)
        {
            count++;
        }
      }
        return count;
    }
}