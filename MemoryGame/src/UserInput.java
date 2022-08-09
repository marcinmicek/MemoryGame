import java.util.Scanner;

public class UserInput {

    public static void inputLevel() {

        String str = "";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Choose difficulty level : easy or hard");
            System.out.println("");
            str = scanner.nextLine().toLowerCase(); //reads string from the user and changes to lower case

            if (!str.equals("easy") && !str.equals("hard")) {
                System.out.println("Wrong input string");
                System.out.println("");
            } else {
                System.out.print("You have chosen level: " + str);
                scanner.close();
                break;
            }
        }

    }

}
