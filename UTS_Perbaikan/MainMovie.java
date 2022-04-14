package UTS_Perbaikan;

import java.util.Scanner;

public class MainMovie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        Movie data = new Movie();
        System.out.print("Masukkan jumlah movie: ");
        int jmlM = sc.nextInt();
        Movie[] movie = new Movie[jmlM];
        data.movie = movie;
        
        for(int i = 0; i < movie.length; i++){
            
            int id = i + 1;
            System.out.println("===================");
            System.out.println("Data Movie ke-" + id);
            System.out.println("Judul: ");
            String judul = input.nextLine();
            System.out.println("Tahun: ");
            int tahun = sc.nextInt();
            System.out.println("Rating: ");
            float rating = sc.nextFloat();
            
            // instance movie
            Movie m = new Movie(id, judul, tahun, rating);
            data.tambah(m);

            System.out.println("===================");
        }
        
        System.out.println("\nDATA SEBELUM DIOLAH");
        data.tampil();
        

        System.out.println("\nPENGURUTAN DATA");
        data.insertionSort();
        data.tampil();
        // terapkan fungsi pengurutan data

        System.out.println("\nPENCARIAN DATA");
        System.out.println("Cari tahun:"); // isi titik-titik sesuai atribut yang diolah
        System.out.println("Masukkan tahun Movie yang dicari:");
        System.out.print("Tahun : ");
        int cari = sc.nextInt(); // isi titik-titik sesuai atribut yang diolah
        System.out.println("menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);

        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}
