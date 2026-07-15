class Solution {
    ArrayList<String> arr=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
    StringBuilder res=new StringBuilder();
    recur(res,n,0,0);
    return arr;   
    }
    public void recur(StringBuilder res, int n,int lef,int right)
    {
     if(lef==right&&lef==n)
     {
        arr.add(res.toString());
     }
     if(lef<n)
     {
        recur(res.append('('),n,lef+1,right);
     }
     if(lef>right)
     {
        recur(res.append(')'),n,lef,right+1);
     }
     if(res.length()>0)
     res.deleteCharAt(res.length()-1);
    }
}