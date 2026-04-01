class Solution {
    public int evalRPN(String[] tokens) {
    int n=tokens.length;
    Deque<Integer> stack=new ArrayDeque<>();
    for(int i=0;i<n;i++)
    {
        String str=tokens[i];
        if(str.matches(".*\\d.*"))
        {
            stack.push(Integer.parseInt(str));
        }
        else{
            int op1=stack.pop(),op2=stack.pop();
            if(str.equals("+"))
            {
                stack.push(op1+op2);
            }
            else if(str.equals("-"))
            {
                stack.push(op2-op1);
            }
            else if(str.equals("*"))
            {
                stack.push(op1*op2);
            }
            else{
                stack.push(op2/op1);
            }
        }
    } 
    return stack.pop();   
    }
}