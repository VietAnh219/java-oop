package shapes;

public class HinhHoc {
    private final float PI = 3.14f;

    public String ten;
    public float chuVi;
    public float dienTich;
    public float theTich;

    public final float getPI() {
        return PI;
    }

    public void Ten() {
        System.out.println("\n\n====" + ten + "====");
    }

    public void inChuVi() {
        System.out.println("Chu vi = " + chuVi);
    }

    public void inDienTich() {
        System.out.println("Dien tich = " + dienTich);
    }

    public void inTheTich() {
        System.out.println("The tich = " + theTich);
    }

}
