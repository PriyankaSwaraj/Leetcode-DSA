class Solution {
    public int findJudge(int n, int[][] trust) {
     int[] judge=new int[n+1];
     for(int[] people:trust)
     {
        judge[people[0]]--;
        judge[people[1]]++;
     }
     for(int i=1;i<=n;i++)
     {
       if(judge[i]==n-1)
       {
        return i;
       }
     }
     return -1;
    }
}