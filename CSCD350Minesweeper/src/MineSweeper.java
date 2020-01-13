import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String[] fieldDimensionsArr = kb.nextLine().split(" ");

        int rows = Integer.parseInt(fieldDimensionsArr[0]);
        int columns = Integer.parseInt(fieldDimensionsArr[1]);

        var minefield = new String[rows + 2][columns + 2];
        int numFields = 0;

        while(rows > 0 && columns > 0) {
            numFields++;

            System.out.println("Field #" + numFields + ":");


            for(int i =0; i < rows + 2; i++) {
                for (int j = 0; j < columns + 2; j++) {
                    minefield[i][j] = ".";
                }
            }

            for(int i = 1; i <= rows; i++) {
                String inputLine = kb.nextLine();
                for (int j = 1; j <= columns; j++) {
                    minefield[i][j] = Character.toString(inputLine.charAt(j - 1));
                }
            }

            for(int i = 1; i < rows + 1; i++) {
                for(int j = 1; j < columns + 1; j++) {
                    if(!minefield[i][j].equals(("*")))
                        System.out.print(countMines(i, j, minefield));
                    else
                        System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();

            fieldDimensionsArr = kb.nextLine().split(" ");

            rows = Integer.parseInt(fieldDimensionsArr[0]);
            columns = Integer.parseInt(fieldDimensionsArr[1]);

            minefield = new String[rows + 2][columns + 2];
        }
    }

    private static int countMines(final int rowIndex, final int columnIndex, final String[][] strArray) {
        int numMines = 0;

        for(int row = rowIndex - 1; row < rowIndex + 2; row++) {
            for(int column = columnIndex - 1; column < columnIndex + 2; column++) {
                if(strArray[row][column].equals("*"))
                    numMines++;
            }
        }

        return numMines;
    }
}
