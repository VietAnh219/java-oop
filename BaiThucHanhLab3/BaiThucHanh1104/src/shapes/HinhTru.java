package src.shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieuCao;
    Scanner scanner = new Scanner(System.in);

    public HinhTru() {
        ten = "Hinh Tru";
    }

    public void nhapChieuCao() {
        nhapBanKinh();

        System.out.println("Chieu cao = ");
        chieuCao = scanner.nextFloat();
    }

    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}
