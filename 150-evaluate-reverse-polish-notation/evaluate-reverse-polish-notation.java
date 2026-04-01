class Solution {
    public int evalRPN(String[] tokens) {
    int n=tokens.length;
    Deque<Integer> stack=new ArrayDeque<>();
   for(String str:tokens)
   {
    if(str.equals("+"))
    {
        stack.push(stack.pop()+stack.pop());
    }
    else if(str.equals("-"))
    {
        int op1=stack.pop(),op2=stack.pop();
        stack.push(op2-op1);
    }
    else if(str.equals("*"))
    {
        stack.push(stack.pop()*stack.pop());
    }
    else if(str.equals("/"))
    {
        int op1=stack.pop(),op2=stack.pop();
        stack.push(op2/op1);
    }
    else{
        stack.push(Integer.parseInt(str));
    }
   }
    return stack.pop();   
    }
}