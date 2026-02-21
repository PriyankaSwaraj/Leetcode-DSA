class Solution {
    public boolean checkRecord(String s) {
     int countA=0,countL=0,maxCountL=0;
     for(char ch:s.toCharArray())
     {
        if(ch=='A')
        {
            countA++;
        }
        if(ch=='L')
        {
            countL++;
            maxCountL=Math.max(maxCountL,countL);
        }
        else{
            countL=0;
        }
     }   
     return countA<2&&maxCountL<3;
    }
}