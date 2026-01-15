class Solution {
    public boolean checkIfPangram(String sentence) {
    HashSet<Character> arr = new HashSet<Character>();
    for(int i=0;i<sentence.length();i++)
    {
        arr.add(sentence.charAt(i));
    }
    char ch='a';
    int i=0;
    while(i<26)
    {
        if(!arr.contains(ch))
        {
            return false;
        }
        i++;
        ch +=1;
    }
    return true;
}
}