class Solution {
    public List<String> letterCombinations(String digits) {
    List<String> result=new ArrayList<>();
    String[] comb={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    recur(result,comb,digits,0,"");
    return result;   
    }
    public void recur(List<String> result,String[] comb,String digits,int idx,String res)
    {
        if(idx==digits.length())
        {
            return;
        }
        String str=comb[digits.charAt(idx)-'0'];
        int n=str.length();
        for(int i=0;i<n;i++)
        {
         String s=res+str.charAt(i);
         recur(result,comb,digits,idx+1,s);
         if(res.length()==digits.length()-1)
         result.add(res+str.charAt(i));
       }
    }
}