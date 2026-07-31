class Solution {
    public int[] productExceptSelf(int[] nums) {
        ArrayList<Integer> ans  = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
        int product = 1;
        for(int j =0 ;j < nums.length;j++){
            if(i!=j){
              product *= nums[j];
            }
        }
        ans.add(product);
        }  
        int[] arr = new int[ans.size()];
        for(int i = 0;i < ans.size();i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}  
