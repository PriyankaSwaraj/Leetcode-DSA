class Solution {
    public String frequencySort(String s) {
     int[] freq=new int[128];
     boolean[] check=new boolean[128];
     for(char ch: s.toCharArray())
     {
        freq[ch]++;
     }   
     PriorityQueue<int[]> pq=new PriorityQueue<>(
        (a,b)->Integer.compare(b[0],a[0]));
     for(char ch:s.toCharArray())
     {
        if(!check[ch])
        {
          pq.add(new int[]{freq[ch],ch});
        }
        check[ch]=true;
     }
    String result="";
     while(!pq.isEmpty())
     {
        int[] word=pq.poll();
        char ch=(char)word[1];
        result += Character.toString(ch).repeat(word[0]);
     }
     return result;
    }
}