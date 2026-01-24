class Solution {
    public String minRemoveToMakeValid(String s){
     Stack<Integer> st= new Stack<>();
     String sb="";
     int n=s.length(),count=0;
     for(int i=0;i<n;i++)
     {
       char ch=s.charAt(i);
       if(ch=='(')
       {
        st.push(i);
       }
       else if(ch==')')
       {
        if(st.isEmpty())
        {
              count++;
           continue;
        }
        else{
            st.pop();
        }
       }
       sb += Character.toString(ch);
     }
    StringBuilder str=new StringBuilder(sb);
    while(!st.isEmpty())
    {
        int num=st.pop();
        str.deleteCharAt(num-count);
    }
     return str.toString(); 
    }
}