class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        TreeMap<Integer,StringBuilder> grpChars=new TreeMap<>(Collections.reverseOrder());
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            char ch=entry.getKey();
            int count=entry.getValue();
            grpChars.putIfAbsent(count,new StringBuilder());
            grpChars.get(count).append(String.valueOf(ch).repeat(count));
        }
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Integer,StringBuilder>entry:grpChars.entrySet()){
            StringBuilder str=entry.getValue();
            sb.append(str);
        }
        return sb.toString();
    }
}