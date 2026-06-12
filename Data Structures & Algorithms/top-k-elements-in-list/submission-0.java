class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>asd=new HashMap<>();
        for(int fre:nums){
            asd.put(fre,asd.getOrDefault(fre,0)+1);
        }
        List<Map.Entry<Integer,Integer>>lst=new ArrayList<>(asd.entrySet());
        lst.sort((a,b)->b.getValue().compareTo(a.getValue()));
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=lst.get(i).getKey();
        }
        return arr;
    }
}
