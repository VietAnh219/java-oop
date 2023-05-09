package main;

import java.util.Scanner;

import shapes.HinhChuNhat;
import shapes.HinhTron;
import shapes.HinhTru;
import shapes.HinhVuong;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name;
        float banKinh, chieuCao, dai, rong;

        System.out.println("Nhap hinh can su dung: ");
        name = scanner.nextLine();

        switch (name) {
            case "HinhTron":
                HinhTron hinhTron = new HinhTron();
                hinhTron.Ten();
                hinhTron.nhapBanKinh();
                banKinh = scanner.nextFloat();
                hinhTron.setBanKinh(banKinh);
                hinhTron.tinhChuVi();
                hinhTron.getChuVi();
                hinhTron.inChuVi();
                hinhTron.tinhDienTich();
                hinhTron.getDienTich();
                hinhTron.inDienTich();
                break;
            case "HinhTru":
                HinhTru hinhTru = new HinhTru();
                hinhTru.Ten();
                hinhTru.nhapBanKinh();
                banKinh = scanner.nextFloat();
                hinhTru.setBanKinh(banKinh);
                hinhTru.nhapChieuCao();
                chieuCao = scanner.nextFloat();
                hinhTru.setChieuCao(chieuCao);
                hinhTru.tinhTheTich();
                hinhTru.getTheTich();
                hinhTru.inTheTich();
                break;
            case "HinhChuNhat":
                HinhChuNhat hinhChuNhat = new HinhChuNhat();
                hinhChuNhat.Ten();
                hinhChuNhat.nhapChieuDai();
                dai = scanner.nextFloat();
                hinhChuNhat.setChieuDai(dai);
                hinhChuNhat.nhapChieuRong();
                rong = scanner.nextFloat();
                hinhChuNhat.setChieuRong(rong);
                hinhChuNhat.tinhChuVi();
                hinhChuNhat.getChuVi();
                hinhChuNhat.inChuVi();
                hinhChuNhat.tinhDienTich();
                hinhChuNhat.getDienTich();
                hinhChuNhat.inDienTich();
                break;
            case "HinhVuong":
                HinhVuong hinhVuong = new HinhVuong();
                hinhVuong.Ten();
                hinhVuong.nhapCanh();
                dai = rong = scanner.nextFloat();
                hinhVuong.setChieuDai(dai);
                hinhVuong.tinhChuVi();
                hinhVuong.getChuVi();
                hinhVuong.inChuVi();
                hinhVuong.tinhDienTich();
                hinhVuong.getDienTich();
                hinhVuong.inDienTich();
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
