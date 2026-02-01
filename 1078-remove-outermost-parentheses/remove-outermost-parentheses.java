class Solution {
    public String removeOuterParentheses(String s) {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> ele=new Stack<>();
    int n=s.length();
    StringBuilder sb=new StringBuilder(s);
    int i=0;
    while(i<sb.length())
    {
        char ch=s.charAt(i);
        if(ch=='(')
        {
            stack.push(i);
        }
        else if(!stack.isEmpty()){
            int a=stack.pop();
            if(stack.isEmpty())
            {
                 ele.push(a);
                 ele.push(i);
                  continue;
            }
        }
        i++;
    }
    while(!ele.isEmpty())
    {
        sb.deleteCharAt(ele.pop());
    }
    return sb.toString();   
    }
}