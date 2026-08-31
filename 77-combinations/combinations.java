class Solution {
    public List<List<Integer>> combine(int n, int k) {
    ArrayList<List<Integer>> result=new ArrayList<>();
    ArrayList<Integer> arr=new ArrayList<>();
    recur(result,arr,k,n,1);
    return result;    
    }
    public void recur(ArrayList<List<Integer>> result,ArrayList<Integer> arr,int k,int n,int i)
    {
        if(arr.size()==k)
        {
            result.add(new ArrayList<>(arr));
            return;
        }
        for(int j=i;j<=n;j++)
        {
            arr.add(j);
            recur(result,arr,k,n,j+1);
            arr.remove(arr.size()-1);
        }
    }
}