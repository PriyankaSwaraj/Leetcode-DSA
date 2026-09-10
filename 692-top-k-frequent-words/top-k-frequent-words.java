class Solution {
    class Pair implements Comparable<Pair>{
        String word;
        int freq;
        Pair(String word,int freq)
        {
            this.word = word;
            this.freq=freq;
        }
        public int compareTo(Pair other)
        {
            if(this.freq==other.freq)
            return (this.word).compareTo(other.word);
            return other.freq-this.freq;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
    HashMap<String,Integer> map=new HashMap<>();
    for(String word: words)
    {
        map.put(word,map.getOrDefault(word,0)+1);
    } 
    PriorityQueue<Pair> pq=new PriorityQueue<>();
    for(Map.Entry<String,Integer> e:map.entrySet()){
        pq.add(new Pair(e.getKey(),e.getValue()));
    }   
    List<String> result=new ArrayList<>();
    while(k>0)
    {
        result.add(pq.poll().word);
        k--;
    }
    return result;
    }
}