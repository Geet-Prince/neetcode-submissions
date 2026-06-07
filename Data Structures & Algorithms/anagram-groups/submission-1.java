class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>asd=new HashMap<>();
        for(String s:strs){
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            String naya=new String(arr);
            asd.putIfAbsent(naya,new ArrayList<>());
            asd.get(naya).add(s);
        }
        return new ArrayList<>(asd.values());
    }
}
