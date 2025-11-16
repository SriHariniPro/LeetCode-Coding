class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean rm[][] = new boolean[9][9];
        boolean cm[][] = new boolean[9][9];
        boolean sm[][] = new boolean[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c = board[i][j];
                if(c=='.'){
                    continue;
                }
                int d = c - '0' -1;
                int sbi = (i/3)*3 + (j/3);
                
                if(rm[i][d] || cm[j][d] || sm[sbi][d]){
                    return false;
                }
                rm[i][d] = true;
                cm[j][d] = true;
                sm[sbi][d] = true;
            }
        }
        return true;
    }
}
