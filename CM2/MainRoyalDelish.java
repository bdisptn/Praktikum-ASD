package CM2;

import java.util.Scanner;

public class MainRoyalDelish {

    public static void menu() {

        System.out.println("=================================");
        System.out.println("SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("=================================");

        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Pesan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("0. Keluar");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DLLPembeli antrian = new DLLPembeli();
        DLLPesanan pesanan = new DLLPesanan();

        int pilih;

        do {

            menu();

            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            System.out.println();

            switch (pilih) {

                // TAMBAH ANTRIAN
                case 1:

                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();

                    antrian.tambahAntrian(nama, hp);

                    break;

                // CETAK ANTRIAN
                case 2:

                    antrian.cetakAntrian();

                    break;

                // HAPUS ANTRIAN DAN PESAN
                case 3:

                    Pembeli dipanggil =
                            antrian.hapusAntrian();

                    if (dipanggil != null) {

                        System.out.print(
                                "Kode Pesanan : ");

                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print(
                                "Nama Pesanan : ");

                        String namaPesanan =
                                sc.nextLine();

                        System.out.print(
                                "Harga        : ");

                        int harga = sc.nextInt();
                        sc.nextLine();

                        pesanan.tambahPesanan(
                                kode,
                                namaPesanan,
                                harga
                        );

                        System.out.println(
                                dipanggil.namaPembeli
                                + " telah memesan "
                                + namaPesanan);
                    }

                    break;

                // LAPORAN PESANAN
                case 4:

                    pesanan.tampilPesanan();

                    break;

                // KELUAR
                case 0:

                    System.out.println(
                            "Program selesai!");

                    break;

                default:

                    System.out.println(
                            "Menu tidak tersedia!");
            }

            System.out.println();

        } while (pilih != 0);

        sc.close();
    }
}