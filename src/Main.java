import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//todo нельзя писать поверх других
        System.out.print("Player 1, What is your name? ");
        String firsPlayer = scanner.nextLine();
        System.out.print("Player 2, What is your name? ");
        String secondPlayer = scanner.nextLine();

        String[][] table = new String[3][3];
        for (int i = 0; i < table.length; i++) {
            Arrays.fill(table[i], "-");
        }
        System.out.println("Board:");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
        boolean stop=true;
        int player = 1;
        while (stop) {
            int row;
            int column;
            if (player == 1) System.out.println(firsPlayer + "'s Turn (x):");
            else System.out.println(secondPlayer + "'s Turn (o):");
            System.out.print("Enter row number: ");
            row = scanner.nextInt();
            System.out.print("Enter column number: ");
            column = scanner.nextInt();
            if (player == 1) table[row][column] = "x";
            else table[row][column] = "o";
            System.out.println("Board:");
            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table[i].length; j++) {
                    System.out.print(table[i][j]);
                }
                System.out.println();
            }
            if (player == 1) player = 2;
            else player = 1;

            for (int i = 0; i < 3; i++) {
                if ((table[i][0].equals("x") && table[i][1].equals("x") && table[i][2].equals("x")) || (table[0][i].equals("x") && table[1][i].equals("x") && table[2][i].equals("x"))) {
                    System.out.println("x wins");
                    stop=false;
                    break;
                }
                if ((table[i][0].equals("o") && table[i][1].equals("o") && table[i][2].equals("o")) || (table[0][i].equals("o") && table[1][i].equals("o") && table[2][i].equals("o"))) {
                    System.out.println("o wins");
                    stop=false;
                    break;
                }
            }

        }
    }
}
