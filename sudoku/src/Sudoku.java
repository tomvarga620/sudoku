public class Sudoku {

    private int empty=0;
    private int size=9;

    public void generateBoard(int[][] board){

        boolean empty = true;
        if(board.length < 2){
            throw new IllegalArgumentException("Array is empty!");
        }

        for(int i=0;i<getSize();i++){
            System.out.println(" ");
            for(int j=0;j<getSize();j++){
                System.out.print(" "+board[i][j]);
            }
        }
    }

    public int getEmpty() {
        return empty;
    }

    public int getSize() {
        return size;
    }


}
