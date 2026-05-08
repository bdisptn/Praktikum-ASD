package Pertemuan12.TugasPert12;


public class QueueLinkedList {
    NodeMhs head;
    NodeMhs tail;
    int size;
    int kapasitas = 10;

    public QueueLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return size >= kapasitas;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambah data.");
            return;
        }
        NodeMhs nodeBaru = new NodeMhs(mhs, null);
        if (isEmpty()) {
            head = nodeBaru;
            tail = nodeBaru;
        } else {
            tail.next = nodeBaru;
            tail      = nodeBaru;
        }
        size++;
        System.out.println("[" + mhs.nama + "] berhasil masuk antrian. " +
                           "Posisi: " + size);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada yang dipanggil.");
            return;
        }
        System.out.println("Memanggil mahasiswa terdepan:");
        head.data.tampilInfo();
        head = head.next;
        if (head == null) tail = null;
        size--;
        System.out.println("Mahasiswa selesai dilayani. Sisa antrian: " + size);
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Antrian TERDEPAN:");
        head.data.tampilInfo();
    }

    public void lihatTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Antrian PALING AKHIR:");
        tail.data.tampilInfo();
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa mengantri: " + size + " orang");
    }

    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("  (Antrian kosong)");
            return;
        }
        NodeMhs temp = head;
        int  urut = 1;
        while (temp != null) {
            System.out.println("  [" + urut + "] " + temp.data.nama +
                               " | NIM: " + temp.data.nim +
                               " | Keperluan: " + temp.data.keperluan);
            temp = temp.next;
            urut++;
        }
    }
}
