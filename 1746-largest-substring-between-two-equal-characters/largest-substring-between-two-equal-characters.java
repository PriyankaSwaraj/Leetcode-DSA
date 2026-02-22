class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
     HashMap<Character,Integer> map=new HashMap<>();
     int n=s.length(),count=-1;
     for(int i=0;i<n;i++)
     {
        char ch=s.charAt(i);
        if(map.containsKey(ch))
        {
            count = Math.max(count,i-map.get(ch)-1);
        }
        else{
            map.put(ch,i);
        }
     } 
     return count;    
    }
}