import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dna = scanner.nextLine();            // считываем строку
        String dna2 = "";
        int cnt = 1;                                   //счётчик вхождений
        char currLetter = dna.charAt(0);            // текущий символ
        for (int i = 1; i < dna.length(); i++) {
            if (dna.charAt(i) == currLetter) {
                cnt++;
            } else {
                dna2 = dna2 + currLetter + cnt;
                currLetter = dna.charAt(i);
                cnt = 1;
            }
        }
        dna2 = dna2 + currLetter + cnt;
        System.out.println(dna2);
    }
}