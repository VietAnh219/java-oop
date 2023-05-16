import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> arrNumber = new LinkedList<>();
        int n, number, value;
        int increase = 0, sum = 0;

        System.out.println("Nhap vao so phan tu cua mang");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap gia tri cua mang: ");
            number = sc.nextInt();
            arrNumber.add(number);

            if (arrNumber.get(i) % 2 == 0) {
                increase++;
                sum += arrNumber.get(i);
            }
        }
        value = sum / increase;
        System.out.printf("Trung binh cong cac so chan la: %d", value);
    }
}
