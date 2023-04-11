import java.util.Scanner;

public class HinhTron {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("nhap ban kinh hinh tron:");
        double bankinh = input.nextDouble();
        double chuvi = 2 * Math.PI * bankinh;
        double dientich = Math.PI * bankinh * bankinh;
        System.out.println("chuvi cua hinh tron la: " + chuvi);
        System.out.println("dientich cua hinh tron la: " + dientich);
    }
}
