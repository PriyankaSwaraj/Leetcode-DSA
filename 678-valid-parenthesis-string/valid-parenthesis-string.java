class Solution {
    public boolean checkValidString(String s) {
     Stack<Integer> stack=new Stack<>();
     Stack<Integer> mul=new Stack<>();
     int n=s.length();
     for(int i=0;i<n;i++)
     {
        char ch=s.charAt(i);
        if(ch=='(')
        {
            stack.push(i);
        }
        else if(ch=='*')
        {
            mul.push(i);
        }
        else{
            if(!stack.isEmpty())
            {
                stack.pop();
            }
            else if(!mul.isEmpty())
            {
                mul.pop();
            }
            else{
                return false;
            }
        }
     }   
     while(!stack.isEmpty()&&!mul.isEmpty())
     {
        int a=stack.pop(),b=mul.pop();
        if(a>b)
        return false;
     }
     return stack.isEmpty();
    }
}