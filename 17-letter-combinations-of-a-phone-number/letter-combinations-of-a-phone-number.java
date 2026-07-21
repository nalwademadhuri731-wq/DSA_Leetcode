class Solution {
    public void tofind(int j,int k,List<String> list,String digits, String [] map,String str){
        if(str.length()==digits.length()){
           String  s=str;
           list.add(s);
           return;
        }
        String demo=map[digits.charAt(k)-'0'];

        for(int i=0;i<demo.length();i++){
           
            tofind(j+1,k+1,list,digits,map,str+demo.charAt(i));
        }

    }
    public List<String> letterCombinations(String digits) {
          List<String> list=new ArrayList<>();
        int j=digits.charAt(0)-'0';
        // HashMap<Character,String>map=new HashMap<>();
        // map.put('2',"abc");
        // map.put('3',"def");
        // map.put('4',"ghi");
        // map.put('5',"jkl");
        // map.put('6',"mno");
        // map.put('7',"pqrs");
        // map.put('8',"tuv");
        // map.put('9',"wxyz");
        int k=0;
        String [] map={
            "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        String str="";
        tofind(j,k,list,digits,map,str);
        return list;
    }
}


