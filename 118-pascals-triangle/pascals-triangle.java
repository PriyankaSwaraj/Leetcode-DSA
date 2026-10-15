class Solution {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result=new ArrayList<>();
    result.add(Arrays.asList(1));
    if(numRows==1)
    {
        return result;
    }
    result.add(Arrays.asList(1,1));
    for(int i=2;i<numRows;i++)
    {
        List<Integer> arr=new ArrayList<>();
        List<Integer> arr2=result.get(i-1);
        arr.add(1);
        for(int j=1;j<i;j++)
        {
            arr.add(arr2.get(j-1)+arr2.get(j));
        }
        arr.add(1);
        result.add(arr);
    }
    return result;
    }
}