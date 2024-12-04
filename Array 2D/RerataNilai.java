import java.util.Scanner;
public class RerataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[3][5];
        double[] rerata = new double[3];
        
        System.out.println("===== INPUT NILAI =====");
        for (int i = 0; i < 3; i++) {
            double avg = 0;
            for (int j = 0; j < 5; j++) {
                System.out.printf("Mahasiswa ke-%d, nilai ke-%d: ", (i+1), (j+1));
                nilai[i][j] = sc.nextInt();
                avg += nilai[i][j];
            }
            rerata[i] = (avg/5);
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("Rata-rata mahasiswa ke-%d adalah %f\n", (i+1), rerata[i]);
        }
    }
}