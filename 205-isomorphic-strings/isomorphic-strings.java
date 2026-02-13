class Solution {
    public boolean isIsomorphic(String s, String t) {
    HashMap<Character,Character> map = new HashMap<Character,Character>();
    int n=s.length();
    for(int i=0;i<n;i++)
    {
        char ch1=s.charAt(i);
        char ch2=t.charAt(i);
        if(map.containsKey(ch1))
        {
            char c= map.get(ch1);
            if(c!=ch2)
            {
                return false;
            }
        }
        map.put(ch1,ch2);
    }  
    map.clear();
    for(int i=0;i<n;i++)
    {
        char ch2=s.charAt(i);
        char ch1=t.charAt(i);
        if(map.containsKey(ch1))
        {
            char c= map.get(ch1);
            if(c!=ch2)
            {
                return false;
            }
        }
        map.put(ch1,ch2);
    }  
    return true;
    }
}