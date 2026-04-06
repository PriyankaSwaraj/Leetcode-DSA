class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    Deque<Integer> dq=new ArrayDeque<Integer>();
    int n=nums.length;
    int[]  result=new int[n-k+1];
    int idx=0;
    for(int i=0;i<k;i++)
    {
        while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[i])
        {
          dq.pollLast();
        }
        dq.offerLast(i);
    }    
    for(int i=k;i<n;i++)
    {
      result[idx]=nums[dq.peekFirst()];
      idx++;
      while(!dq.isEmpty()&&dq.peekFirst()<=i-k)
      {
        dq.pollFirst();
      }
       while(!dq.isEmpty()&&nums[dq.peekLast()]<=nums[i])
        {
          dq.pollLast();
        }
        dq.offerLast(i);
    }
    result[idx]=nums[dq.peekFirst()];
    return result;
    }
}