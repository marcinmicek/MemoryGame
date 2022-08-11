import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {

    public static String read() {
        String empty = "";

            try {
                File myObj = new File("G:\\Programowanie\\Java\\Motorola Solutions\\Words.txt");
                ArrayList<String> gameWords = new ArrayList<String>();
                Scanner myReader = new Scanner(myObj);

                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    gameWords.add(data);
                }

                System.out.println("gameWords = " + gameWords);

                // finding random index of gameWords list
                int random = (int) (Math.random() * gameWords.size());
                myReader.close();
                return gameWords.get(random);

            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        return empty;
    }
}
