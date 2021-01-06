import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        boolean isPal = true;

        for (int i = 0; i < s.length() / 2 + 1; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPal = false;
            }
        }

        if (isPal) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}