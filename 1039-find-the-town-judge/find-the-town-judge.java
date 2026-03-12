class Solution {
    public int findJudge(int n, int[][] trust) {
     int[] judge=new int[n+1];
     for(int[] people:trust)
     {
        int a=people[0];
        int b=people[1];
        judge[a]--;
        judge[b]++;
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