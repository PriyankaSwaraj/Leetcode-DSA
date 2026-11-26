class Solution {
    public boolean canAliceWin(int n) {
      int rem=10;
      boolean alice=true;
      while(n>=rem)
      {
        n -= rem;
        rem--;
        alice =!alice;
      }
      return (!alice&&n<rem);
    }
}