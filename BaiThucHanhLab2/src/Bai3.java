import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Bai3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int year, yearold;
        String Name;

        System.out.println("Nhap ten cua ban: ");
        Name = scanner.nextLine();

        System.out.println("Nhap vao nam sinh cua ban: ");
        year = scanner.nextInt();

        yearold = 2023 - year;

        if (yearold < 16) {
            System.out.println("Ban " + Name + " o do tuoi vi thanh nien");
        } else if (yearold >= 16 && yearold < 18) {
            System.out.println("Ban " + Name + " o do tuoi truong thanh");
        } else {
            System.out.println("Ban " + Name + " da gia");
        }

    }
}
