class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        int j=0;
        int[] ans= new int[n];
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                if(j<n){
                    ans[j]=arr[i];
                j++;
                }
                
                
            }else{
                if (j < n) {
                    ans[j] = 0;
                    j++;
                }
                if (j < n) {
                    ans[j] = 0;
                    j++;
                }
            }
        }
        for(int i=0; i<n; i++){
            arr[i]=ans[i];
        }
    }
}