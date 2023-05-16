import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n, number;
        ArrayList<Integer> arrNumber = new ArrayList<>();

        System.out.println("Nhap so gia tri cua mang");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cua mang: ");
            number = sc.nextInt();
            arrNumber.add(number);
        }

        // In ra man hinh va sap xep
        for (int i = 0; i < arrNumber.size(); i++) {
            arrNumber.sort((a, b) -> b - a);
            System.out.println(arrNumber.get(i));
        }

        // Xoa phan tu khoi mang
        System.out.print("So can xoa la: ");
        int deleteNumber = sc.nextInt();
        for (int i = 0; i < arrNumber.size(); i++) {
            if (deleteNumber == arrNumber.get(i)) {
                arrNumber.remove(i);
            }
            System.out.println(arrNumber.get(i));
        }

        System.out.print("Gia tri lon nhat cua mang la: ");
        System.out.print(arrNumber.get(0));
    }
}
