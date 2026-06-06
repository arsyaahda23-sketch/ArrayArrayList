// Nama: AHmad Arsya Zauri Ahda
// NPM: 2410010377
package tugas;


public class MainTugas {
    public static void main(String[] args) {
        
        // --- POIN 4: Menyimpan dan menampilkan daftar nama mata kuliah (Array String) ---
        String[] mataKuliah = {"Pemrograman Berorientasi Objek", "Struktur Data", "Basis Data"};
        
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        
        // --- POIN 3: Membuat objek KelasKuliah dan menambahkan minimal 5 Mahasiswa ---
        KelasKuliah kelas = new KelasKuliah();
        
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "2301001", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "2301002", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "2301003", 72.5));
        kelas.tambahMahasiswa(new Mahasiswa("Dewi", "2301004", 45.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eko", "2301005", 90.0));

        // Menampilkan data awal
        System.out.println("=== DATA AWAL MAHASISWA ===");
        kelas.tampilkanSemua();
        
        
        // --- POIN 5: Menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus ---
        System.out.println("=== ANALISIS NILAI KELAS ===");
        System.out.printf("Rata-rata Nilai Kelas : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus() + " Mahasiswa");
        System.out.println();

        
        // --- POIN 6: Menambahkan satu objek Mahasiswa baru & update jumlah data ---
        System.out.println("=== PENAMBAHAN DATA BARU ===");
        System.out.println("Jumlah data mahasiswa awal: " + kelas.getJumlahMahasiswa());
        
        // Menambahkan mahasiswa ke-6
        System.out.println("-> Menambahkan mahasiswa baru: Farhan (2301006) dengan nilai 65.0");
        kelas.tambahMahasiswa(new Mahasiswa("Farhan", "2301006", 65.0));
        
        // Menampilkan kembali jumlah data terbaru
        System.out.println("Jumlah data mahasiswa terbaru: " + kelas.getJumlahMahasiswa());
        System.out.println();
        
        // Menampilkan data akhir untuk memastikan data baru masuk
        System.out.println("=== DATA AKHIR MAHASISWA ===");
        kelas.tampilkanSemua();
    }
}

