class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>asd=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(asd.contains(nums[i])){
                return true;
            }
            asd.add(nums[i]);
        }
        return false;
    }
}