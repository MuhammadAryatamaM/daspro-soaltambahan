import java.util.Scanner;
public class KonversiCtoF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.print("Suhu dalam Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("Suhu dalam Fahrenheit: %f", fahrenheit); 
    }
}