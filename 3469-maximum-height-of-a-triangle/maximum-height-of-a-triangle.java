class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
     int red1=red,blue1=blue,max1=0,max2=0,i=1;
     boolean check=true;
     while(red1>0||blue1>0)
     {
        if(check)
        {
            blue1 -= i;
        }
        else{
          red1 -= i;
        }
        i++;
        if(blue1<0||red1<0)
        {
            break;
        }
        check =!check;
        max1++;
     }
     check=true;
     i=1;
     while(red>0||blue>0)
     {
        if(check)
        {
            red -= i;
        }
        else{
            blue -= i;
        }
        if(red<0||blue<0)
        {
            break;
        }
        i++;
        max2++;
        check=!check;
     }
     return Math.max(max1,max2);   
    }
}