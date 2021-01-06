import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();

        switch (shape) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                System.out.println(floorTriangle(a, b, c));
                break;
            case "rectangle":
                double e = scanner.nextDouble();
                double d = scanner.nextDouble();
                System.out.println(floorRectangle(e, d));
                break;
            case "circle":
                double r = scanner.nextDouble();
                System.out.println(floorCircle(r));
                break;
        }
    }

    public static double floorTriangle(double a, double b, double c) {
        double p = (a + b + c ) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double floorRectangle(double a, double b) {
        return a * b;
    }

    public static double floorCircle(double r) {
        return 3.14 * r * r;
    }

}