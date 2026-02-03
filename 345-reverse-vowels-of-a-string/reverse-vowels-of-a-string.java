class Solution {
    public String reverseVowels(String s) {
     StringBuilder sb=new StringBuilder(s);
     int n = s.length();
     ArrayList<Character> arr=new ArrayList<>();
     for(int i=0;i<n;i++)
     {
     if((sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u')   ||
            (sb.charAt(i)=='A'||sb.charAt(i)=='E'||sb.charAt(i)=='O'||sb.charAt(i)=='I'||sb.charAt(i)=='U')  )
            {
                arr.add(s.charAt(i));
            }
     }
    Collections.reverse(arr);
     for(int i=0;i<n;i++)
     {
     if((sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u')   ||
            (sb.charAt(i)=='A'||sb.charAt(i)=='E'||sb.charAt(i)=='O'||sb.charAt(i)=='I'||sb.charAt(i)=='U')  )
            {
                sb.setCharAt(i,arr.get(0));
                arr.remove(0);
            }
     }
     return sb.toString();
    }
}