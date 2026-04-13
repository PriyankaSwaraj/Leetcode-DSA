class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
     boolean[] prime=new boolean[n];
     for(int i=2;i*i<n;i++) 
     {
        if(!prime[i])
        {
            for(int j=i*i;j<n;j +=i)
            {
                prime[j]=true;
            }
        }
     } 
     List<List<Integer>> result=new ArrayList<>();
     for(int i=2;i<=n/2;i++)
     {
        if(!prime[i]&&!prime[n-i])
        {
           result.add(Arrays.asList(i,n-i));
        }
     } 
     return result;
    }
}