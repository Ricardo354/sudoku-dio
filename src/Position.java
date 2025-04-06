import java.util.Objects;

public class Position {

    public Integer row;
    public Integer col;

    public Position(Integer row, Integer col) {
        this.row = row;
        this.col = col;
    }

    // implement hashcode and equals

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Position position)) return false;
        return Objects.equals(row, position.row) && Objects.equals(col, position.col);
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)", row, col);
    }
}
