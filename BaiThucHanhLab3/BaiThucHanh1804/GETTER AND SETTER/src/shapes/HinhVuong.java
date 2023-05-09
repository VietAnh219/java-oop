package shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    Scanner scanner = new Scanner(System.in);

    HinhChuNhat cdai = new HinhChuNhat();
    float dai = cdai.getChieuDai();

    public HinhVuong() {
        ten = "Hinh Vuong";
    }

    public void nhapCanh() {
        System.out.println("Canh = ");
    }

    public float getChieuDai() {
        return dai;
    }

    public void setChieuDai(float dai) {
        this.dai = dai;
    }

    public float getChuVi() {
        return chuVi;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void tinhChuVi() {
        chuVi = dai * 4;
    }

    public void tinhDienTich() {
        dienTich = dai * dai;
    }
}
