public class Surat07 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin; // S = Sakit, I = Izin
    int durasi;

    public Surat07() {}

    public Surat07(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampil() {
        System.out.println(idSurat + " | " + namaMahasiswa + " | " + kelas + " | " + jenisIzin + " | " + durasi + " hari");
    }
}
