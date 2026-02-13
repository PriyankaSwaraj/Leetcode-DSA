class Solution {
public boolean wordPattern(String pattern, String s) {
   int n=pattern.length();
   String[] word=s.split(" ");
   HashMap<Character,String> map=new HashMap<Character,String>();
   if(n!=word.length)
   {
    return false;
   }
   for(int i=0;i<n;i++)
   {
    char ch1=pattern.charAt(i);
    if(map.containsKey(ch1))
    {
        String ch=map.get(ch1);
        if(!ch.equals(word[i]))
        {
            return false;
        }
    }
     map.put(ch1,word[i]);
   }
   HashMap<String,Character> map2=new HashMap<String,Character>();
   for(int i=0;i<n;i++)
   {
    if(map2.containsKey(word[i]))
    {
        char ch=map2.get(word[i]);
        if(ch!=pattern.charAt(i))
        {
            return false;
        }
    }
    map2.put(word[i],pattern.charAt(i));
   }
   return true;  
    }
}