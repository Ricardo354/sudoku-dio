import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Square {

    public int number;
    public Position position;

    public Square(int number, int row, int col) {
        this.number = number;
        this.position = new Position(row, col);
    }

    public int getNumber() {
        return number;
    }

    public Position getPos(){
        return position;
    }

    @Override
    public String toString() {
        return "Square{" +
                "number=" + number +
                ", row=" + position.row +
                ", col=" + position.col +
                '}';
    }
}
