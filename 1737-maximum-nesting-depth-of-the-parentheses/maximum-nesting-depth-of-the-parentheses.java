class Solution {
    public int maxDepth(String s) {
    int count=0;
    Stack<Character> stack=new Stack<>();
    for(char ch:s.toCharArray())
    {
        if(ch=='(')
        {
            stack.push('(');
            count=Math.max(count,stack.size());
        }
        else if(ch==')')
        {
            stack.pop();
        }
    }    
    return count;
    }
}