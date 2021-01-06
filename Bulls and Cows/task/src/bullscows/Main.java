package bullscows;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codeLen;
        int codePoss;
        System.out.println("Input the length of the secret code:");
        String codeLenStr = scanner.nextLine();
        try {
            codeLen = Integer.parseInt(codeLenStr);
            if (codeLen > 36) {
                System.out.println("Error: code length or a number of available characters can't be bigger than 36");
            } else {
                System.out.println("Input the number of possible symbols in the code:");
                String codePossStr = scanner.nextLine();
                try {
                    codePoss = Integer.parseInt(codePossStr);
                    if (codeLen > codePoss) {
                        System.out.println("Error: code length can't be bigger than the number of available characters");
                    } else {
                        StringBuilder gameCode = codeGenerator(codeLen, codePoss);
                        System.out.print("The secret is prepared: ");
                        for (int i = 0; i < codeLen; i++) {
                            System.out.print("*");
                        }
                        if (codePoss <= 10) {
                            System.out.println(" (0-" + "0123456789abcdefghijklmnopqrstuvwxyz".charAt(codePoss - 1) + ").");
                        } else {
                            System.out.println(" (0-9, a-" + "0123456789abcdefghijklmnopqrstuvwxyz".charAt(codePoss - 1) + ").");
                        }

                        playCow(gameCode.toString());
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + codePossStr + " is not a number");
                }
            }

        } catch (Exception e){
            System.out.println("Error: " + codeLenStr + " is not a number");
        }
    }

    public static StringBuilder codeGenerator(int codeLen, int possChars) {
        Random random = new Random();
        if (codeLen > 36 || possChars > 36) {
            StringBuilder error1 = new StringBuilder();
            return error1.append("Error1");
        } else if (codeLen > possChars) {
            StringBuilder error2 = new StringBuilder();
            return error2.append("Error2");
        } else {
            StringBuilder codeWord = new StringBuilder();
            String pool = "0123456789abcdefghijklmnopqrstuvwxyz";
            while (codeWord.length() < codeLen) {
                int poolIndex = random.nextInt(possChars);
                if (!codeWord.toString().contains(Character.toString(pool.charAt(poolIndex)))) {
                    codeWord.append(pool.charAt(poolIndex));
                }

            }
            System.out.println(codeWord);
            return codeWord;
        }
    }

    public static void playCow(String secret) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Okay, let's start a game!");
        int bull = 0;
        int cow = 0;
        int i = 0;
        int j = 0;
        while (bull < secret.length()) {
            String guess = scanner.nextLine();
            bull = 0;
            cow = 0;
            i = 0;
            j = 0;

            for (i = 0; i < secret.length(); i++) {
                for (j = 0; j < guess.length(); j++) {
                    if (secret.charAt(i) == guess.charAt(j)) {
                        if (i == j) {
                            bull++;
                        } else {
                            cow++;
                        }
                    }
                }
                j = 0;
            }
            System.out.print("Grade: ");
            if (bull == 0 && cow == 0) {
                System.out.println("None");
            } else if (bull != 0 && cow != 0) {
                System.out.println(bull + " bull(s) and " + cow + " cow(s)");
            } else {
                if (bull != 0) {
                    System.out.println(bull + " bulls");
                } else {
                    System.out.println(cow + " cow(s)");
                }
            }
        }
        System.out.println("Congratulations! You guessed the secret code.");
    }
}