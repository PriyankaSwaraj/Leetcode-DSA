class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
    ArrayList<String> result=new ArrayList<>();
    for(String str:queries)
    {
        for(String s:dictionary)
        {
            int count=0,n=s.length();
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)!=str.charAt(i))
                count++;
            }
            if(count<=2)
            {
                result.add(str);
                break;
            }
        }
    }
    return result;    
    }
}