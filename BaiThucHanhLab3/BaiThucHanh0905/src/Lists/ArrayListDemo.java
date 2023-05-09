package Lists;

import java.util.ArrayList;
import java.util.Scanner;

import Models.Students;

public class ArrayListDemo {
    public static void main(String[] args) throws Exception {
        ArrayList<Students> stdLists = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Students std = new Students();

        System.out.print("Nhap vao so hoc sinh: ");
        int n = sc.nextInt();

        // Them thong tin
        std.Add(stdLists, n);

        // Hien thi du lieu
        std.HienThi(stdLists);

        // Sua Thong Tin
        std.SuaThongTin(stdLists);

        // Xoa Thong Tin
        std.XoaThongTin(stdLists);

    }
}
