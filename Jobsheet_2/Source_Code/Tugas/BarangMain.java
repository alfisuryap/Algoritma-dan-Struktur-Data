package Jobsheet_2.Source_Code.Tugas;

import java.util.Scanner;

public class BarangMain {
    public static void main(String[] args) {
        Barang l1 = new Barang();
        Scanner zh = new Scanner(System.in);
        System.out.print("Masukkan nama barang : ");
        l1.nama = zh.nextLine();
        System.out.print("Masukkan harga satuan barang : ");
        l1.hargaSatuan = zh.nextInt();
        System.out.print("Masukkan jumlah barang : ");
        l1.jumlah = zh.nextInt();
        System.out.println("====================================");
        int totalHarga = l1.hitungHargaTotal(l1.hargaSatuan, l1.jumlah);
        System.out.println("Total       : " + totalHarga);
        double diskon = l1.hitungDiskon();
        System.out.println("Diskon      : " + diskon);
        double bayar = l1.hitungHargaBayar();
        System.out.println("Total Bayar : " + bayar);

    }

    
}
