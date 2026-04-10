class Solution {
    public String convert(String s, int numRows) {
    int n=s.length();
    Character[][] matrix=new Character[numRows][n];
    int k=0;
    int j=0;
    while(j<n&&k<n)
    {
        int i=0;
        while(i<numRows&&k<n)
        {
            matrix[i][j]=s.charAt(k);
            k++;
            i++;
        }
        j++;
        i=numRows-2;
        while(i>0&&k<n)
        {
            matrix[i][j]=s.charAt(k);
            k++;
            i--;
            j++;
        }
    }
    StringBuilder sb=new StringBuilder();
    for(int l=0;l<numRows;l++)
    {
        for(int i=0;i<n;i++)
        {
            if(matrix[l][i]!=null)
            sb.append(matrix[l][i]);
        }
    }
    return sb.toString();    
    }
}