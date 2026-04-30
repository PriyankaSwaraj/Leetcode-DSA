class Solution {
    public int minimumChairs(String s) {
    int chair =0,max_chair=0;
    for(char ch:s.toCharArray())
    {
        if(ch=='E')
        {
            chair++;
            max_chair=Math.max(chair,max_chair);
        }
        else{
            chair--;
        }
    }  
    return max_chair;  
    }
}