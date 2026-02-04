class Solution {
    public boolean backspaceCompare(String s, String t) {
    Stack<Character> stack1=new Stack<>();
    Stack<Character> stack2=new Stack<>();
    int n=s.length();
    int m=t.length();
    for(int i=0;i<n;i++)
    {
     if(s.charAt(i)=='#')
     {
        if(!stack1.isEmpty())
        stack1.pop();
        continue;
     }
     stack1.push(s.charAt(i));
    }  
    for(int i=0;i<m;i++)
    {
     if(t.charAt(i)=='#')
     {
        if(!stack2.isEmpty())
        stack2.pop();
        continue;
     }
     stack2.push(t.charAt(i));
    }
    return stack1.equals(stack2);   
    }
}