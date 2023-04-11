import java.util.Scanner;

public class HinhTru {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final float pi = 3.14f;
        float r;
        float h;
        System.out.print("nhap ban kinh: ");
        r = scanner.nextFloat();
        System.out.print("nhap chieu cao: ");
        h = scanner.nextFloat();
        float thetich = 2 * pi * r * r * h;
        System.out.println("the tich hinh tru: " + thetich);
    }
}
