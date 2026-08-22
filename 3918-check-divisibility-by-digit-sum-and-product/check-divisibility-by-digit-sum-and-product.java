class Solution {
    public boolean checkDivisibility(int n) {
    int sum=0,mul=1,num=n;
    while(n>0)
    {
        int a=n%10;
        sum += a;
        mul *= a;
        n /= 10;
    }   
    return num%(sum+mul)==0;
    }
}