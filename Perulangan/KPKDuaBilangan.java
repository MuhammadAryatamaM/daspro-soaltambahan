import java.util.Scanner;
public class KPKDuaBilangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, kpk = 1;

        System.out.print("Bilangan 1: ");
        x = sc.nextInt();
        System.out.print("Bilangan 2: ");
        y = sc.nextInt();

        while (true) {
            int i = 2;
            while (true) {
                if (x % i == 0 && y % i == 0) {
                    x /= i;
                    y /= i;
                    kpk *= i;
                    break;
                } else if (x % i == 0) {
                    x /= i;
                    kpk *= i;
                    break;
                } else if (y % i == 0) {
                    y /= i;
                    kpk *= i;
                    break;
                }
                i++;
            }
            if (x == 1 && y == 1) {
                break;
            }
        }
        System.out.printf("KPK-nya adalah: %d", kpk);
    }
}