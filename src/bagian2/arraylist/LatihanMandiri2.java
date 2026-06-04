package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri2 {
    public static void main(String[] args) {

 
        // SOAL 1: ArrayList Daftar Belanja (Tambah, Hapus, & Tampilkan Jumlah)
        System.out.println("=== SOAL 1: DAFTAR BELANJA ===");
        
        // Membuat ArrayList untuk menampung String
        ArrayList<String> daftarBelanja = new ArrayList<>();
        
        // Menambah 4 item belanja
        daftarBelanja.add("Minyak Goreng"); // Index 0
        daftarBelanja.add("Beras");         // Index 1 (Item ke-2)
        daftarBelanja.add("Telur");         // Index 2
        daftarBelanja.add("Gula Pasir");    // Index 3
        
        System.out.println("Sebelum dihapus : " + daftarBelanja);
        
        // Menghapus item ke-2 (Beras ada di indeks 1, karena indeks dimulai dari 0)
        daftarBelanja.remove(1);
        
        // Tampilkan isi list dan jumlah akhirnya
        System.out.println("Isi list akhir  : " + daftarBelanja);
        System.out.println("Jumlah akhir    : " + daftarBelanja.size() + " item");
        System.out.println(); // Baris baru untuk jarak



        // SOAL 2: ArrayList Integer - Mencari Nilai Terbesar
        System.out.println("=== SOAL 2: MENCARI NILAI TERBESAR ===");
        
        // Membuat ArrayList untuk menampung Integer
        ArrayList<Integer> angka = new ArrayList<>();
        
        // Mengisi dengan 5 angka
        angka.add(23);
        angka.add(87);
        angka.add(45);
        angka.add(92);
        angka.add(12);
        
        System.out.println("Daftar angka    : " + angka);
        
        // Inisialisasi nilai terbesar dengan elemen pertama (indeks 0)
        int nilaiTerbesar = angka.get(0);
        
        // Menelusuri seluruh elemen menggunakan loop untuk mencari yang terbesar
        for (int i = 1; i < angka.size(); i++) {
            if (angka.get(i) > nilaiTerbesar) {
                nilaiTerbesar = angka.get(i); // Update nilai terbesar jika ditemukan yang lebih besar
            }
        }
        
        System.out.println("Nilai terbesar  : " + nilaiTerbesar);
        System.out.println(); // Baris baru untuk jarak


       
        // SOAL 3: ArrayList Nama - Cetak Nama yang Diawali Huruf 'A'
        System.out.println("=== SOAL 3: FILTER NAMA (AWALAN 'A') ===");
        
        // Membuat ArrayList untuk menampung nama
        ArrayList<String> daftarNama = new ArrayList<>();
        
        // Menambah 6 nama ke dalam ArrayList
        daftarNama.add("Andi");
        daftarNama.add("Budi");
        daftarNama.add("Anisa");
        daftarNama.add("Citra");
        daftarNama.add("Ahmad");
        daftarNama.add("Dedi");
        
        System.out.println("Semua nama : " + daftarNama);
        System.out.println("Nama yang diawali huruf 'A':");
        
        // Menelusuri elemen dan memfilter menggunakan method .startsWith()
        for (String nama : daftarNama) {
            if (nama.startsWith("A")) {
                System.out.println("- " + nama);
            }
        }
    }
}

