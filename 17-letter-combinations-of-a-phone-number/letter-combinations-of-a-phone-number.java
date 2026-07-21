class Solution {

    public void tofind(HashMap<Character,String> map,
                       String str,
                       String digits,
                       List<String> list,
                       int j){

        if(j==digits.length()){
            list.add(str);
            return;
        }

        String letters = map.get(digits.charAt(j));

        for(int i=0;i<letters.length();i++){

            tofind(map,
                   str + letters.charAt(i),
                   digits,
                   list,
                   j+1);
        }
    }

    public List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<>();

        if(digits.length()==0)
            return list;

        HashMap<Character,String> map = new HashMap<>();

        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        tofind(map,"",digits,list,0);

        return list;
    }
}