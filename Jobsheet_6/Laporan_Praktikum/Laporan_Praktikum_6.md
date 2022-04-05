Nama    : Alfi Surya Pratama

Kelas   : TI-1F

NIM     : 2141720075

# **PRAKTIKUM ALGORITMA DAN STRUKTUR DATA**
## **JOBSHEET 5**
## **SEARCHING**

### **6.2 Searching / Pencarian Menggunakan Agoritma Sequential Search**

### *6.2.1 Langkah-langkah Percobaan Sequential Search*

*Class "Mahasiswa"*

~~~java
package Jobsheet_6.Source_Code.Percobaan;

public class Mahasiswa {
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa(int ni, String n, int u, double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void tampil(){
        System.out.println("NIM = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }
}
~~~

*Class "PencarianMhs"*

~~~java
package Jobsheet_6.Source_Code.Percobaan;

public class PencarianMhs {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("------------------------------");
        }
    }

    public int FindSearch(int cari){
        int posisi = -1;
        for(int j = 0; j < listMhs.length; j++){
            if(listMhs[j].nim == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int  pos){
        if(pos != -1){
            System.out.println("data : " + x + "ditemukan pada indeks " + pos);
        }else{
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos){
        if(pos != -1){
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        }else{
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
}
~~~

*Main Class "Mahasiswa Main"*

~~~java
package Jobsheet_6.Source_Code.Percobaan;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();
        int jumMhs = 5;

        System.out.println("-------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari NIM terkecil :");
        for(int i = 0; i < jumMhs; i++){
            System.out.println("-------------------------");
            System.out.print("NIM\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("____________________________________________");
        System.out.println("____________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan NIM Mahasiswa yang dicari: ");
        System.out.print("NIM : ");
        int cari = s.nextInt();
        System.out.println("menggunakan Sequential Search");
        int posisi = data.FindSearch(cari);

        data.Tampilposisi(cari, posisi);

        data.TampilData(cari, posisi);
    }
}
~~~

### *6.2.2 Verifikasi Hasil Percobaan*

<img src = "Screenshot (546).png">

<img src = "Screenshot (547).png">

<img src = "Screenshot (548).png">

### *6.2.3 Pertanyaan*

1. Jelaskan perbedaan metod TampilData dan Tampilposisi pada class PencarianMhs

2. Jelaskan fungsi break pada kode program dibawah ini! 

~~~java
if (listMHs[j].nim == cari){
    posisi = j;
    break;
}
~~~

3. Jika Data Nim yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih dapat
berjalan? Apakah hasil yang dikeluarkan benar? Mengapa demikian!

### **6.3 Searching / Pencarian Menggunakan Binary Search**

### *6.3.1 Langkah-langkah Percobaan Binary Search*

*Class "Mahasiswa"*

~~~java
package Jobsheet_6.Source_Code.Percobaan;

public class Mahasiswa {
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa(int ni, String n, int u, double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void tampil(){
        System.out.println("NIM = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }
}
~~~

*Class "PencarianMhs"*

~~~java
package Jobsheet_6.Source_Code.Percobaan;

public class PencarianMhs {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh !!");
        }
    }

    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("------------------------------");
        }
    }

    public int FindSearch(int cari){
        int posisi = -1;
        for(int j = 0; j < listMhs.length; j++){
            if(listMhs[j].nim == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int  pos){
        if(pos != -1){
            System.out.println("data : " + x + "ditemukan pada indeks " + pos);
        }else{
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos){
        if(pos != -1){
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        }else{
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left + right) / 2;
            if(cari == listMhs[mid].nim){
                return(mid);
            }else if(listMhs[mid].nim > cari){
                return FindBinarySearch(cari, left, mid - 1);
            }else{
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
~~~

*Main Class "Mahasiswa Main"*

~~~java
package Jobsheet_6.Source_Code.Percobaan;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();
        int jumMhs = 5;

        System.out.println("-------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari NIM terkecil :");
        for(int i = 0; i < jumMhs; i++){
            System.out.println("-------------------------");
            System.out.print("NIM\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("____________________________________________");
        System.out.println("____________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan NIM Mahasiswa yang dicari: ");
        System.out.print("NIM : ");
        int cari = s.nextInt();
        System.out.println("menggunakan Sequential Search");
        int posisi = data.FindSearch(cari);

        data.Tampilposisi(cari, posisi);

        data.TampilData(cari, posisi);

        System.out.println("===================================");
        System.out.println("menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
~~~

### *6.3.2 Verifikasi Hasil Percobaan*

<img src = "Screenshot (546).png">

<img src = "Screenshot (547).png">

<img src = "Screenshot (548) - Copy.png">

### *6.3.3 Pertanyaan*

1. Tunjukkan pada kode program yang mana proses divide dijalankan!

2. Tunjukkan pada kode program yang mana proses conquer dijalankan!

3. Jika data Nim yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian!

4. Jika Nim yang dimasukkan dari NIM terbesar ke terkecil (missal : 20215, 20214, 20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai

5. Modifikasilah program diatas yang mana jumlah mahasiswa yang di inputkan sesuai dengan masukan dari keyboard.

### **6.4 Percobaan Pengayaan Divide and Conquer**

### *6.4.1 Langkah-langkah Percobaan Merge Sort*

### *6.4.2 Verifikasi Hasil Percobaan*

### **6.5 Latihan Praktikum**

1. Modifikasi percobaan searching diatas dengan ketentuan berikut ini
    - Sebelum dilakukan searching dengan binary search data harus dilakukan pengurutan dengan menggunakan algoritma sorting (pilih salah satu algoritma sorting dari pertemuan sebelumnya)

2. Modifikasi percobaan searching diatas dengan ketentuan berikut ini
    - Pencarian dilakukan berdasarkan Nama Mahasiswa (gunakan Algoritma Sequential Search)
    - Jika terdapat nama yang sama? Bagaimana keluaran dari kode program ketika pencarian dilakukan pada nama yang sama!

3. Terdapat sebuah data array 1 dimensi sebagai berikut

    <img src = "Screenshot (549).png">

    Buatlah program untuk mengurutkan array tersebut (boleh memilih metode pengurutan) selanjutnya lakukan pencarian dan mencetak isi array yang nilainya terbesar, dan mencetak ada berapa buah nilai terbesar tersebut serta berada dilokasi mana saja nilai terbesar tersebut! (menggunakan binary search)

    ***Jawab***

*Class "Tugas3"*

~~~java
package Jobsheet_6.Source_Code.Tugas;

public class Tugas3 {
    int nilai;

    Tugas3(int n){
        nilai = n;
    }
   
    void tampil(){
        System.out.print(nilai + " ");
    }
}
~~~

*Class "Tugas3Search"*

~~~java
package Jobsheet_6.Source_Code.Tugas;

public class Tugas3Search {
    int idx;
    Tugas3 data[];

    Tugas3Search(int x) {
        this.data = new Tugas3[x];

    }
    void tambah(Tugas3 t) {
         if (idx < data.length) {
             data[idx] = t;
             idx++;
        }
        else {
            System.out.println("Data sudah penuh !!");
        }
    }
    void tampil() {
        for (Tugas3 m : data) {
        m.tampil();
        }
    }
    void selectionSort() {
         for (int i = 0; i < data.length - 1; i++) {
            int idxMin = i;
        for (int j = i + 1; j < data.length; j++) {
            if (data[j].nilai > data[idxMin].nilai) {
                idxMin = j;
                }
        }
            Tugas3 tmp = data[idxMin];
                data[idxMin] = data[i];
                data[i] = tmp;
        }
    }
    public void TampilIndex(int y, int in) {
        if (in != -1) {
            System.out.println("Data " + y + " ditemukan pada index ke-" + in);
         } else {
            System.out.println("Data " + y + "tidak ditemukan");
        }
    }
    public void TampilData(int y, int in) {
         if (in != -1) {
            System.out.println("Nilai : " + data[in].nilai);
        } else {
            System.out.println("Data " + y + "tidak ditemukan");
        }
    }
    public int BinarySearch(int cari, int kiri, int kanan) {
        int mid;
        if (kanan >= kiri) {
            mid = (kiri + kanan) / 2;
                if (cari == data[mid].nilai) {
                    if (cari == data[mid].nilai) {
                       TampilIndex(cari, mid);
                       TampilData(cari, mid);
                        return mid;
                    }
                    if (cari == data[kiri].nilai || cari == data[kanan].nilai) {
                        if (cari == data[kiri].nilai) {
                            TampilIndex(cari, kiri);
                            TampilData(cari, kiri);
                            System.out.println("Kiri basecase");
                        }
                        if (cari == data[kanan].nilai) {
                            TampilIndex(cari, data[kanan].nilai);
                            TampilData(cari, kanan);
                            System.out.println("Kanan basecase");
                        }
                    }

                } else if (data[mid].nilai < cari) {
                    if (cari == data[kiri].nilai || cari == data[kanan].nilai) {
                        if (cari == data[kiri].nilai) {
                            TampilIndex(cari, kiri);
                            TampilData(cari, kiri);
                            return BinarySearch(cari, kiri, mid - 1);
                        }
                        else {
                            TampilIndex(cari, kanan);
                            TampilData(cari, kanan);
                            return BinarySearch(cari, kiri, mid - 1);
                        }
                    }
                    return BinarySearch(cari, kiri, mid - 1);
                }
                else {
                    if (cari == data[kiri].nilai || cari == data[kanan].nilai) {
                        if (cari == data[kiri].nilai) {
                            TampilIndex(cari, kiri);
                            TampilData(cari, kiri);
                            return BinarySearch(cari, mid + 1, kanan);
                        }else {
                            TampilIndex(cari, kanan);
                            TampilData(cari, kanan);
                            return BinarySearch(cari, mid + 1, kanan);
                        }
                }
                    return BinarySearch(cari, mid + 1, kanan);
            }
        }
        return -1;
    }
}
~~~

*Main Class "Tugas3Main"*

~~~java
package Jobsheet_6.Source_Code.Tugas;

import java.util.Scanner;

public class Tugas3Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.print("Masukkan Jumlah Nilai Array : ");
        int jml = input.nextInt();
        Tugas3Search tts = new Tugas3Search(jml);
        System.out.println("---------------------------------");
        System.out.println("");
        System.out.println("=====INPUT NILAI=====");
        for (int i = 0; i < jml; i++) {
            System.out.print("Nilai ke-" + i +" : ");
            int nilai = input.nextInt();
            Tugas3 t = new Tugas3(nilai);
            tts.tambah(t);
        }

        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("  DATA NILAI KESELURUHAN  ");
        System.out.println("--------------------------");
        tts.selectionSort();
        tts.tampil();
        System.out.println();

        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("          PENCARIAN DATA          ");
        System.out.println("----------------------------------");
        System.out.print("Masukkan nilai yang dicari: ");
        int cari = input.nextInt();
        System.out.println("BINARY SEARCH");
        int index = tts.BinarySearch(cari, 0, jml - 1);
        if (index == -1){
            System.out.println("Data tidak ditemukan");
        }
    }
}
~~~


*Output*