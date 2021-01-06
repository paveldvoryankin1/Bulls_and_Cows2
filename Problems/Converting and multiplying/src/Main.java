import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String curr = scanner.nextLine();
            try {
                if (Integer.parseInt(curr) == 0) {
                    break;
                }
                System.out.println(Integer.parseInt(curr) * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + curr);
            }
        }
    }
}