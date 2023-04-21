import java.util.Scanner;

interface Calculator {
    int calculate(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator sum = (int d, int n) -> a + b;
        System.out.println(sum.calculate(a, b));

        Calculator subtract = (int k, int l) -> a - b;
        System.out.println(subtract.calculate(a, b));

        Calculator multiplication = (int m, int n) -> a * b;
        System.out.println(multiplication.calculate(a, b));

        Calculator divided = (int f, int e) -> a / b;
        System.out.println(divided.calculate(a, b));
    }
}
