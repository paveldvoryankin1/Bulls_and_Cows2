import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder con = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            con.append(strings[i]);
        }

        for (int i = 0; i < con.length(); i++) {
            if ("0123456789".indexOf(con.charAt(i)) != -1) {
                con.deleteCharAt(i);
                i--;
            }
        }

        return con.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}