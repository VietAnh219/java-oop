import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Bai8 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n, number, sum = 0, average;

        System.out.println("Nhap vao cac so nguyen n: ");
        number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println("Nhap lan luot tung so la: ");
            n = scanner.nextInt();

            sum += n;
        }

        average = (sum / number);
        System.out.printf("Trung binh cong la: %d", average);
    }
}
