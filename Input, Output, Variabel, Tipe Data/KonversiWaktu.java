import java.util.Scanner;
public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int detikA, jamB, menitB, detikB;

        System.out.print("Waktu dalam detik: ");
        detikA = sc.nextInt();
        
        jamB = detikA / 3600;
        menitB = (detikA - (jamB * 3600)) / 60;
        detikB = detikA - (menitB * 60) - (jamB * 3600);
        
        System.out.printf("Waktu (Jam : Menit : Detik) = %d : %d : %d", jamB, menitB, detikB);
    }
}