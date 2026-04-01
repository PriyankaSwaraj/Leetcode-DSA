class Solution {
    public List<String> buildArray(int[] target, int n) {
    ArrayList<String> arr=new ArrayList<>();
    int m=target.length,j=0,i=1;
    while(i<=n&&j<m)
    {
        arr.add("Push");
        if(target[j]==i)
        {
            j++;
        }
        else{
            arr.add("Pop");
        }
        i++;
    }
    return arr;  
    }
}