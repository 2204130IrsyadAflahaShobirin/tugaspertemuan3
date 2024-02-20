public class Menikah {

    public static void main(String[] args) {
        // Menentukan nilai tabungan
        double tabungan = 150000000; 

        // Menentukan apakah memiliki calon pasangan
        boolean calonPasangan = true; 

        // Mengecek apakah kondisi menikah terpenuhi
        boolean menikah = (tabungan > 100000000) && calonPasangan;

        // Menampilkan hasil
        if (menikah) {
            System.out.println("Anda bisa menikah!");
        } else {
            System.out.println("Anda belum bisa menikah.");
        }
    }
}