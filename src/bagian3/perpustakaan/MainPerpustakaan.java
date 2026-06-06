package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        // 1. Membuat objek pengelola perpustakaan
        Perpustakaan perpus = new Perpustakaan();

        // 2. Membuat objek Buku lalu memasukkannya ke koleksi perpustakaan
        // 2. Membuat objek Buku lalu memasukkannya ke koleksi perpustakaan
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        // 3. Menampilkan seluruh koleksi awal beserta statusnya
        perpus.tampilkanKoleksi();
        System.out.println("Jumlah buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();

        // 4. Simulasi Peminjaman Buku
        System.out.println("== PROSES PEMINJAMAN ==");
        perpus.pinjamBuku("Bumi Manusia"); // Berhasil dipinjam
        perpus.pinjamBuku("Bumi Manusia"); // Coba pinjam kedua kali (Harus muncul pesan: sedang dipinjam)
        
        System.out.println();
        perpus.tampilkanKoleksi();
        System.out.println("Jumlah buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();

        // 5. UJI COBA METHOD BARU: Pengembalian Buku
        System.out.println("== PROSES PENGEMBALIAN (METHOD BARU) ==");
        
        // Skenario A: Mengembalikan buku yang memang sedang dipinjam
        perpus.kembalikanBuku("Bumi Manusia"); // Harus berhasil dikembalikan
        
        // Skenario B: Mengembalikan buku yang statusnya sudah tersedia / tidak dipinjam
        perpus.kembalikanBuku("Bumi Manusia"); // Harus muncul pesan: tidak sedang dipinjam
        
        // Skenario C: Mengembalikan buku dengan judul yang salah / tidak terdaftar
        perpus.kembalikanBuku("Harry Potter"); // Harus muncul pesan: tidak ditemukan

        System.out.println();
        
        // 6. Menampilkan koleksi akhir untuk memastikan status buku kembali "Tersedia"
        System.out.println("== KONDISI AKHIR KOLEKSI ==");
        perpus.tampilkanKoleksi();
        System.out.println("Jumlah buku tersedia: " + perpus.jumlahTersedia());
    }
}