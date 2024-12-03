import java.util.Scanner;
public class HargaAirPAM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int air, harga = 0;

        System.out.print("Jumlah air PAM yang digunakan (meter kubik): ");
        air = sc.nextInt();

        if (air > 50) {
            harga += 50 * 1000;
            air -= 50;
        } else {
            harga += air * 1000;
            System.out.printf("Harga yang harus dibayar adalah Rp%d", harga);
            return;
        }

        if (air > 50) {
            harga += 50 * 1500;
            air -= 50;
        } else {
            harga += air * 1500;
            System.out.printf("Harga yang harus dibayar adalah Rp%d", harga);
            return;
        }

        if (air > 50) {
            harga += 50 * 2000;
            air -= 50;
        } else {
            harga += air * 2000;
            System.out.printf("Harga yang harus dibayar adalah Rp%d", harga);
            return;
        }

        harga += air * 3000;
        System.out.printf("Harga yang harus dibayar adalah Rp%d", harga);       
    }
}