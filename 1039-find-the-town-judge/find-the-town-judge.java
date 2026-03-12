class Solution {
    public int findJudge(int n, int[][] trust) {
     int[] freq=new int[1001];
     HashSet<Integer> set=new HashSet<>();
     int m=trust.length;
     if(m==0&&n==1)
     {
        return 1;
     }
     for(int i=0;i<m;i++)
     {
        freq[trust[i][1]]++;
        set.add(trust[i][0]);
     }   
     ArrayList<Integer> arr=new ArrayList<>();
     for(int i=0;i<m;i++)
     {
        int num=trust[i][1];
        if(freq[num]==n-1&&!set.contains(num))
        {
            return num;
        }
     }
    return -1;
    }
}