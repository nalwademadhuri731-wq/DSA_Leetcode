class Solution {
    public boolean ispalindrom(String str1,int i1,int j2){
        // int i=0;
        // int j=str1.length()-1;
        while(i1<=j2){
            if(str1.charAt(i1)!=str1.charAt(j2)){
                return false;
            }
            i1++;
            j2--;
        }
     return true;
    }
    public void tofind(int i,ArrayList<String>list,List<List<String>>ans,String s){
        if(i==s.length()){
            ans.add(new ArrayList<>(list));
            return ;
        }

        for(int j=i;j<s.length();j++){
            
            if(ispalindrom(s,i,j)==true){
               list.add(s.substring(i,j+1));
                tofind(j+1,list,ans,s);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        ArrayList<String>list=new ArrayList<>();
        int i=0;
        //String str1="";
       // String str2="";

        tofind(i,list,ans,s);
       
         return ans;
    }
}