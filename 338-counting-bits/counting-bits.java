class Solution {
    public int[] countBits(int n) {
    n++;
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        int count =0,num=i;
        while(num>0)
        {
            num=num&(num-1);
            count++;
        }
        arr[i]=count;
    }    
    return arr;
    }
}