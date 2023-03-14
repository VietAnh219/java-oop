import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Bai2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a;

        System.out.println("Nhap vao 1 so bat ki");
        a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("So chan");
        } else {
            System.out.println("So le");
        }
    }
}
