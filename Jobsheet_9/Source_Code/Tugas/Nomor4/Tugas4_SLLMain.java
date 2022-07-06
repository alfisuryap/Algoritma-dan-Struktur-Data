import java.util.Scanner;

public class Tugas4_SLLMain {
    public static void menu(){
        System.out.println("\nPilih Menu ");
        System.out.println(" 1. Antrian Baru\n 2. Antrian Keluar\n 3. Cek Antrian Terdepan\n 4. Cek Semua Antrian\n 5. Cek Antrian Paling Belakang\n 6. Cari Index Mahasiswa dengan NIM\n 7. Cek Data Mahasiswa berdasarkan Antrian\n 8. Keluar");
        System.out.println("------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        Scanner sb = new Scanner(System.in);
    
        Tugas4_SLL singLL = new Tugas4_SLL();

        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
    
            switch(pilih){
                case 1:
                    System.out.print("NIM Mahasiswa\t: ");
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
                    System.out.println("Mahasiswa urutan awal berhasil keluar!!!");
                    System.out.println("Dengan sisa antrian dibawah ini: \n");
                    singLL.print();
                break;
                
                case 3:
                    System.out.println("Berikut adalah antrian mahasiswa terdepan:");
                    singLL.peek();
                break;
                
                case 4:
                    System.out.println("Berikut adalah data semua antrian:");
                    singLL.print();
                break;
                
                case 5:
                    System.out.println("Berikut adalah antrian mahasiswa paling belakang:");
                    singLL.peekRear();
                break;
                
                case 6:
                    System.out.println("Pencarian Index Mahasiswa Dengan NIM");
                    System.out.print("Masukkan NIM mahasiswa : ");
                    String nimm = sc.nextLine();
                    singLL.cariNim(nimm);
                break;
                
                case 7:
                    System.out.println("Pencarian data mahasiswa berdasarkan antrian");
                    System.out.print("Masukkan antrian mahasiswa: ");
                    int antrian = sd.nextInt();
                    singLL.cariIndex(antrian);
                break;
                
                case 8:
                    System.out.println("Terima Kasih Telah menggunakan layanan kami");
                    System.exit(0);
                break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8);
    }
}