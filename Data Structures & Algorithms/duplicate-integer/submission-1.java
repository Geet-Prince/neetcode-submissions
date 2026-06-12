class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>asd=new HashSet<>();
        for(int i:nums){
            if(asd.contains(i)){
                return true;
            }
            asd.add(i);
        }
        return false;
        
    }
}