class Solution {
    public int reverse(int x)
    {
        String s= Integer.toString(x);
        String str="";
        int check =0;
        if(x<0)
        {
             check =1;
        }
        int num = s.length()-1;
        while(num>=0)
        {
            if(check>0&&num==0)
            {
                break;
            }
            str +=s.charAt(num);
            num--;
        }
        long n = Long.parseLong(str);
        if(check>0 )
        {
            n= -n;
        }
        if(n<(-Math.pow(2,31)-1)||n>Math.pow(2,31)-1)
        {
            return 0;
        }
        return (int)n;
    }
}