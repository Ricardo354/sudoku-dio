public class Position {

    public Integer row;
    public Integer col;

    public Position(Integer row, Integer col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", row, col);
    }
}
