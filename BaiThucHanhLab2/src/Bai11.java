import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Bai11 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Nhap vao so phan tu cua mang");
        n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap vao thu tu %d cua mang ", i);
            arr[i] = scanner.nextInt();
        }

        System.out.println("Mang sau khi da sap xep ");

        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }

}
