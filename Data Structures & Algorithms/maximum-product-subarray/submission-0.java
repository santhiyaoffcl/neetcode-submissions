class Solution {
    public int maxProduct(int[] nums) {
      int minPro = nums[0];
        int maxPro = nums[0];
        int ans = nums[0];
        for(int i = 1; i < nums.length;i++){
            int num = nums[i];
            int temp = maxPro;
            
            maxPro = Math.max(num,Math.max(temp*num,minPro*num));
            minPro = Math.min(num,Math.min(temp*num,minPro*num));
            ans = Math.max(ans,maxPro);
        }
        return ans;  
    }
}
