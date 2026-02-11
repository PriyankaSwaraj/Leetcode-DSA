class Solution {
    public String makeGood(String s) {
   Stack<Character> stack=new Stack<>();
   int n=s.length();
   stack.push(s.charAt(0));
   for(int i=1;i<n;i++)
   {
     if(stack.isEmpty())
     {
        stack.push(s.charAt(i));
        continue;
     }
     char ch=stack.peek();
     char ch2=s.charAt(i);
     if(Character.toLowerCase(ch)==Character.toLowerCase(ch2)&&
        Character.isLowerCase(ch)!=Character.isLowerCase(ch2))
        {
        stack.pop();
        continue;
        }
        stack.push(ch2);
   }
   StringBuilder sb=new StringBuilder();
   while(!stack.isEmpty())
   {
    sb.append(stack.pop());
   }
    return sb.reverse().toString();
    }
}