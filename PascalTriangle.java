import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of rows from user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // Loop for each row
        for (int i = 0; i < rows; i++) {

            int number = 1;

            // Print leading spaces for triangle shape
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            // Print Pascal values
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");

                // Calculate next value in row
                number = number * (i - j) / (j + 1);
            }

            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}