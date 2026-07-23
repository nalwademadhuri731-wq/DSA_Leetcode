class Solution {

    public boolean tofind(int i,int j,int k,char[][]b,String w){
        if(i<0||j<0||i>=b.length||j>=b[0].length){
            return false;
        }
        if(b[i][j]!=w.charAt(k)){
            return false;
        }
        if(k==w.length()-1){
            return true;
        }
        char temp=b[i][j];
        b[i][j]='#';

        boolean f=( tofind(i+1,j,k+1,b,w)  //for down
        ||tofind(i-1,j,k+1,b,w)||  //for up
        tofind(i,j+1,k+1,b,w)||    //for right
        tofind(i,j-1,k+1,b,w)  );   //for left 
       //backtrack
       b[i][j]=temp;
       return f;
        
    }
    public boolean exist(char[][] board, String word) {
        int i=0;
        int j=0;
        int k=0;
        for( i=0;i<board.length;i++){
            for( j=0;j<board[0].length;j++){
                if(tofind(i,j,k,board,word)){
                    return true;
                }
            }
        }
        return false;

    }
}




























// class Solution {

//     public boolean tofind(int k, int i, int j, char[][] b, String w) {

//         // Boundary check
//         if (i < 0 || j < 0 || i >= b.length || j >= b[0].length) {
//             return false;
//         }

//         // Character does not match
//         if (b[i][j] != w.charAt(k)) {
//             return false;
//         }

//         // Entire word matched
//         if (k == w.length() - 1) {
//             return true;
//         }

//         // Mark current cell as visited
//         char temp = b[i][j];
//         b[i][j] = '#';

//         // Explore all 4 directions
//         boolean found =
//                 tofind(k + 1, i + 1, j, b, w) ||   // Down
//                 tofind(k + 1, i - 1, j, b, w) ||   // Up
//                 tofind(k + 1, i, j + 1, b, w) ||   // Right
//                 tofind(k + 1, i, j - 1, b, w);     // Left

//         // Backtrack
//         b[i][j] = temp;

//         return found;
//     }

//     public boolean exist(char[][] b, String w) {

//         for (int i = 0; i < b.length; i++) {
//             for (int j = 0; j < b[0].length; j++) {

//                 if (tofind(0, i, j, b, w)) {
//                     return true;
//                 }
//             }
//         }

//         return false;
//     }
// }