class Solution {
    public int largestRectangleArea(int[] heights) {
    int n=heights.length,res=0;
    Stack<Integer> stack=new Stack<>();
    for(int i=0;i<n;i++)
    {
        while(!stack.isEmpty()&&heights[stack.peek()]>=heights[i])
        {
            int t=stack.pop();
            int curr=heights[t]*(stack.isEmpty()?i:(i-stack.peek()-1));
            res=Math.max(res,curr);
        }
        stack.push(i);
    }
    while(!stack.isEmpty())
    {
         int t=stack.pop();
         int curr=heights[t]*(stack.isEmpty()?n:n-stack.peek()-1);
         res=Math.max(res,curr);
    }
         return res;   
    }
}