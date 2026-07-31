class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Set<List<Integer>> list = new HashSet<>();
        int arr[] = new int[3];
        int n = nums.length;
        for(int i = 0;i < n ;i++){
            for(int j = i+1;j < n;j++){
                for(int k = j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    Collections.sort(temp);
                    list.add(temp);
                    }
                }
            }
        }
      
        
        return new ArrayList<>(list);
    }
}
