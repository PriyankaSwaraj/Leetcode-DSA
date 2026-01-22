class Solution {
    public boolean isHappy(int n) {
    int num=n,val=0;
    while(num>0)
    {
      val += Math.pow(num%10,2);
      num /=10;
    }
    while(val!=n&&val>9)
    {
        int value=0;
        while(val>0)
        {
            value +=Math.pow(val%10,2);
            val /=10;
        }
        val=value;
    }
    return val==1||val==7;
    }
}  