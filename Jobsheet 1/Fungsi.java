import java.util.Scanner;
public class Fungsi {
    static String cabangToko[] = {
        "RoyalGarden1",
        "RoyalGarden2",
        "RoyalGarden3",
        "RoyalGarden4"
    };
    static String namaBunga[] = {
        "Aglonema", "Keladi", "Alocasia", "Mawar"
    };
    static int stock[][] = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    static void cetakTabel() {
        System.out.println("=============================================================================");
        System.out.println("\t\tList Stock Bunga dari Setiap Cabang Toko");
        System.out.println("=============================================================================");
        System.out.print("|\t\t");
        for (int i = 0; i < namaBunga.length; i++) {
            if (i == namaBunga.length - 1) {
                System.out.printf("| %-12s |", namaBunga[i]);
                break;
            }
            System.out.printf("| %-12s ", namaBunga[i]);
        }
        System.out.println();
        for (int j = 0; j < cabangToko.length; j++) {
            System.out.printf("| %-13s |", cabangToko[j]);
            for (int k = 0; k < stock[0].length; k++) {
                System.out.printf(" %-12d |", stock[j][k]);
            }
            System.out.println();
        }
    }

    static int[] jumlahBungaSeluruhCabang(){
        int jumlah[] = new int[namaBunga.length];
        for(int i = 0; i < stock[0].length; i++){
            jumlah[i] = 0;
            for(int j = 0; j < stock.length; j++){
                jumlah[i] += stock[j][i];
            }
        }
        return jumlah;
    }

    static void cetakJumlahBungaSeluruhCabang(){
        int jumlahBunga[] = jumlahBungaSeluruhCabang();
        System.out.println("\tTotal Stock Setiap Bunga\n");
        for(int i = 0; i < namaBunga.length; i++){
            System.out.println("Total Bunga " + namaBunga[i] + " = " + jumlahBunga[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tToko Bunga Royal Garden");
        System.out.println("\n\t\tMenu");
        System.out.println("1. Tabel Stock");
        System.out.println("2. Jumlah Bunga Disetiap Cabang");
        System.out.print("\nPilih Salah Satu : ");
        int pilihan = sc.nextInt();
        sc.close();
        System.out.println();
        switch(pilihan){
            case 1:
                cetakTabel();
                break;
            case 2:
                cetakJumlahBungaSeluruhCabang();
                break;
            default:
                System.out.println("Pilihan Tidak Ada");
        }
    }
}
