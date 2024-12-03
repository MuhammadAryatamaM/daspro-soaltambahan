public class TampilElemenTangga {
    public static void main(String[] args) {
        
        int baris = 5, kolom = 4;
        char huruf = 'A';

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (5 - kolom); j++) {
                System.out.print(huruf);
                huruf++;
            }
            kolom--;
            System.out.println();
        }
    }
}