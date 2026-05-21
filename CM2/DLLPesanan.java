package CM2;

public class DLLPesanan {

    Pesanan head;
    Pesanan tail;

    public boolean isEmpty() {
        return head == null;
    }

    // TAMBAH PESANAN
    public void tambahPesanan(int kode,
                              String namaPesanan,
                              int harga) {

        Pesanan baru =
                new Pesanan(kode, namaPesanan, harga);

        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
    }

    // SORTING BERDASARKAN NAMA PESANAN
    public void sortingPesanan() {

        if (isEmpty()) {
            return;
        }

        boolean tukar;

        do {

            tukar = false;

            Pesanan current = head;

            while (current.next != null) {

                if (current.namaPesanan.compareToIgnoreCase(
                        current.next.namaPesanan) > 0) {

                    int tempKode = current.kodePesanan;
                    String tempNama = current.namaPesanan;
                    int tempHarga = current.harga;

                    current.kodePesanan =
                            current.next.kodePesanan;

                    current.namaPesanan =
                            current.next.namaPesanan;

                    current.harga =
                            current.next.harga;

                    current.next.kodePesanan = tempKode;
                    current.next.namaPesanan = tempNama;
                    current.next.harga = tempHarga;

                    tukar = true;
                }

                current = current.next;
            }

        } while (tukar);
    }

    // LAPORAN PESANAN
    public void tampilPesanan() {

        if (isEmpty()) {
            System.out.println("Belum ada pesanan!");
            return;
        }

        sortingPesanan();

        Pesanan current = head;

        System.out.println(
                "==========================================");

        System.out.println(
                "LAPORAN PESANAN (URUT NAMA PESANAN)");

        System.out.println(
                "==========================================");

        System.out.printf("%-15s %-20s %-10s\n",
                "Kode Pesanan",
                "Nama Pesanan",
                "Harga");

        while (current != null) {

            System.out.printf("%-15d %-20s %-10d\n",
                    current.kodePesanan,
                    current.namaPesanan,
                    current.harga);

            current = current.next;
        }
    }
}