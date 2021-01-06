import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sen = scanner.nextLine();
        int loc = -1;
        int i = 0;
        while (i <= sen.length() - 3 && loc == -1) {
            if (sen.toLowerCase().substring(i, i + 3).equals("the")) {
                loc = i;
            }
            i++;
        }

        System.out.println(loc);
    }
}