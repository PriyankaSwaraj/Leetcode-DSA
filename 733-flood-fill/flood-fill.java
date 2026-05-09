class Solution {
    int m,n;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    m=image.length;
    n=image[0].length; 
    boolean[][] visit=new boolean[m][n];
    int check=image[sr][sc]; 
    fill(image,sr,sc,color,check,visit);
    return image;  
    }
    public void fill(int[][] image,int i,int j,int color,int check,boolean[][] visit)
    {
        if(i<0||i>=m||j<0||j>=n)
        return;
        if(visit[i][j]||image[i][j]!=check)
        return;
        visit[i][j]=true;
        image[i][j]=color;
        fill(image,i+1,j,color,check,visit);
        fill(image,i-1,j,color,check,visit);
        fill(image,i,j+1,color,check,visit);
        fill(image,i,j-1,color,check,visit);
    }
}