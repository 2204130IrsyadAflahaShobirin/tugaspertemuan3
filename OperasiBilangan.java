import java.util.Scanner;

public class OperasiBilangan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca inputan 
        System.out.print("Masukkan bilangan pertama: ");
        double bil1 = scanner.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        double bil2 = scanner.nextDouble();
        System.out.print("Masukkan bilangan ketiga: ");
        double bil3 = scanner.nextDouble();

        // Menghitung hasil operasi penjumlahan
        double hasilJumlah = bil1 + bil2 + bil3;

        // Menghitung hasil operasi pengurangan
        double hasilKurang = bil1 - bil2 - bil3;

        // Menghitung hasil operasi perkalian
        double hasilKali = bil1 * bil2 * bil3;

        // Menghitung hasil operasi pembagian
        double hasilBagi = bil1 / bil2 / bil3;

        // Menampilkan hasil operasi
        System.out.println("Hasil penjumlahan: " + hasilJumlah);
        System.out.println("Hasil pengurangan: " + hasilKurang);
        System.out.println("Hasil perkalian: " + hasilKali);
        System.out.println("Hasil pembagian: " + hasilBagi);
    }
}
