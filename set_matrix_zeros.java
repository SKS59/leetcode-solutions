class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean[] v=new boolean[n];
        boolean[] h=new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    h[j]=true;
                    v[i]=true;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(v[i] || h[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
