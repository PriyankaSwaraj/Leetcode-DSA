class Solution {
    public List<Integer> getRow(int rowIndex) {
     List<Integer> arr=new ArrayList<>();
     arr.add(1);
     if(rowIndex==0)
     {
        return arr;
     }
     arr.add(1);
     for(int i=2;i<=rowIndex;i++)
     {
        List<Integer> arr2=new ArrayList<>(arr);        
        arr.clear();
        arr.add(1);
        for(int j=1;j<i;j++)
        {
            arr.add(arr2.get(j-1)+arr2.get(j));
        }
        arr.add(1);
     }   
     return arr;
    }
}