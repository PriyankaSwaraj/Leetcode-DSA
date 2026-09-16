class Solution {
    public int longestConsecutive(int[] nums) {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    for(int num:nums)
    {
        pq.add(num);
    }    
    int len=1,maxLen=0;
    while(!pq.isEmpty())
    {
        int p=pq.poll();
        while(!pq.isEmpty()&&pq.peek()<=p+1)
        {
            if(p!=pq.peek())
            len++;
            p=pq.poll();
        }
        maxLen=Math.max(maxLen,len);
        len=1;
    }
    return maxLen;
    }
}