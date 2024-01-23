import java.util.Scanner;

public class NullPointerExceptionContoh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan string: ");
            String str = scanner.nextLine();
            int panjang = str.length(); // Mencoba mengakses panjang string
            System.out.println("Panjang: " + panjang);
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception");
        } finally {
            scanner.close();
        }
    }
}
