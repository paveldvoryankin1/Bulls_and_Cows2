import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sent = scanner.next();
        int n = scanner.nextInt();

        if (n > sent.length()) {
            System.out.println(sent);
        } else {
            System.out.println(sent.substring(n, sent.length()) + sent.substring(0, n));
        }
    }
}