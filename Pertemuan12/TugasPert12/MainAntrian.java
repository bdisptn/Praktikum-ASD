package Pertemuan12.TugasPert12;

import java.util.Scanner;

public class MainAntrian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList antrian = new QueueLinkedList();
        
        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian Mahasiswa ===");
            System.out.println("1. Tambah Antrian (Enqueue)");
            System.out.println("2. Panggil Antrian Terdepan (Dequeue)");
            System.out.println("3. Lihat Antrian Terdepan (Peek Front)");
            System.out.println("4. Lihat Antrian Terakhir (Peek Rear)");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Tampilkan Seluruh Antrian");
            System.out.println("7. Cek Antrian Kosong/Penuh");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Keperluan: ");
                    String keperluan = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, keperluan);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.lihatTerakhir();
                    break;
                case 5:
                    antrian.jumlahAntrian();
                    break;
                case 6:
                    antrian.tampilAntrian();
                    break;
                case 7:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else if (antrian.isFull()) {
                        System.out.println("Antrian penuh.");
                    } else {
                        System.out.println("Antrian tidak kosong dan tidak penuh.");
                    }
                    break;
                case 8:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}   
