import java.util.Scanner;
public class UrutAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Bilangan 1: ");
        a = sc.nextInt();
        System.out.print("Bilangan 2: ");
        b = sc.nextInt();
        System.out.print("Bilangan 3: ");
        c = sc.nextInt();

        if (a >= b) {
            if (a >= c) {
                if (b >= c) {
                    System.out.printf("Urutan (Ascending): %d, %d, %d", c, b, a);
                } else {
                    System.out.printf("Urutan (Ascending): %d, %d, %d", b, c, a);
                }
            } else {
                System.out.printf("Urutan (Ascending): %d, %d, %d", b, a, c);
            }
        } else if (b >= a) {
            if (b >= c) {
                if (a >= c) {
                    System.out.printf("Urutan (Ascending): %d, %d, %d", c, a, b);
                } else {
                    System.out.printf("Urutan (Ascending): %d, %d, %d", a, c, b);
                }
            } else {
                System.out.printf("Urutan (Ascending): %d, %d, %d", a, b, c);
            }
        }  
    }
}