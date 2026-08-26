class Solution {
    public long pickGifts(int[] gifts, int k) {
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
    long sum=0;
    for(int gift:gifts)
    {
        pq.add(gift);
    }    
    while(k>0)
    {
        pq.add((int)(Math.sqrt(pq.poll())));
        k--;
    }
    while(!pq.isEmpty())
    {
        sum += pq.poll();
    }
    return sum;
    }
}