class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
    HashMap<String,Integer> map=new HashMap<>();
    for(String word: paragraph.split("[ !?',;.]+")){
        word=word.toLowerCase();
        map.put(word,map.getOrDefault(word,0)+1);
    }
    ArrayList<String> words=new ArrayList<>(map.keySet());
    ArrayList<Integer> freq=new ArrayList<>(map.values());
    int n=words.size();
    for(int j=0;j<n-1;j++)
    {
    for(int i=0;i<n-1-j;i++)
    {
        if(freq.get(i)<freq.get(i+1))
        {
            String temp=words.get(i);
             words.set(i,words.get(i+1));
             words.set(i+1,temp);
             int t=freq.get(i);
             freq.set(i,freq.get(i+1));
             freq.set(i+1,t);
        }
    }
    }
    ArrayList<String> arr=new ArrayList<>(Arrays.asList(banned));
    for(String str:words)
    {
        if(!arr.contains(str))
        {
            return str;
        }
    }
   
    return "";
    }
}