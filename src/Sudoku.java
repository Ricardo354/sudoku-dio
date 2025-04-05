import java.util.ArrayList;
import java.util.List;

public class Sudoku {

    public ArrayList<Object> board;

    public Sudoku(){
      this.board = new ArrayList<>();
      ArrayList<Integer> coluna = new ArrayList<>();

      for (int i = 0; i < 9; i++) {
            coluna.add(i);
      }
      //rows
      for (int i = 0; i < 9; i++){
          board.add(coluna);
      }


    };

    @Override
    public String toString() {
        return "Sudoku{" +
                "board=" + board +
                '}';
        // ajeitar toString
    }
}
