class Solution {
    public static int digitSum(int n){
       int sum=0;
        while(n>0){
            int last=n%10;
            sum+=last;
            n=n/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int m=nums[i];
            int num=digitSum(m);
            if(num==i){
                return i;
            }
        }
        return -1;
    }
}