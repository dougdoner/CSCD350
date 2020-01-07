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

        
    }
}
