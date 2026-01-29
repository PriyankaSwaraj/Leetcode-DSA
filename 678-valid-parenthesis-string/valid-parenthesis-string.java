class Solution {
    public boolean checkValidString(String s) {
    Stack<Integer> par=new Stack<>();
    Stack<Integer> abs=new Stack<>();
    int n=s.length();
    for(int i=0;i<n;i++)
    {
        char ch=s.charAt(i);
        if(ch=='(')
        {
            par.push(i);
        }
        else if(ch=='*')
        {
            abs.push(i);
        }
        else{
            if(!par.isEmpty())
            {
                par.pop();
            }
            else if(!abs.isEmpty())
            {
                abs.pop();
            }
            else{
                return false;
            }
        }
    }
    while(!par.isEmpty()&&!abs.isEmpty())
    {
        int a=par.pop();
        int b=abs.pop();
        if(a>b)
        {
          return false;
        }
    }
    return par.isEmpty();
    }
}