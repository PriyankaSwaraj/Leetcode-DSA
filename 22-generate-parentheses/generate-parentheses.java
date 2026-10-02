class Solution {
    public List<String> generateParenthesis(int n) {
      List<String> result=new ArrayList<>();
      paren(result,n,0,0,"");
      return result;    
    }
    public void paren(List<String> res,int n,int l,int r,String str)
    {
        if(l==n&&l==r)
        {
            res.add(str);
            return;
        } 
        if(l<n)
        {
          paren(res,n,l+1,r,str+"("); 
        }
        if(r<l)
        {
            paren(res,n,l,r+1,str+")");
        }
    }
}