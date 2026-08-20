class Solution {
    public boolean isValid(String p) {
        Stack<Character>s=new Stack<>();
         int i=0;
         while(i<p.length()){
            if(s.isEmpty()){s.push(p.charAt(i++));
            continue;
            }
            if(s.peek()=='('&&p.charAt(i)==')'||s.peek()=='['&&p.charAt(i)==']'||s.peek()=='{'&&p.charAt(i)=='}'){
                s.pop();
                i++;
            }else{
                s.push(p.charAt(i++));
            }
         }
        if(s.isEmpty())return true;
        return false;
    }
}