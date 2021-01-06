import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        int cnt = 0;
        int i = 0;

        while (i <= str1.length() - str2.length()) {
            if (str1.substring(i, i + str2.length()).equals(str2)) {
                cnt++;
                i += str2.length();
            } else {
                i++;
            }
        }

        System.out.println(cnt);

    }
}