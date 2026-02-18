class Solution {
    public boolean hasAlternatingBits(int n) {
    String str=Integer.toString(n%2);
    n /= 2;
    int k=1;
    while(n>0)
    {
        str += Integer.toString(n%2);
        k++;
        if(str.charAt(k-1)==str.charAt(k-2))
        {
            return false;
        }
        n /= 2;
    }
    return true;
    }
}