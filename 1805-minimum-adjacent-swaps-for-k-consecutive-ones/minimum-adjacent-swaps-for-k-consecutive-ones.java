class Solution {
    public int minMoves(int[] nums, int k) {
    ArrayList<Integer> pos=new ArrayList<>();
    int n=nums.length;
    for(int i=0;i<n;i++)
    {
        if(nums[i]==1)
        {
            pos.add(i);
        }
    
    }
    int m=pos.size();
    long[] adjusted=new long[m];
    for(int i=0;i<m;i++)
    {
        adjusted[i]=pos.get(i)-i;
    }    
    long[] prefix=new long[m+1];
    for(int i=0;i<m;i++)
    {
        prefix[i+1]=prefix[i]+adjusted[i];
    }
    long ans =Long.MAX_VALUE;
    for(int l=0;l+k-1<m;l++)
    {
        int r=l+k-1;
        int mid=(l+r)/2;
        long median =adjusted[mid];
        long left=median*(mid-l)-(prefix[mid]-prefix[l]);
        long right = (prefix[r+1]-prefix[mid+1])-median*(r-mid);
        ans =Math.min(ans,left+right);
    }
    return (int)ans;
    }

}