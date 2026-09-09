class Solution {
    class Pair{
        int freq;
        char ch;
        Pair(int freq,char ch)
        {
            this.freq=freq;
            this.ch=ch;
        }
    }
    public String reorganizeString(String s) {
    PriorityQueue<Pair> pq=new PriorityQueue<>((p1,p2)->p2.freq-p1.freq);
    int[] freq=new int[26];
    for(char ch:s.toCharArray())
    {
        freq[ch-'a']++;
    }
    for(int i=0;i<26;i++)
    {
        if(freq[i]>0)
        pq.add(new Pair(freq[i],(char)(i+'a')));
    }
    StringBuilder sb=new StringBuilder();
    while(!pq.isEmpty())
    {
        Pair p=pq.poll();
        int len=sb.length();
        if(len>0&&sb.charAt(len-1)==p.ch)
        {
          if(pq.isEmpty())
          {
            return "";
          }
          Pair p2=pq.poll();
          sb.append(p2.ch);
          if(p2.freq>1)
          {
            pq.add(new Pair(p2.freq-1,p2.ch));
          }
          pq.add(p);
          continue;
        }
        sb.append(p.ch);
        if(p.freq>1)
        pq.add(new Pair(p.freq-1,p.ch)); 
    }
    return sb.toString();
    }
}