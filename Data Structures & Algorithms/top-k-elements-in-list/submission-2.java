class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>asd=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            asd.put(nums[i],asd.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>>lst=new ArrayList<>(asd.entrySet());
        lst.sort((a,b)->b.getValue().compareTo(a.getValue()));
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=lst.get(i).getKey();
        }
        return res;
    }
}
