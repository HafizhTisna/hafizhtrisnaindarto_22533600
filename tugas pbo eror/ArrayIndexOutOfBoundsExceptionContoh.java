import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionContoh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int[] angka = {1, 2, 3};

            System.out.print("Masukkan indeks yang ingin diakses: ");
            int indeks = scanner.nextInt();

            int nilai = angka[indeks]; // Mencoba mengakses indeks yang mungkin di luar batas
            System.out.println("Nilai: " + nilai);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Indeks array di luar batas");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Input tidak valid");
        } finally {
            scanner.close();
        }
    }
}
