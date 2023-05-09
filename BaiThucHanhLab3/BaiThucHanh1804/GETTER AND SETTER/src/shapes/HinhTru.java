package shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    private float chieuCao;
    Scanner scanner = new Scanner(System.in);

    public HinhTru() {
        ten = "Hinh Tru";
    }

    public float getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(float chieuCao) {
        this.chieuCao = chieuCao;
    };

    public float getTheTich() {
        return theTich;
    }

    public void nhapChieuCao() {
        System.out.println("Chieu cao = ");
    }

    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}
