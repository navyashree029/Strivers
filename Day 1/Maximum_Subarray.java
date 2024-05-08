class Solution {
    public int maxSubArray(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int n=nums.length;
         int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum<nums[i]){
                sum=nums[i];
            }
            if(sum>maxi){
                maxi=sum;
            }
            }
        return maxi;
        
    }
}