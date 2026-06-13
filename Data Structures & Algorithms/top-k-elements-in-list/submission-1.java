class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>asd=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            asd.put(nums[i],asd.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>>res=new ArrayList<>(asd.entrySet());
        res.sort((a,b)->b.getValue().compareTo(a.getValue()));
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=res.get(i).getKey();
        }
        return arr;

    }
}
