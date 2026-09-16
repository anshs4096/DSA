class Solution {
    public String removeStars(String s) {
        StringBuilder sb= new StringBuilder(s);
        int count=0;
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i)=='*'){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);
                i=i-2;
            }
        }
        String str=sb.toString();
        return str;
    }
}