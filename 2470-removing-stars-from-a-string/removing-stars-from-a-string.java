class Solution {
    public String removeStars(String s) {
     Stack<Character> stack=new Stack<>();
     int n=s.length();
     for(int i=0;i<n;i++)
     {
        if(s.charAt(i)=='*'&&!stack.isEmpty())
        {
         stack.pop();
         continue;
        }
        stack.push(s.charAt(i));
     }   
     String str="";
     while(!stack.isEmpty())
     {
        str +=  Character.toString(stack.pop());
     }
     StringBuilder sb=new StringBuilder(str);
     return sb.reverse().toString();
    }
}