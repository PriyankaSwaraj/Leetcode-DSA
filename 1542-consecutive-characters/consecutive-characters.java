class Solution {
    public int maxPower(String s) {
    int n=s.length();
    int power=0,max_power=0;
    for(int i=1;i<n;i++)
    {
        if(s.charAt(i)==s.charAt(i-1))
        {
          power++;
          max_power=Math.max(power,max_power);
        }
        else{
            power=0;
        }
    }  
    return max_power+1;  
    }
}