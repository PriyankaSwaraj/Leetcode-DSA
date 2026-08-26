class Solution {
    public int minStoneSum(int[] piles, int k) {
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
    for(int stones : piles)
    {
        pq.add(stones);
    }  
    while(k>0)
    {
        int stone=pq.poll();
        pq.add((stone/2)+(stone&1));
        k--;
    }  
    int stones = 0;
    while(!pq.isEmpty())
    {
        stones += pq.poll();
    }
    return stones;
    }
}