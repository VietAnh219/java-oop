package src.shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float banKinh;
    Scanner scanner = new Scanner(System.in);

    public HinhTron() {
        ten = "Hinh Tron";
    }

    public void nhapBanKinh() {
        System.out.println("Ban kinh = ");
        banKinh = scanner.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }
}
