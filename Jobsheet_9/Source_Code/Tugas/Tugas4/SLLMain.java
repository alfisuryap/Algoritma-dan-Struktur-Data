import java.util.Scanner;

public class SLLMain {
    public static void menu(){
        System.out.println("\nPilih Menu ");
        System.out.println(" 1. Antrian baru\n 2. Antrian Keluar\n 3. Cek Antrian Terdepan\n 4. Cek Semua Antrian\n 5. Cek Antrian Paling Belekang\n 6. Cari index Mahasiswa dengan Nim\n 7. Cek data mahasiswa berdasarkan antrian\n 8. Keluar");
        System.out.println("-----------------------------------");
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
        
        SingleLinkedList singLL = new SingleLinkedList();
    
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
        
            switch(pilih){
                case 1:
                    System.out.print("Nim Mahasiswa\t: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama Mahasiswa\t: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen Mahasiswa\t: ");
                    int absen = sd.nextInt();
                    System.out.print("IPK Mahasiswa\t: ");
                    double ipk = sb.nextDouble();
                    singLL.addLast(nim, nama, absen, ipk);
                    sc.nextLine();
                break;
                
                case 2:
                    singLL.removeFirst();
                    System.out.println("mahasiswa urutan awal berhasil keluar!!!");
                    System.out.println("dengan sisa antrian dibawah ini\n");
                    singLL.print();
                break;
                
                case 3:
                    System.out.println("Berikut adalah antrian mahasiswa terdepan !");
                    singLL.peek();
                break;
                
                case 4:
                    System.out.println("Berikut adalah data semua antrian");
                    singLL.print();
                break;
                
                case 5:
                    System.out.println("Berikut adalah antrian mahasiswa paling belakang !");
                    singLL.peekRear();
                break;
                
                case 6:
                    System.out.println("Pencarian Index Mahasiswa Dengan Nim");
                    System.out.print("Masukkan Nim mahasiswa : ");
                    String nimm = sc.nextLine();
                    singLL.cariNim(nimm);
                break;
                
                case 7:
                    System.out.println("Pencarian data mahasiswa berdasarkan antrian");
                    System.out.print("Masukkan antrian Mahasiswa : ");
                    int antrian = sd.nextInt();
                    singLL.cariIndex(antrian);
                break;
                
                case 8:
                    System.out.println("Terima Kasih Telah menggunakan layanan kami");
                    System.out.println("----------Alvian Nur Firdaus @ 2022--------");
                    System.exit(0);
                break;
            }
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8);
    }
}