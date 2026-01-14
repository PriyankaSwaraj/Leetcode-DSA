class Solution {
    public boolean isValidSudoku(char[][] board) {
    for(int i=0;i<9;i++)
    {
    int[] arr = new int[10];
    int[] arr1 =new int[10];
    for(int j=0;j<9;j++)
    {
        char ch = board[i][j];
        if(ch>='1'&&ch<='9')
        {
            int a = Character.getNumericValue(ch);
            arr[a]++;
        }
        char ch1 = board[j][i];
        if(ch1>='1'&&ch1<='9')
        {
            int b = Character.getNumericValue(ch1);
            arr1[b]++;
        }
    }
    boolean check = check(arr);
    boolean check1= check(arr1);
    if(!check||!check1)
    {
        return false;
    }
    } 
    int a=0,h=3;
    while(h>0)
    {
    int k=3,b=0;
    while(k>0)
    {
        int[] arr = new int[10];
        for(int i=a;i<a+3;i++)
        {
            for(int j=b;j<b+3;j++)
            {
               char ch = board[i][j];
               if(ch>='1'&&ch<='9')
                {
                int c = Character.getNumericValue(ch);
                arr[c]++;
               }
            }
        }
         boolean check2 =check(arr);
         if(!check2)
         {
            return false;
         }
        b += 3;
        k--;
    }
    h--;
    a += 3;
    }

   return true;
    }
    public boolean check(int[] board)
    {
        for(int i=1;i<10;i++)
        {
            if(board[i]>1)
            {
                return false;
            }
        }
        return true;
    }
}