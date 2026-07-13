class Solution {
    List<Integer> arr=new ArrayList<>();
    public List<Integer> sequentialDigits(int low, int high) {
     for(int i=1;i<10;i++)
     {
     recur(low,high,i,i);
     }
     Collections.sort(arr);
     return arr;   
    }
    public int recur(int low,int high,int num,int dig)
    {
        if(num>high||dig>9)
        {
            return 0;
        }
        if(num>=low)
        {
            arr.add(num);
        }
        return recur(low,high,num*10+dig+1,dig+1);
    }
}