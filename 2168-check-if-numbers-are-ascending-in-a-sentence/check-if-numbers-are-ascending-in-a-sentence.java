class Solution {
    public boolean areNumbersAscending(String s) {
    ArrayList<Integer> arr=new ArrayList<>();
    String[] word=s.split(" ");
    for(String str:word)
    {
        if(Character.isDigit(str.charAt(0)))
        {
            arr.add(Integer.parseInt(str));
        }
    }    
    int n=arr.size();
    for(int i=1;i<n;i++)
    {
        if(arr.get(i-1)>=arr.get(i))
        return false;
    }
    return true;
    }
}