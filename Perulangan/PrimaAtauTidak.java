import java.util.Scanner;
public class PrimaAtauTidak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int angka = sc.nextInt();

        if (angka == 2 || angka == 1) {
            System.out.println("Bilangan prima");
            return;
        }

        for (int i = angka - 1; i != 2; i--) {
            if (angka % i == 0) {
                System.out.println("Bukan bilangan prima");
                return;
            }  else {
                continue;
            }
        }
        System.out.println("Bilangan prima");
    }
}