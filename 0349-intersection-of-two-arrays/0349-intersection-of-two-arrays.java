class Solution {
    public int[] intersection(int[] a, int[] b) {
        int m=a.length; int n=b.length;

        ArrayList<Integer> list= new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        if(m<n){
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(a[i]==b[j] && !list.contains(a[i])){
                        list.add(a[i]);
                    }if(b[j]>a[i]){
                        break;
                    }
                }
            }
        }else{
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(b[i]==a[j] && !list.contains(b[i])){
                        list.add(b[i]);
                    }if(a[j]>b[i]){
                        break;
                    }
                }
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
             ans[i] = list.get(i);
        }
        return ans;
    }
}