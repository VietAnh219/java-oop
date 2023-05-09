import java.util.ArrayList;

public class Slide17 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrListInt = new ArrayList<>();

        arrListInt.add(1);
        arrListInt.add(2);
        arrListInt.add(3);
        arrListInt.add(4);

        System.out.println("Cac phan tu co trong arrListInt la: ");

        for (int number : arrListInt) {
            System.out.print(number + "\t");
        }

    }
}
