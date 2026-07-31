class Solution {
    public int search(int[] nums, int target) {
        int ans = 0;
        int count =0;
        for(int i =0;i < nums.length;i++){
            if(nums[i]==target){
                count++;
              ans = i;
            }
        }
        if(count ==0){
            ans =-1;
        }
        return ans;
    }
}
