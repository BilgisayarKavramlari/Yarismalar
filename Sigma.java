/*
Satır atlama ve boşluk bırakma karakterleri aynı büyüklikte varsayarak kodladım.

Algoritma:
  Satırlarda gezerken belirlenen yarıçapa, belirli bir treshold dan düşük yakınlıkta olan karelere yıldız koyulur.
  1 satır 1 birim,
  1 boşluk 1 birim,
  Treshold = 0.5 alınmıştır.
  Treshold = gerçek uzaklık ile yarıçap arasındaki fark.  
*/

package sigma;

import java.util.Scanner;

public class Sigma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("radius : ");
        int radius = scanner.nextInt();
        int en = radius;
        int boy = radius;
        double distance = Math.sqrt(en * boy);

        for (int i = 0; i < radius; i++) {
            //
            for (int j = 0; j < radius; j++) {
                if (checkStar(radius, getDistance(en, boy))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                en--;
            }

            if (checkStar(radius, getDistance(en, boy))) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            en++;

            for (int j = 0; j < radius; j++) {
                if (checkStar(radius, getDistance(en, boy))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                en++;
            }

            en = radius;
            boy--;
            System.out.println("");
        }

        System.out.print("*");
        for (int i = 0; i < radius - 1; i++) {
            System.out.print(" ");
        }
        System.out.print("Σ");
        for (int i = 0; i < radius - 1; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println("");

        for (int i = 0; i < radius; i++) {
            boy++;
            for (int j = 0; j < radius; j++) {
                if (checkStar(radius, getDistance(en, boy))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                en--;
            }

            if (checkStar(radius, getDistance(en, boy))) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            en++;

            for (int j = 0; j < radius; j++) {
                if (checkStar(radius, getDistance(en, boy))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                en++;
            }

            en = radius;
            
            System.out.println("");
        }
    }

    static double getDistance(int en, int boy) {
        return Math.sqrt((en * en) + (boy * boy));
    }

    static boolean checkStar(int radius, double distance) {
        return Math.abs((double) distance - radius) < 0.5;
    }
}
