import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Sudoku {

    public ArrayList<List<Integer>> board;

    public Sudoku(Map<Position, Integer> squareMap){
      this.board = new ArrayList<>();


      for (int i = 0; i < 9; i++) {
          ArrayList<Integer> linha = new ArrayList<>();
          for (int j = 0; j < 9; j++){
                linha.add(0);
            }
          board.add(linha);
      }

      for (int i = 1; i <= 9; i++){
          for (int j = 1; j <= 9; j++){
              Integer valor = squareMap.get(new Position(i-1,j-1));
              System.out.println(valor);
              if (valor != null){
                  board.get(i-1).set(j-1,valor);
              }
          }
      }


    };

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Board:\n");
        for (int i = 1; i <= board.size(); i++) {
            List<Integer> row = board.get(i-1);
            for (int j = 1; j <= 9; j++) {
                if (j % 3 == 0){
                    sb.append(row.get(j-1)).append(" | ");
                } else {
                    sb.append(row.get(j-1)).append(" ");
                }

            }
            if (i % 3 == 0){
                sb.append("\n");
                sb.append("-----------------------");
                sb.append("\n");
            } else {
                sb.append("\n");
            }

        }
        return sb.toString();
    }
}
