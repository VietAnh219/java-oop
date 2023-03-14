import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Bai9 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String string;
        int number = 0, upperCase = 0, lowCase = 0;

        System.out.println("Nhap vao chuoi ky tu bat ky: ");
        string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLowerCase(string.charAt(i))) {
                lowCase++;
            }
            if (Character.isUpperCase(string.charAt(i))) {
                upperCase++;
            }
            if (Character.isDigit(string.charAt(i))) {
                number++;
            }
        }
        System.out.printf("Co %d ky tu hoa", upperCase);
        System.out.printf("Co %d ky tu thuong", lowCase);
        System.out.printf("Co %d so", number);
    }

}
