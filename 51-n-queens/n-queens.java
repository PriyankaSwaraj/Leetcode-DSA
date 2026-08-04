class Solution {
    public List<List<String>> solveNQueens(int n) {
    List<List<String>> nums=new ArrayList<>();
    char[][] board=new char[n][n];  
    helper(nums,board,0);
    return nums;  
    }
    public void helper(List<List<String>> nums,char[][] board , int col)
    {
        int n=board.length;
        if(col==n)
        {
            isSave(nums,board);
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(check(board,i,col))
            {
                 board[i][col]='Q';
                 helper(nums,board,col+1);
                 board[i][col]='.';
            }
        }
    }
    public boolean check(char[][] board,int row,int col)
    {
        int n=board.length;
        for(int i=0;i<n;i++)
        {
            if(board[i][col]=='Q')
            return false;
            if(board[row][i]=='Q')
            return false;
        }
        for(int i=row,j=col;i>=0&&j>=0;i--,j--)
        {
            if(board[i][j]=='Q')
            return false;
        }
        for(int i=row,j=col;i>=0&&j<n;i--,j++)
        {
            if(board[i][j]=='Q')
            return false;
        }
        for(int i=row,j=col;i<n&&j>=0;i++,j--)
        {
            if(board[i][j]=='Q')
            return false;
        }
        return true;
    }
    public void isSave(List<List<String>> nums,char[][] board)
    {
        int n=board.length;
        List<String> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String str="";
            for(int j=0;j<n;j++)
            {
               if(board[i][j]=='Q')
               {
                str += "Q";
               }
               else{
                str += ".";
               }
            }
            arr.add(str);
        }
        nums.add(arr);
    }
}