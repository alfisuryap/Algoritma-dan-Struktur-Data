package Jobsheet_6.Source_Code.Tugas;

import java.util.Scanner;

public class Tugas3Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Nilai Array : ");
        int jml = input.nextInt();
        Tugas3Search liq = new Tugas3Search(jml);
        System.out.println("---------------------------------");
        System.out.println("");
        System.out.println("== INPUT NILAI ==");
        for (int i = 0; i < jml; i++) {
            System.out.print("Nilai ke-" + i +" : ");
            int nilai = input.nextInt();
            Tugas3 t = new Tugas3(nilai);
            liq.tambah(t);
        }
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println(" == DATA NILAI KESELURUHAN ==");
        System.out.println("------------------------------");
        System.out.println("");
        liq.selectionSort();
        liq.tampil();
        System.out.println("\n == PENCARIAN DATA ==");
        System.out.print("Masukkan nilai yang dicari: ");
        int cari = input.nextInt();
        System.out.println("");
        System.out.println("BINARY SEARCH");
        int index = liq.BinarySearch(cari, 0, jml - 1);
        if (index == -1){
            System.out.println("Data tidak ditemukan");
        }
    }
}
