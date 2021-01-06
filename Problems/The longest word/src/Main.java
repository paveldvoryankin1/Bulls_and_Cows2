import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] words = text.split(" ");

        int maxLen = 0;
        String maxWord = "";

        for (int i = 0; i < words.length; i ++) {
            if (words[i].length() > maxLen) {
                maxLen = words[i].length();
                maxWord = words[i];
            }
        }

        System.out.println(maxWord);
    }
}