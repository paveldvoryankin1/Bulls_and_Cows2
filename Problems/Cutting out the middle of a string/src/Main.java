import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        cut(word);
    }

    public static void cut(String word) {
        if (word.length() % 2 == 0) {
            for (int i = 0; i < word.length(); i++) {
                if (i != word.length() / 2 - 1 && i != word.length() / 2) {
                    System.out.print(word.charAt(i));
                }
            }
        } else {
            for (int i = 0; i < word.length(); i++) {
                if (i != (word.length() - 1) / 2) {
                    System.out.print(word.charAt(i));
                }
            }
        }
    }
}