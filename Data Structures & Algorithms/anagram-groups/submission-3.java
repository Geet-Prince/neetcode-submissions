class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>asd=new HashMap<>();
        for(String s:strs){
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            String ns=new String(arr);
            asd.putIfAbsent(ns,new ArrayList<>());
            asd.get(ns).add(s);
        }
        return new ArrayList<>(asd.values());
    }
}
