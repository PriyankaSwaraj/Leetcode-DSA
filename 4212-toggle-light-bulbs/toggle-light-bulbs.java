class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
    boolean[] bulb=new boolean[101];
    for(int num:bulbs)
    {
        bulb[num]=!bulb[num];
    }    
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i=1;i<101;i++)
    {
        if(bulb[i])
        arr.add(i);
    }
    return arr;
    }
}