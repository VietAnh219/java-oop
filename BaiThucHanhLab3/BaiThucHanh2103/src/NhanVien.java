import java.util.Scanner;

public class NhanVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hoten;
        int namsinh;
        int hesoluong;
        final int luongcoban = 1490000;
        System.out.print("nhap ho ten:");
        hoten = scanner.nextLine();
        System.out.print("nhap nam sinh:");
        namsinh = scanner.nextInt();
        System.out.print("nhap he so luong:");
        hesoluong = scanner.nextInt();
        int luong = hesoluong * luongcoban;
        System.out.print("luong la:" + luong);
    }
}
