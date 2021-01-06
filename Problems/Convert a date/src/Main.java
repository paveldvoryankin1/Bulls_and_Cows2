import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dateStr = scanner.nextLine();
        String[] dateArr = dateStr.split("-");
        System.out.print(dateArr[1] + "/");
        System.out.print(dateArr[2] + "/");
        System.out.print(dateArr[0]);
    }
}