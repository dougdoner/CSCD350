import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Random;
import java.util.Scanner;

public class BuildMineSweeperInputFile {
    public static void main(String[] args) {
        int rows, cols, percentage;

        Scanner kb = new Scanner(System.in);

        FileWriter inputFileWriter;
        BufferedWriter inputBufferedWriter;

        try {
            inputFileWriter = new FileWriter("inputfile.txt", false);
            inputBufferedWriter = new BufferedWriter(inputFileWriter);

            do {
                System.out.println("Enter rows then columns: ");

                String rowsCols = kb.nextLine();

                String builtOutputString = "";

                String[] rowsColsArr = rowsCols.split(" ");

                rows = Integer.parseInt(rowsColsArr[0]);
                cols = Integer.parseInt(rowsColsArr[1]);

                builtOutputString += rows + " " + cols + "\r\n";

                String[][] minesweeperArr = new String[rows][cols];

                Random rand = new Random();

                for(int i = 0; i < rows; i++) {
                    for(int j = 0; j < cols; j++) {
                        if(rand.nextInt(100) >= 80) {
                            minesweeperArr[i][j] = "*";
                        }
                        else
                            minesweeperArr[i][j] = ".";
                    }
                }

                for(int i = 0; i < rows; i++) {
                    for(int j = 0; j < cols; j++) {
                        builtOutputString += minesweeperArr[i][j] + " ";
                    }
                    builtOutputString += "\r\n";
                }


                inputBufferedWriter.write(builtOutputString);

            }while(rows != 0 && cols != 0);

            inputBufferedWriter.close();

        } catch (IOException e) {
            System.out.println("IOException in opening input file");
        }

    }
}
