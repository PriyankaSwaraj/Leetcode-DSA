class Solution {
    public int maximumProduct(int[] nums, int k) {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    for(int num:nums)
    {
        pq.add(num);
    }    
    while(k>0)
    {
        pq.add(pq.poll()+1);
        k--;
    }
    long ans=1;
    while(!pq.isEmpty())
    {
        ans = (ans*pq.poll())%1000000007;
    }
    return (int)ans;
    }
}