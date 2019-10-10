public interface SudokuRules {
    public boolean checkRow(int col,int row);
    public boolean checkCol(int col,int num);
    public boolean check3x3(int row,int col,int num);
    public boolean checkAll(int row,int col,int num);
}
