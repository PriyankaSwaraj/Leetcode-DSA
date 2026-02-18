class Solution {
    public boolean hasAlternatingBits(int n) {
    String str=Integer.toBinaryString(n);
    int num=str.length();
    for(int i=0;i<num-1;i++)
    {
        if(str.charAt(i)==str.charAt(i+1))
        {
            return false;
        }
    }
    return true;
    }
}