class Solution {
    public int bitwiseComplement(int n) {
        if(n==0)
        {
            return 1;
        }
    int pow=0,num=0;
    while(n>0)
    {
      if(n%2==0)
      {
        num += Math.pow(2,pow);
      }
      pow++;
      n /=2;
    }
    return num;
    }
}