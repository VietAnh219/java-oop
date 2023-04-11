package src.shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    Scanner scanner = new Scanner(System.in);

    public HinhVuong() {
        ten = "Hinh Vuong";
    }

    public void nhapCanh() {
        System.out.println("Canh = ");
        dai = rong = scanner.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = dai * 4;
    }

    public void tinhDienTich() {
        dienTich = dai * dai;
    }
}
