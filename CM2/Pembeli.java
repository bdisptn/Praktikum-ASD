package CM2;

public class Pembeli {

    int noAntrian;
    String namaPembeli;
    String noHp;

    Pembeli prev;
    Pembeli next;

    public Pembeli(int noAntrian, String namaPembeli, String noHp) {
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }
}