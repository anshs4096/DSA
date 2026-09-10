class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr= new int[n][n];
        int srow=0; int erow=n-1;
        int scol=0; int ecol=n-1;
        int m=1;
        while(srow<=erow && scol<=ecol){
            for(int i=scol; i<=ecol; i++){
                arr[srow][i]=m;
                m++;
            }
            for(int i=srow+1; i<=erow; i++){
                arr[i][ecol]=m;
                m++;
            }
            for(int i=ecol-1; i>=scol && srow<erow; i--){
                arr[erow][i]=m;
                m++;
            }
            for(int i=erow-1; i>srow && scol<ecol; i--){
                arr[i][scol]=m;
                m++;
            }
            srow++;
            erow--;
            scol++;
            ecol--;
        }
        return arr;
    }
}