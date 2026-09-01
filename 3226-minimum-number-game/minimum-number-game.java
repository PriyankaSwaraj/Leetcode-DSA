class Solution {
    public int[] numberGame(int[] nums) {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    for(int num:nums)
    {
        pq.add(num);
    }    
    int i=0;
    while(!pq.isEmpty())
    {
        int a=pq.poll(),b=pq.poll();
        nums[i++]=b;
        nums[i]=a;
        i++;
    }
    return nums;
    }
}