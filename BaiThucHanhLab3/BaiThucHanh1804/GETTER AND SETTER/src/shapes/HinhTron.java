package shapes;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    private float banKinh;
    Scanner scanner = new Scanner(System.in);

    HinhHoc pi = new HinhHoc();
    float PI = pi.getPI();

    public HinhTron() {
        ten = "Hinh Tron";
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    };

    public float getChuVi() {
        return chuVi;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void nhapBanKinh() {
        System.out.println("Ban kinh = ");
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }
}
