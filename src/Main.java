import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Map<Position, Integer> squareMap = new HashMap<>();
        // add exception here
        for (String sq: args){
            String[] params = sq.split(",");
            squareMap.put(new Position(
                    Integer.parseInt(params[1]),
                    Integer.parseInt(params[2])
            ), Integer.parseInt(params[0]));
        }
// validar, X numero n pode estar na msm 3x3 grid
// X numero n pode estar na msm row q X numero
// X numero n pode estar na msm col que X numero

// validar no constructor e validar quando for inserir
       Sudoku sudoku = new Sudoku(squareMap);
       System.out.println(sudoku);

    }
}