class Solution {
    public int findMin(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : nums){
          list.add(num);
        }
        int min = Collections.min(list);
        return min;
    }
}
