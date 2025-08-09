class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for (String s:strs){
            char[] chararray=s.toCharArray();
            Arrays.sort(chararray);
            String sortedS=new String(chararray);
            res.putIfAbsent(sortedS,new ArrayList<String>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
        
    }
}