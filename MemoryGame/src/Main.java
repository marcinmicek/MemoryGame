public class Main {
    public static void main(String[] args) {

        UserInput.inputLevel();
        System.out.println();
        String randomWord = ReadFile.read();
        System.out.println("Random word is: " + randomWord);
    }
}
