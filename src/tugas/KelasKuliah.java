package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // ArrayList untuk menampung objek Mahasiswa
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // 1. Method menambahkan mahasiswa ke dalam list
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    // 2. Method untuk menghitung rata-rata nilai kelas
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0;
        }
        double total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // 3. Method untuk menghitung jumlah mahasiswa yang lulus
    public int jumlahLulus() {
        int hitung = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) {
                hitung++;
            }
        }
        return hitung;
    }

    // 4. Method untuk mendapatkan total jumlah data mahasiswa saat ini
    public int getJumlahMahasiswa() {
        return daftarMahasiswa.size();
    }

    // 5. Method untuk menampilkan seluruh data mahasiswa beserta statusnya
    public void tampilkanSemua() {
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-15s %-15s %-10s %-10s\n", "NPM", "Nama", "Nilai", "Status");
        System.out.println("-------------------------------------------------------");
        for (Mahasiswa mhs : daftarMahasiswa) {
            String status = mhs.lulus() ? "LULUS" : "TIDAK LULUS";
            System.out.printf("%-15s %-15s %-10.2f %-10s\n", 
                    mhs.getNpm(), mhs.getNama(), mhs.getNilai(), status);
        }
        System.out.println("-------------------------------------------------------");
    }
}
