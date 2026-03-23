class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
    ArrayList<Integer> result=new ArrayList<>();
    int n=num.length,carry=0;
    int i=n-1;
    while(k>0||i>=0||carry!=0)
    {
        int sum=carry;
        if(k>0)
        {
            sum += k%10;
            k /=10;
        }
        if(i>=0)
        {
        sum += num[i];
        }
        result.add(sum%10);
        carry=sum/10;
        i--;
    }
    Collections.reverse(result);
    return result;
    }
}