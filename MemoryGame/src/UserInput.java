import java.util.Scanner;

public class UserInput {

    public static void inputLevel() {

        String str = "";
        int chances;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Choose difficulty level : easy or hard");
            System.out.println("");
            str = scanner.nextLine().toLowerCase(); //reads string from the user and changes to lower case

            if (!str.equals("easy") && !str.equals("hard")) {
                System.out.println("Wrong input string");
                System.out.println("");
            } else if (str.equals("easy")) {
                System.out.print("Level: " + str);
                System.out.println();
                chances = 10;
                System.out.println("Guess chances: " + chances);
                System.out.println();
                DisplayMatrix.showSimpleMatrix();
                System.out.println();
                for (int i = 0; i < 4; i++) {
                    String randomWord = ReadFile.read();
                    System.out.println("Random word no. " + (i + 1) + " is: " + randomWord);
                }
                scanner.close();
                break;
            } else {
                System.out.print("Level: " + str);
                System.out.println();
                chances = 15;
                System.out.println("Guess chances: " + chances);
                System.out.println();
                DisplayMatrix.showAdvancedMatrix();
                System.out.println();
                for (int i = 0; i < 8; i++) {
                    String randomWord = ReadFile.read();
                    System.out.println("Random word no. " + (i + 1) + " is: " + randomWord);
                }
                scanner.close();
                break;
            }
        }

    }

}
