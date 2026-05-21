package CM2;

public class DLLPembeli {

    Pembeli head;
    Pembeli tail;

    int nomor = 1;

    public boolean isEmpty() {
        return head == null;
    }

    // TAMBAH ANTRIAN
    public void tambahAntrian(String nama, String hp) {

        Pembeli baru = new Pembeli(nomor++, nama, hp);

        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }

        System.out.println(
                "Antrian berhasil ditambahkan dengan nomor: "
                + baru.noAntrian);
    }

    // CETAK ANTRIAN
    public void cetakAntrian() {

        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        Pembeli current = head;

        System.out.println("=================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("=================================");
        System.out.printf("%-12s %-15s %-15s\n",
                "No Antrian",
                "Nama",
                "No HP");

        while (current != null) {

            System.out.printf("%-12d %-15s %-15s\n",
                    current.noAntrian,
                    current.namaPembeli,
                    current.noHp);

            current = current.next;
        }
    }

    // HAPUS ANTRIAN
    public Pembeli hapusAntrian() {

        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }

        Pembeli data = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return data;
    }
}