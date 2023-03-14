import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a, b, sum, minus, multiply, division, residual;

        System.out.println("Nhap so nguyen a");
        a = scanner.nextInt();
        System.out.println("Nhap so nguyen b");
        b = scanner.nextInt();

        sum = a + b;
        System.out.printf("\nTong cua hai so la: %d", sum);

        minus = a - b;
        System.out.printf("\nHieu cua hai so la: %d", minus);

        multiply = a * b;
        System.out.printf("\nTich cua hai so la: %d", multiply);

        division = a / b;
        System.out.printf("\nThuong cua hai so la: %d", division);

        residual = a % b;
        System.out.printf("\nPhan du cua hai so la: %d", residual);

        if (a == b) {
            System.out.println("\nHai so bang nhau");
        } else if (a > b) {
            System.out.printf("\n%d > %d ", a, b);
        } else {
            System.out.printf("\n%d < %d ", a, b);
        }

    }
}
