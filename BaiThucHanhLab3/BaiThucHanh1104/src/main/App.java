package src.main;

import java.util.Scanner;

import src.shapes.HinhChuNhat;
import src.shapes.HinhTron;
import src.shapes.HinhTru;
import src.shapes.HinhVuong;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.println("Nhap hinh can su dung: ");
        name = scanner.nextLine();

        switch (name) {
            case "HinhTron":
                HinhTron hinhTron = new HinhTron();
                hinhTron.Ten();
                hinhTron.nhapBanKinh();
                hinhTron.tinhChuVi();
                hinhTron.inChuVi();
                hinhTron.tinhDienTich();
                hinhTron.inDienTich();
                break;
            case "HinhTru":
                HinhTru hinhTru = new HinhTru();
                hinhTru.Ten();
                hinhTru.nhapChieuCao();
                hinhTru.tinhTheTich();
                hinhTru.inTheTich();
                break;
            case "HinhChuNhat":
                HinhChuNhat hinhChuNhat = new HinhChuNhat();
                hinhChuNhat.Ten();
                hinhChuNhat.nhapChieuDai();
                hinhChuNhat.nhapChieuRong();
                hinhChuNhat.tinhChuVi();
                hinhChuNhat.inChuVi();
                hinhChuNhat.tinhDienTich();
                hinhChuNhat.inDienTich();
                break;
            case "HinhVuong":
                HinhVuong hinhVuong = new HinhVuong();
                hinhVuong.Ten();
                hinhVuong.nhapCanh();
                hinhVuong.tinhChuVi();
                hinhVuong.inChuVi();
                hinhVuong.tinhDienTich();
                hinhVuong.inDienTich();
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
