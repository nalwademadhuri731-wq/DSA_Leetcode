class Solution {
    public void sol(int row,char [][] arr, List<List<String>>ans ){
        if(row==arr.length){
            ArrayList<String>list=new ArrayList<>();

            for(int i=0;i<arr.length;i++){
                list.add(new String(arr[i]));
            }
            ans.add(list);
            return;
        }

        for(int col=0;col<arr.length;col++){
            if(issafe(row,col,arr)){
                arr[row][col]='Q';
                sol(row+1,arr,ans);
                arr[row][col]='.';
            }
        }


    }

public boolean issafe(int row,int col,char[][]arr){

    //check in clo
    for(int i=row-1,j=col;i>=0;i=i-1){
        if(arr[i][j]=='Q'){
            return false;
        }
    }

    for(int i=row-1,j=col+1;i>=0&&j<arr[0].length;i=i-1,j=j+1){
        if(arr[i][j]=='Q'){
            return false;
        }
    }

    for(int i=row-1,j=col-1;i>=0&&j>=0;i=i-1,j--){
        if(arr[i][j]=='Q'){
            return false;
        }
    }

    return true;

 
}
    public List<List<String>> solveNQueens(int n) {
                List<List<String>> ans=new ArrayList<>();
                
                char [][] arr= new char[n][n];

                for(int i=0;i<arr.length;i++){
                    Arrays.fill(arr[i],'.');
                }
               sol(0,arr,ans);

               return ans ;




    }
}




// class Solution {

//     public List<List<String>> solveNQueens(int n) {

//         List<List<String>> ans = new ArrayList<>();

//         char[][] board = new char[n][n];

//         for (int i = 0; i < n; i++) {
//             Arrays.fill(board[i], '.');
//         }

//         solve(0, board, ans);

//         return ans;
//     }

//     public void solve(int row, char[][] board, List<List<String>> ans) {

//         if (row == board.length) {

//             List<String> temp = new ArrayList<>();

//             for (char[] r : board) {
//                 temp.add(new String(r));
//             }

//             ans.add(temp);
//             return;
//         }

//         for (int col = 0; col < board.length; col++) {

//             if (isSafe(board, row, col)) {

//                 board[row][col] = 'Q';

//                 solve(row + 1, board, ans);

//                 board[row][col] = '.';
//             }
//         }
//     }

//     public boolean isSafe(char[][] board, int row, int col) {

//         // Check same column
//         for (int i = 0; i < row; i++) {
//             if (board[i][col] == 'Q')
//                 return false;
//         }

//         // Check left diagonal
//         for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//             if (board[i][j] == 'Q')
//                 return false;
//         }

//         // Check right diagonal
//         for (int i = row - 1, j = col + 1;
//              i >= 0 && j < board.length;
//              i--, j++) {

//             if (board[i][j] == 'Q')
//                 return false;
//         }

//         return true;
//     }
// }