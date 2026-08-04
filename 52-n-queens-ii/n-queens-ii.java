class Solution {
     int num=0;
    public int totalNQueens(int n) {
     char[][] board=new char[n][n];
     helper(board,0);
     return num;
    }
    public void helper(char[][] board,int col)
    {
        int n=board.length;
        if(col==n)
        {
            num += 1;
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(isSafe(board,i,col))
            {
                board[i][col]='Q';
                helper(board,col+1);
                board[i][col]='.';
            }
        }
    }
    public boolean isSafe(char[][] board,int row,int col)
    {
        int n=board.length;
        for(int i=0;i<n;i++)
        {
            if(board[row][i]=='Q'||board[i][col]=='Q')
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
        for(int i=row,j=col;j>=0&&i<n;i++,j--)
        {
            if(board[i][j]=='Q')
            return false;
        }
        return true;
    }
}