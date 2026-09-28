class Solution {
    public int maxDepth(String s) {
    int count=0,len=0;
    for(char ch:s.toCharArray())
    {
        if(ch=='(')
        {
            len++;
            count=Math.max(count,len);
        }
        else if(ch==')')
        {
            len--;
        }
    }    
    return count;
    }
}