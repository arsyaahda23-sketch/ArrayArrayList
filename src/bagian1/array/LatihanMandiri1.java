package bagian1.array;

public class LatihanMandiri1 {
    public static void main(String[] args) {

        // =========================================================================
        // SOAL 1: Array Suhu Harian (Double) - Mencari Tertinggi & Terendah
        // =========================================================================
        System.out.println("=== SOAL 1: SUHU HARIAN ===");
        
        // Membuat array berisi 6 suhu harian
        double[] suhuHarian = {31.5, 28.2, 34.0, 27.5, 30.8, 29.4};

        // Inisialisasi nilai tertinggi dan terendah dengan elemen pertama array
        double suhuTertinggi = suhuHarian[0];
        double suhuTerendah = suhuHarian[0];

        // Melakukan perulangan untuk mencari nilai tertinggi dan terendah
        for (int i = 1; i < suhuHarian.length; i++) {
            if (suhuHarian[i] > suhuTertinggi) {
                suhuTertinggi = suhuHarian[i];
            }
            if (suhuHarian[i] < suhuTerendah) {
                suhuTerendah = suhuHarian[i];
            }
        }

        // Menampilkan hasil Soal 1
        System.out.println("Suhu Tertinggi : " + suhuTertinggi + "°C");
        System.out.println("Suhu Terendah  : " + suhuTerendah + "°C");
        System.out.println(); // Baris baru untuk jarak


        // =========================================================================
        // SOAL 2: Array String Nama Hari - Cetak yang > 5 Huruf
        // =========================================================================
        System.out.println("=== SOAL 2: NAMA HARI (> 5 HURUF) ===");
        
        // Membuat array String berisi 5 nama hari
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        // Menampilkan hari yang memiliki lebih dari 5 huruf
        System.out.println("Hari dengan lebih dari 5 huruf:");
        for (int i = 0; i < namaHari.length; i++) {
            if (namaHari[i].length() > 5) {
                System.out.println("- " + namaHari[i] + " (" + namaHari[i].length() + " huruf)");
            }
        }
        System.out.println(); // Baris baru untuk jarak


        // =========================================================================
        // SOAL 3: Hitung Banyak Angka Genap
        // =========================================================================
        System.out.println("=== SOAL 3: HITUNG ANGKA GENAP ===");
        
        // Array angka yang diberikan
        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlahGenap = 0;

        // Melakukan perulangan dan mengecek kondisi genap (habis dibagi 2)
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] % 2 == 0) {
                jumlahGenap++; // Tambah 1 ke counter jika angka genap
            }
        }

        // Menampilkan hasil Soal 3
        System.out.println("Banyaknya angka genap di dalam array: " + jumlahGenap);
    }
}
