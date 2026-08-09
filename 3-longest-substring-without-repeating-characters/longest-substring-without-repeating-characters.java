class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        HashMap<Character, Integer> list = new HashMap<>();
        
        int max=0;

        for(int i=0;i<s.length();i++){
            if(list.containsKey(s.charAt(i))){
                if(list.size()>max){
                    max=list.size();
                }
                i=list.get(s.charAt(i))+1;
                list.clear();
                
            }
            list.put(s.charAt(i),i);
        }
        if(list.size()>max){
            max=list.size();
        }
        return max;
    }
}