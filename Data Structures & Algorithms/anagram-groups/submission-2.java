class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>asd=new HashMap<>();
        for(String s:strs){
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            String nw=new String(arr);
            asd.putIfAbsent(nw,new ArrayList<>());
            asd.get(nw).add(s);
        }
        return new ArrayList<>(asd.values());
    }
}
