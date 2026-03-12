class Solution {
    public String removeDuplicateLetters(String s) {
     int[] freq=new int[26];
     int n=s.length();
     for(int i=0;i<n;i++)
     {
        freq[s.charAt(i)-'a']=i;
     }   
     Stack<Character> stack=new Stack<>();
     stack.push(s.charAt(0));
     for(int i=1;i<n;i++)
     {
        char ch=s.charAt(i);
        while(!stack.isEmpty())
        {
            char ch2=stack.peek();
            if(!stack.contains(ch)&&ch2>ch&&freq[ch2-'a']>i)
            {
                stack.pop();
            }
            else{
                break;
            }
        }
        if(!stack.contains(ch))
        {
         stack.push(ch);
        }
     }
     StringBuilder sb=new StringBuilder();
     while(!stack.isEmpty())
     {
        sb.append(stack.pop());
     }
     return sb.reverse().toString();
    }
}