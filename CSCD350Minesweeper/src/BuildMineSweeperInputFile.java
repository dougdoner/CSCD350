import java.util.Random;
import java.util.Scanner;

public class BuildMineSweeperInputFile {
    public static void main(String[] args) {
        int rows, cols, percentage;

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter rows then columns: ");

        String rowsCols = kb.nextLine();

        String[] rowsColsArr = rowsCols.split(" ");

        rows = Integer.parseInt(rowsColsArr[0]);
        cols = Integer.parseInt(rowsColsArr[1]);

        String[][] minesweeperArr = new String[rows][cols];

        Random rand = new Random();

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(rand.nextInt() >= .8
                )
                    minesweeperArr[i][j] = "*";
                else
                    minesweeperArr[i][j] = ".";
            }
        }


        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(minesweeperArr[i][j] + " ");
            }

            System.out.println();
        }
    }
}
