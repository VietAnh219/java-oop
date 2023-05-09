package shapes;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    private float dai;
    private float rong;
    Scanner scanner = new Scanner(System.in);

    public HinhChuNhat() {
        ten = "Hinh Chu Nhat";
    };

    public void nhapChieuDai() {
        System.out.println("Chieu dai = ");
    }

    public float getChieuDai() {
        return dai;
    }

    public void setChieuDai(float dai) {
        this.dai = dai;
    }

    public void nhapChieuRong() {
        System.out.println("Chieu rong = ");
    }

    public float getChieuRong() {
        return rong;
    }

    public void setChieuRong(float rong) {
        this.rong = rong;
    }

    public float getChuVi() {
        return chuVi;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void tinhChuVi() {
        chuVi = 2 * (dai + rong);
    }

    public void tinhDienTich() {
        dienTich = dai * rong;
    }
}
