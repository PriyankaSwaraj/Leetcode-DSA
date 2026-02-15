import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
       BigInteger num = toDecimal(a).add(toDecimal(b));
    return tobinary(num);
    }
     public BigInteger toDecimal(String str)
    {
        BigInteger num = BigInteger.valueOf(0);
        for(int i=str.length()-1,j=0;i>=0;i--,j++)
        {
            if(str.charAt(i)=='1')
            {
             num = num.add(BigInteger.valueOf(2).pow(j));
            }

        }
        return num;
    }
    public String tobinary(BigInteger  num)
    {
        String str ="";
        while(num.compareTo(BigInteger.ZERO)>0)
        {
            str += (num.mod(BigInteger.valueOf(2))).toString();
            num = num.divide(BigInteger.valueOf(2));
        }
        StringBuilder sb = new StringBuilder(str);
        if(str.equals(""))
        {
            return "0";
        }
        return sb.reverse().toString();
    }
}