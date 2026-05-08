package Pertemuan12;

public class Mahasiswa07 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa07(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;

    }

    public void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }

}

