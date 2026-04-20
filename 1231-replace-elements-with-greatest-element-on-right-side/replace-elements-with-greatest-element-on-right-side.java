class Solution {
    public int[] replaceElements(int[] arr) {
    int n=arr.length,max=arr[n-1];
    arr[n-1]=-1;
    for(int i=n-2;i>=0;i--)
    {
        int num=arr[i];
        arr[i]=max;
        max=Math.max(num,max);
    }
    return arr;
    }
}