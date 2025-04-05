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

       Sudoku sudoku = new Sudoku();
       System.out.println(sudoku);

        // [[],[],[]],
        // [[],[],[]],
        // [[],[],[]],
/*
        System.out.println(squareList);

        System.out.println("-------------------------");
        for (int i = 0; i < 8; i++) {
            System.out.println(squareList.get(i));
        }


        -------------------------
        | 0 1 2 | 3 4 5 | 6 7 8 |
        | 0 1 2 | 3 4 5 | 6 7 8 |
        | 0 1 2 | 3 4 5 | 6 7 8 |
        -------------------------
        | 0 1 2 | 3 4 5 | 6 7 8 |
        | 0 1 2 | 3 4 5 | 6 7 8 |
        | 0 1 2 | 3 4 5 | 6 7 8 |
        -------------------------
        | 0 1 2 | 3 4 5 | 6 7 8 |
        | 0 1 2 | 3 4 5 | 6 7 8 |
        | 0 1 2 | 3 4 5 | 6 7 8 |
        ------------------------
        */

    }
}