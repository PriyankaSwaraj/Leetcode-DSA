class Solution {
    public int mirrorDistance(int n) {
    int num=0,n1=n;
    while(n1>0)
    {
      num =num*10+(n1%10);
      n1 /=10;
    }    
    return Math.abs(n-num);
    }
}