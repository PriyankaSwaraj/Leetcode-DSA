class Solution {
    class Pair implements Comparable<Pair>{
        String user;
        int words;
        Pair(String user,int words)
        {
            this.user=user;
            this.words=words;
        }
        public int compareTo(Pair other)
        {
            if(this.words==other.words)
            {
                return (other.user).compareTo(this.user);
            }
            return other.words-this.words;
        }
    }
    public String largestWordCount(String[] messages, String[] senders) {
     HashMap<String,Integer> map=new HashMap<>();
     int i=0;
     for(String sen:messages)
     {
        map.put(senders[i],map.getOrDefault(senders[i],0)+sen.split(" ").length);
        i++;
     }
     PriorityQueue<Pair> pq=new PriorityQueue<>();
     for(Map.Entry<String,Integer> e:map.entrySet())
     {
        pq.add(new Pair(e.getKey(),e.getValue()));
     }
     return pq.poll().user;
    }
}