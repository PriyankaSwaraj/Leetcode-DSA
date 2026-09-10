class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
     HashMap<String,Integer> map=new HashMap<>();
     int i=0;
     for(String user:senders)
     {
        map.put(user,map.getOrDefault(user,0)+messages[i].split(" ").length);
        i++;
     }    
     int max=0;
     String[] result=new String[1];
     for(Map.Entry<String,Integer> e:map.entrySet())
     {
        int freq=e.getValue();
        String str=e.getKey();
        if(freq>max)
        {
            result[0]=str;
            max=freq;
        }
        else if(freq==max&&result[0].compareTo(str)<0)
        { 
          result[0]=str;  
        }
     }
     return result[0];
    }
}