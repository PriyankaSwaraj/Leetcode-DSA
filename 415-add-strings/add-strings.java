class Solution {
    public String addStrings(String num1, String num2) {
    int carry=0,n=num1.length(),m=num2.length();
    int i=n-1,j=m-1;
    StringBuilder sb=new StringBuilder();
    while(i>=0||j>=0||carry!=0)
    {
        int sum =carry;
        if(i>=0)
        {
            sum += num1.charAt(i)-48;
            i--;
        }
        if(j>=0)
        {
            sum += num2.charAt(j)-48;
            j--;
        }
        sb.append(sum%10);
        carry=sum/10;
    }
    return sb.reverse().toString();    
    }
}