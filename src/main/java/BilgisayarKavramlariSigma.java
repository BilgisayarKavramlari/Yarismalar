import java.util.Scanner;

/**
 * Created by ramazan on 4.08.2017.
 */
public class BilgisayarKavramlariSigma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("yaricap giriniz: ");
        int r = scanner.nextInt();
        int sonuc = 0;
        for (int x = -r; x <= r; x++) {
            for (int y = -r; y <= r; y++) {
                boolean sifirMi = isZero(sonuc, x, y, r);
                if (sifirMi) {
                    System.out.print("*");
                }else if (x == 0 && y == 0) {
                    System.out.print("Σ ");
                }
                else if (!sifirMi) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    private static boolean isZero(int sonuc, int x, int y, int r) {
        sonuc = x * x + y * y - r * r;
        return sonuc == 0;
    }
}
