class Solution {
    public int distributeCandies(int[] candyType) {
    HashSet<Integer> set=new HashSet<>();
    int n=candyType.length;
    int m=n/2;
    for(int i=0;i<n;i++)
    {
        set.add(candyType[i]);
        if(set.size()==m)
        {
            return m;
        }
    } 
    return set.size();
    }
}