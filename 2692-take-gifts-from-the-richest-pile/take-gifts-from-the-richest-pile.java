class Solution {
    public long pickGifts(int[] gifts, int k) {
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
    long sum=0;
    for(int gift:gifts)
    {
        pq.add(gift);
        sum += gift;
    }    
    while(k>0)
    {
        int num=pq.poll();
        int n=(int)Math.sqrt(num);
        pq.add(n);
        sum -= num-n;
        k--;
    }
    return sum;
    }
}