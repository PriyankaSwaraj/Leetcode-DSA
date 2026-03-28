class Solution {
    public int maximalRectangle(char[][] matrix) {
    int m=matrix.length,n=matrix[0].length;
    int[][] mat=new int[m][n];
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            mat[i][j]=matrix[i][j]-'0';
        }
    }
    int res=area(mat[0]);
    for(int i=1;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(mat[i][j]==1)
            {
                mat[i][j] += mat[i-1][j];
            }
        }
        res=Math.max(res,area(mat[i]));
    }
    return res;
    }
    public int area(int[] heights) {
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