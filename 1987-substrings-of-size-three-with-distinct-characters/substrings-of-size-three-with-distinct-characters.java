class Solution {
    public int countGoodSubstrings(String s) {
    HashMap<Character,Integer> map=new HashMap<>();
    int n=s.length(),count=0;
    for(int i=0;i<3&&i<n;i++)
    {
       char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
    } 
    if(map.size()==3)
       {
        count++;
       }
    for(int i=1;i<n-2;i++)
    {
        char c=s.charAt(i-1);
       int a=map.get(c);
       if(a==1)
       {
        map.remove(c);
       }
       else{
        map.put(c,a-1);
       }
       char ch=s.charAt(i+2);
       map.put(ch,map.getOrDefault(ch,0)+1);
       if(map.size()==3)
       {
        count++;
       }
    } 
    return count;  
    }
}