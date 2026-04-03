class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
     int mini=101,index=-1,i=0;
     for(int num:capacity)
     {
       if(num>=itemSize&&num<mini)
       {
         index=i;
         mini=num;
       }
       i++;
     }   
     return index;
    }
}