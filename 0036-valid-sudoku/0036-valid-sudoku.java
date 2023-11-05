class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int r=0;r<9;r++) {
            for(int c = 0;c<9;c++){
                if(board[r][c]=='.'){
                    continue;
                }
                String row = board[r][c]+" is in row "+r;
                String col = board[r][c]+" is in col "+c;
                String dia = board[r][c]+" is in box "+(r/3)+"-"+(c/3);
                if(!(set.add(row) && set.add(col) && set.add(dia))){
                    return false;
                }
            }
        }
        return true;
    }
}