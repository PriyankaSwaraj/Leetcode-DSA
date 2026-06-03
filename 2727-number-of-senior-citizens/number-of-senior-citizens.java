class Solution {
    public int countSeniors(String[] details) {
    int count=0;
    for(String str:details)
    {
        int num=Integer.parseInt(str.substring(11,13));
        if(num>60)
        count++;
    }     
    return count;
    }
}