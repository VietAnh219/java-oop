import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao 1 so: ");
        number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Hom nay la thu 2");
                break;
            case 2:
                System.out.println("Hom nay la thu 3");
                break;
            case 3:
                System.out.println("Hom nay la thu 4");
                break;
            case 4:
                System.out.println("Hom nay la thu 5");
                break;
            case 5:
                System.out.println("Hom nay la thu 6");
                break;
            case 6:
                System.out.println("Hom nay la thu 7");
                break;
            case 7:
                System.out.println("Hom nay la CN");
                break;
            default:
                System.out.println("Vui long nhap lai");
                break;
        }

    }
}
