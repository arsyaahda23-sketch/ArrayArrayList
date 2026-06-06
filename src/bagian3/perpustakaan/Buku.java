package bagian3.perpustakaan;

public class Buku {
    // Atribut
    private String judul;
    private String penulis;
    private boolean dipinjam;
    private int tahunTerbit; // <-- Atribut Baru

    // Constructor Diperbarui
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit; // <-- Inisialisasi Atribut Baru
        this.dipinjam = false; 
    }

    // Getters
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public int getTahunTerbit() { // <-- Getter Baru
        return tahunTerbit;
    }

    // Setter
    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    // Method info() Diperbarui untuk menampilkan tahun terbit
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " oleh " + penulis + " (" + tahunTerbit + ") [" + status + "]";
    }
}