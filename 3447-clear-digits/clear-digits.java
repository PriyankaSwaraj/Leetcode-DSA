class Solution {
    public String clearDigits(String s) {
     Stack<Integer> stack=new Stack<>();
     int n=s.length();
     stack.push(0);
     for(int i=1;i<n;i++)
     {
        if(Character.isDigit(s.charAt(i)))
        {
            if(!stack.isEmpty())
            stack.pop();
        }
        else{
            stack.push(i);
        }
     } 
     StringBuilder sb=new StringBuilder();
     while(!stack.isEmpty())
     {
        sb.append(s.charAt(stack.pop()));
     }
     return sb.reverse().toString();  
    }
}