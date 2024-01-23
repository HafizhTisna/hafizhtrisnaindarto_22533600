import java.util.Scanner;

public class ArithmeticExceptionContoh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pertama: ");
            int angka1 = scanner.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int angka2 = scanner.nextInt();

            int hasil = angka1 / angka2;
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Error: Pembagian oleh nol atau input tidak valid");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Input tidak valid");
        } finally {
            scanner.close();
        }
    }
}
