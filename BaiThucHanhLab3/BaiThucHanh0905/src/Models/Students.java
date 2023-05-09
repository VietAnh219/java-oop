package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    Scanner sc = new Scanner(System.in);
    public String FullName;
    public int Age;

    // Nhap thong tin
    public void NhapThongTin() {
        System.out.print("Nhap ten: ");
        FullName = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        Age = sc.nextInt();
    }

    // Hien thi thong tin
    public void HienThi(List<Students> stdList) {
        for (int i = 0; i < stdList.size(); i++) {
            System.out.println(stdList.get(i).FullName);
            System.out.println(stdList.get(i).Age);
        }
    }

    // Sua thong tin
    public void SuaThongTin(List<Students> stdList) {
        System.out.println("Nhap stt muon chinh sua");
        int stt = sc.nextInt();
        Students std = new Students();
        for (int i = 0; i < stdList.size(); i++) {
            if (i + 1 == stt) {
                std.NhapThongTin();
                stdList.set(i, std);
                std.HienThi(stdList);
            }
        }
    }

    // Xoa thong tin
    public void XoaThongTin(List<Students> stdList) {
        System.out.println("Nhap stt muon chinh xoa");
        int stt = sc.nextInt();
        Students std = new Students();
        for (int i = 0; i < stdList.size(); i++) {
            if (i + 1 == stt) {
                std.NhapThongTin();
                stdList.remove(i);
                std.HienThi(stdList);
            }
        }
    }

    // Add
    public void Add(List<Students> stdList, int n) {
        for (int i = 0; i < n; i++) {
            Students std = new Students();
            std.NhapThongTin();
            stdList.add(std);
        }
    }
}
