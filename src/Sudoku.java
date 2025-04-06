import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Sudoku {

    public ArrayList<List<Square>> board;

    public Sudoku(Map<Position, Integer> squareMap){
      this.board = new ArrayList<>();

      // isso aq nunca vai ter square editavel
      for (int i = 0; i < 9; i++) {
          ArrayList<Square> linha = new ArrayList<>();
          for (int j = 0; j < 9; j++){
                linha.add(new Square(0, i,j,true));
            }
          board.add(linha);
      }

      for (int i = 1; i <= 9; i++){
          for (int j = 1; j <= 9; j++){
              Integer valor = squareMap.get(new Position(i-1,j-1));
              if (valor != null){
                  setSquare(new Square(valor,i-1,j-1,false));
              }
          }
      }

    };

    public void setSquare(Square s){
        Square atual = board.get(s.getPos().row).get(s.getPos().col);
        if (atual.editable){
            board.get(s.getPos().row).set(s.getPos().col, s);
        } else{
            System.out.println("no");
        }

    };

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n");
        for (int i = 1; i <= board.size(); i++) {
            List<Square> row = board.get(i-1);
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
