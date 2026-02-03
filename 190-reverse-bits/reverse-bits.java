class Solution {
    public int reverseBits(int n){
        int num=0,power=31;
    while(n>0)
    {
        if(n%2==1)
        {
            num += Math.pow(2,power);
        }
        power--;
        n /=2;
    }
    return num;
    }
    
}