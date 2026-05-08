package Pertemuan12;

import java.util.Scanner;

public class SLLMain07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList07 sll = new SingleLinkedList07();
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        Mahasiswa07[] mhs = new Mahasiswa07[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.next();
            System.out.print("Nama: ");
            String nama = sc.next();
            System.out.print("Kelas: ");
            String kelas = sc.next();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();

            mhs[i] = new Mahasiswa07(nim, nama, kelas, ipk);
        }

        sll.print();
        sll.addFirst(mhs[n-1]);
        sll.print();
        sll.addLast(mhs[0]);
        sll.print();
        sll.insertAfter(mhs[n-1].nama, mhs[2]);
        sll.insertAt(2, mhs[1]);
        sll.print();

        sc.close();
    }
}
