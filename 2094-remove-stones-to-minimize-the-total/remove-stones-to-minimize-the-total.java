class Solution {
    public int minStoneSum(int[] piles, int k) {
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
    int stones=0;
    for(int stone : piles)
    {
        pq.add(stone);
        stones += stone;
    }  
    while(k>0)
    {
        int stone=pq.poll();
        pq.add((stone/2)+(stone&1));
        stones -=stone/2; 
        k--;
    }  
    return stones;
    }
}