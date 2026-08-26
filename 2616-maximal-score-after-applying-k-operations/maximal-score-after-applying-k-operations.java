class Solution {
    public long maxKelements(int[] nums, int k) {
    long sum=0;
    PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
    for(int num:nums)
    {
        pq.add(num);
    }    
    while(k>0&&!pq.isEmpty())
    {
        int num=pq.poll();
        sum += num;
        pq.add((int)Math.ceil(num/3.0));
        k--;
    }
    return sum;
    }
}