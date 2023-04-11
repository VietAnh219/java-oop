import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float dai;
        float rong;
        float cv;
        float dt;
        System.out.println("nhap chieu dai:");
        dai = scanner.nextFloat();
        System.out.println("nhap chieu rong:");
        rong = scanner.nextFloat();
        cv = (dai + rong) * 2;
        System.out.println("cv hinh chu nhat la:" + cv);
        dt = dai * rong;
        System.out.println("dt hinh chu nhat la:" + dt);
    }
}
