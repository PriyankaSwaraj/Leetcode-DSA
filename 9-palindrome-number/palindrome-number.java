class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
       long rev =0;
       long n = x;
    while(n!=0)
    {
        int a =(int) n%10;
        rev = rev*10+a;
        n = n/10;
    }
    return (rev == x);
    }
}