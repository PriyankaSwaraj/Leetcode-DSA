class Solution {
    public boolean exist(char[][] board, String word) {
     int m=board.length,n=board[0].length;
     char[] words=word.toCharArray();
     boolean[][] visited =new boolean[m][n];
     for(int i=0;i<m;i++)
     {
        for(int j=0;j<n;j++)
        {
            if(board[i][j]==words[0]&&check(board,words,visited,i,j,0))
            {
                return true;
            }
        }
     }   
     return false;
    }
    public boolean check(char[][] board,char[] word,boolean[][] visited,int i,int j,int idx)
    {
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]!=word[idx])
        {
          return false;
        }
        if(visited[i][j])
        {
          return false;
        }
        if(idx==word.length-1)
        {
          return true;
        }
        visited[i][j]=true;
        boolean result=check(board,word,visited,i+1,j,idx+1)||check(board,word,visited,i-1,j,idx+1)||
        check(board,word,visited,i,j+1,idx+1)||check(board,word,visited,i,j-1,idx+1);
        visited[i][j]=false;
        return result;
    }
}