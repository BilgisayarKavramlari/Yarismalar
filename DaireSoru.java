import java.util.Scanner;

public class DaireSoru
{
    public static void main(String[] args) 
    {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Yarıçap giriniz = ");
        int yariCap = girdi.nextInt();

        for (int b = -yariCap; b <= yariCap; b++) {
            for (int c = -yariCap; c <= yariCap; c++) 
            {
                if (c == 0 && b == 0) {
                    
                    System.out.print("Σ ");
                }
                else if (b * b + c * c <= yariCap * yariCap) 
                {
                    System.out.print("* ");
                }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
