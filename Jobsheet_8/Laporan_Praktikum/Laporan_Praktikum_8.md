Nama    : Alfi Surya Pratama

Kelas   : TI-1F

NIM     : 2141720075

# **PRAKTIKUM ALGORITMA DAN STRUKTUR DATA**
## **JOBSHEET 7**
## **QUEUE**

### **8.2 Praktikum 1**

### *8.2.1 Langkah-langkah Percobaan*

*CLass "Queue"*

~~~java
package Jobsheet_8.Source_Code.Percobaan.Praktikum1;

public class Queue {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n){
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty(){
        if (size == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if (size == max){
            return true;
        }else{
            return false;
        }
    }

    public void peek(){
        if (!IsEmpty()){
            System.out.println("Elemen terdepan: " + data[front]);
        }else{
            System.out.println("Queue masihn kosong");
        }
    }

    public void print(){
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while (i != rear){
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear(){
        if (!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int dt){
        if (IsFull()){
            System.out.println("Queue sudah penuh");
        }else{
            if (IsEmpty()){
                front = rear = 0;
            }else{
                if (rear == max - 1){
                    rear = 0;
                }else{
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int Dequeue(){
        int dt = 0;
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            dt = data[front];
            size--;
            if (IsEmpty()){
                front = rear = -1;
            }else{
                if (front == max - 1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return dt;
    }
}
~~~

*Main CLass "QueueMain"*

~~~java
package Jobsheet_8.Source_Code.Percobaan.Praktikum1;

import java.util.Scanner;

public class QueueMain {
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        Queue Q = new Queue(n);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }   
}
~~~

### *8.2.2 Verifikasi Percobaan*

### *8.2.3 Pertanyaan*

1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?

2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!

    ~~~java
    if (rear == max - 1){
        rear = 0;
    ~~~

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!

    ~~~java
    if (front == max - 1){
        front = 0;
    ~~~

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?

5. Perhatikan kembali method print jelaskan maksud dari potongan kode berikut!

    ~~~java
    i = (i + 1) % max;
    ~~~

6. Tunjukkan potongan kode program yang merupakan queue overflow!

7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi queue overflow dan queue underflow, program dihentikan!

### **8.3 Praktikum 2**

### *8.3.1 Langkah-langkah Percobaan*

*Class "Nasabah"*

~~~java
package Jobsheet_8.Source_Code.Percobaan.Praktikum2;

public class Nasabah {
    String norek, nama, alamat;
    int umur;
    double saldo;
    
    Nasabah (String norek, String nama, String alamat, int umur, double saldo){
        this.norek = norek;
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.saldo = saldo;
    }

    Nasabah(){

    }
}
~~~

*Class "Queue"*

~~~java
package Jobsheet_8.Source_Code.Percobaan.Praktikum2;

public class Queue {
    Nasabah[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n){
        max = n;
        data = new Nasabah[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty(){
        if (size == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if (size == max){
            return true;
        }else{
            return false;
        }
    }

    public void peek(){
        if (!IsEmpty()){
            System.out.println("Elemen terdepan: " + data[front].norek + " " + data[front].nama + " " + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        }else{
            System.out.println("Queue masihn kosong");
        }
    }

    public void print(){
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while (i != rear){
                System.out.print(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear(){
        if (!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Nasabah dt){
        if (IsFull()){
            System.out.println("Queue sudah penuh");
        }else{
            if (IsEmpty()){
                front = rear = 0;
            }else{
                if (rear == max - 1){
                    rear = 0;
                }else{
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public Nasabah Dequeue(){
        Nasabah dt = new Nasabah();
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        }else{
            dt = data[front];
            size--;
            if (IsEmpty()){
                front = rear = -1;
            }else{
                if (front == max - 1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return dt;
    }
}
~~~

*Main Class "QueueMain"*

~~~java
package Jobsheet_8.Source_Code.Percobaan.Praktikum2;

import java.util.Scanner;

public class QueueMain {
    public static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("--------------------------");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue antri = new Queue(jumlah);
        int pilih;

        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih){
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc.nextLine();
                    System.out.print("Nama\t: ");
                    String nama = sc.nextLine();
                    System.out.print("Alamat\t:   ");
                    String alamat = sc.nextLine();
                    System.out.print("Umur\t: ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo\t: ");
                    double saldo = sc.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0){
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
~~~

### *8.3.2 Verifikasi Percobaan*

### *8.3.3 Pertanyaan*

1. Pada class QueueMain, jelaskan fungsi IF pada potongan kode program berikut!

    ~~~java
    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0 && data.saldo != 0){
                            System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                            break;
                        }
    ~~~

2. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class Queue yang digunakan untuk  engecek antrian yang berada di posisi belakang! Tambahkan pula daftar menu 5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear dapat dipanggil!

### **8.4 Tugas**

1. Tambahkan dua method berikut ke dalam class Queue pada Praktikum 1:

    a. Method peekPosition(data: int) : void Untuk menampilkan posisi dari sebuah data di dalam queue, misalnya dengan mengirimkan data tertentu, akan diketahui posisi (indeks) data tersebut berada di urutan ke berapa

    b. Method peekAt(position: int) : void Untuk menampilkan data yang berada pada posisi (indeks) tertentu

    Sesuaikan daftar menu yang terdapat pada class QueueMain sehingga kedua method tersebut dapat dipanggil!

    ***Jawab***

    *Class "Queue"*

    ~~~java
    package Jobsheet_8.Source_Code.Tugas.Nomor1;

    public class Queue {
        int[] data;
        int front;
        int rear;
        int size;
        int max;

        public Queue(int n){
            max = n;
            data = new int[max];
            size = 0;
            front = rear = -1;
        }

        public boolean IsEmpty(){
            if (size == 0){
                return true;
            }else{
                return false;
            }
        }

        public boolean IsFull(){
            if (size == max){
                return true;
            }else{
                return false;
            }
        }

        public void peek(){
            if (!IsEmpty()){
                System.out.println("Elemen terdepan: " + data[front]);
            }else{
                System.out.println("Queue masihn kosong");
            }
        }

        public void print(){
            if (IsEmpty()){
                System.out.println("Queue masih kosong");
            }else{
                int i = front;
                while (i != rear){
                    System.out.print(data[i] + " ");
                    i = (i + 1) % max;
                }
                System.out.println(data[i] + " ");
                System.out.println("Jumlah elemen = " + size);
            }
        }

        public void clear(){
            if (!IsEmpty()){
                front = rear = -1;
                size = 0;
                System.out.println("Queue berhasil dikosongkan");
            }else{
                System.out.println("Queue masih kosong");
            }
        }

        public void Enqueue(int dt){
            if (IsFull()){
                System.out.println("Queue sudah penuh");
            }else{
                if (IsEmpty()){
                    front = rear = 0;
                }else{
                    if (rear == max - 1){
                        rear = 0;
                    }else{
                        rear++;
                    }
                }
                data[rear] = dt;
                size++;
            }
        }

        public int Dequeue(){
            int dt = 0;
            if (IsEmpty()){
                System.out.println("Queue masih kosong");
            }else{
                dt = data[front];
                size--;
                if (IsEmpty()){
                    front = rear = -1;
                }else{
                    if (front == max - 1){
                        front = 0;
                    }else{
                        front++;
                    }
                }
            }
            return dt;
        }
        
        public void peekPosition(int data){
            int i = front;
            boolean j = true;
            while (j){
                if (data == this.data[i]){
                    System.out.println("data "+data+" ada pada index ke- "+i);
                    j = false;
                }
                i++;
            }
        }
        
        public void peekAt (int posisi){
            int i = front;
            boolean j = true;
            while(j){
                if(posisi == i){
                    System.out.println("data pada index ke - "+i+" adalah "+this.data[i]);
                    j = false;
                }
                i++;
            }
        }
    }
    ~~~

    *Main Class "QueueMain"*

    ~~~java
    package Jobsheet_8.Source_Code.Tugas.Nomor1;

    import java.util.Scanner;

    public class QueueMain {
        public static void menu(){
            System.out.println("Masukkan operasi yang diinginkan");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Clear");
            System.out.println("6. Cari indeks");
            System.out.println("7. Cari data");
            System.out.println("0. Exit");
            System.out.println("--------------------");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan kapasitas queue: ");
            int n = sc.nextInt();
            Queue Q = new Queue(n);
            int pilih;

            do {
                menu();
                pilih = sc.nextInt();
                switch (pilih){
                    case 1:
                        System.out.print("Masukkan data baru: ");
                        int dataMasuk = sc.nextInt();
                        Q.Enqueue(dataMasuk);
                        break;
                    case 2:
                        int dataKeluar = Q.Dequeue();
                        if (dataKeluar != 0){
                            System.out.println("Data yang dikeluarkan: " + dataKeluar);
                            break;
                        }
                    case 3:
                        Q.print();
                        break;
                    case 4:
                        Q.peek();
                        break;
                    case 5:
                        Q.clear();
                        break;
                    case 6:
                        System.out.print("Masukkan data yang akan dicari\t\t:");
                        int cari = sc.nextInt();
                        Q.peekPosition(cari);
                        break;
                    case 7:
                        System.out.print("Masukkan indeks yang akan dicari\t:");
                        int posisi = sc.nextInt();
                        Q.peekAt(posisi);
                        break;
                }
            } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
        }
    }
    ~~~

2. Buatlah program antrian untuk mengilustasikan mahasiswa yang sedang meminta tanda tangan
KRS pada dosen DPA di kampus. Ketika seorang mahasiswa akan mengantri, maka dia harus
menuliskan terlebih dulu NIM, nama, absen, dan IPK seperti yang digambarkan pada Class
diagram berikut:

    <img src = "Screenshot (594).png">

    Class diagram Queue digambarkan sebagai berikut:

    <img src = "Screenshot (595).png">

    <img src = "Screenshot (596).png">

    Keterangan:

    • Method create(), isEmpty(), isFull(), enqueue(), dequeue() dan print(), kegunaannya sama seperti yang telah dibuat pada Praktikum

    • Method peek(): digunakan untuk menampilkan data Mahasiswa yang berada di posisi antrian paling depan

    • Method peekRear(): digunakan untuk menampilkan data Mahasiswa yang berada di posisi antrian paling belakang

    • Method peekPosition(): digunakan untuk menampilkan posisi antrian ke berapa, seorang Mahasiswa berada. Pengecekan dilakukan berdasarkan NIM

    • Method printMahasiswa(): digunakan untuk menampilkan data mahasiswa pada suatu posisi tertentu dalam antrian

    ***Jawab***

    *Class "Mahasiswa"*

    ~~~java
    package Jobsheet_8.Source_Code.Tugas.Nomor2;

    public class Mahasiswa {
        String nim;
        String nama;
        int absen;
        double ipk;

        Mahasiswa (String nim, String nama, int absen, double ipk){
            this.nim = nim;
            this.nama = nama;
            this.absen = absen;
            this.ipk = ipk;
        }

        Mahasiswa() {
        
        }
    }
    ~~~

    *Class "Queue"*

    ~~~java
    package Jobsheet_8.Source_Code.Tugas.Nomor2;

    public class Queue {
        int max, size, front, rear;
        Mahasiswa[] antrian;
        
        public Queue(int n){
            max = n;
            antrian = new Mahasiswa [max];
            size = 0;
            front = rear = -1;
        }
        public boolean IsEmpty(){
            if(size == 0){
                return true;
            }else{
                return false;
            }
        }
        public boolean IsFull(){
            if(size == max){
                return true;
            }else {
                return false;
            }
        }
        public void peek(){
            if(!IsEmpty()){
                System.out.println("Elemen terdepan : "+antrian[front].nama+ " "+antrian[front].nim+" "+antrian[front].absen+" "+antrian[front].ipk);
            }else{
                System.out.println("Queue masih kosong");
            }
        }
        public void peekRear(){
            if(!IsEmpty()){
                System.out.println("Elemen yang belakang : "+antrian[rear].nama+ " "+antrian[rear].nim+" "+antrian[rear].absen+" "+antrian[rear].ipk);
            }else{
                System.out.println("Queue masih kosong");
            }
        }
        public void print(){
            if(IsEmpty()){
                System.out.println("Queue masih kosong");
            }else {
                int i = front;
                while(i != rear){
                    System.out.println(antrian[i].nama + " "+antrian[i].nim + " "+antrian[i].absen + " "+antrian[i].ipk);
                    i = (i + 1) % max;
                }
                System.out.println(antrian[i].nama + " "+antrian[i].nim + " "+antrian[i].absen + " "+antrian[i].ipk);
                System.out.println("Jumlah elemen = "+ size);
            }
        }
        public void clear(){
            if(!IsEmpty()){
                front = rear = -1;
                size = 0;
                System.out.println("queue berhasil dikosongkan");
            }else{
                System.out.println("Queue masih kosong");
            }
        }
        public void enqueue(Mahasiswa dt){
            if(IsFull()){
                System.out.println("Queue sudah penuh");
            }else{
                if(IsEmpty()){
                    front = rear = 0;
                }else{
                    if (rear == max -1){
                        rear = 0;
                    }else{
                        rear++;
                    }
                }
                antrian[rear] = dt;
                size++;
            }
        }
        public Mahasiswa dequeue(){
            Mahasiswa dt = new Mahasiswa();
            if(IsEmpty()){
                System.out.println("Queue masih kosong");
            }else{
                dt = antrian[front];
                size--;
                if(IsEmpty()){
                    front = rear = -1;
                }else{
                    if(front == max -1){
                        front = 0;
                    }else{
                        front++;
                    }
                }
            }
            return dt;
        }
        public void peekPosition(String nim){
            int i = front;
            boolean j = true;
            while (j) {
                if (nim.equals(this.antrian[i].nim)) {
                System.out.println("data " + antrian[i].nim + " ada di index ke-" + i);
                j = false;
            }
            i++;
        }
        }
        public void printMahasiswa (int posisi){
            int i = front;
            boolean j = true;
            while(j){
                if(posisi == i){
                    System.out.println("data pada index ke - "+i+" adalah "+this.antrian[i].nim+" "+this.antrian[i].nama+" "+this.antrian[i].absen+" "+this.antrian[i].ipk);
                    j = false;
                }
                i++;
            }
        }
    }
    ~~~

    *Class "QueueMain"*

    ~~~java
    package Jobsheet_8.Source_Code.Tugas.Nomor2;

    import java.util.Scanner;

    public class QueueMain {
        public static void menu(){
            System.out.println("\nPilih Menu ");
            System.out.println(" 1. Antrian baru\n 2. Antrian Keluar\n 3. Cek Antrian Terdepan\n 4. Cek Semua Antrian\n 5. Cek Antrian Paling Belekang\n 6. Cari index Mahasiswa dengan Nim\n 7. Cek data mahasiswa berdasarkan antrian\n 8. Hapus Antrian\n 0. Exit");
            System.out.println("-----------------------------------");
            
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Scanner sd = new Scanner(System.in);
            Scanner sb = new Scanner(System.in);
            
            System.out.print("Masukkan kapasitas queue : ");
            int jumlah = sc.nextInt();
            Queue antri = new Queue(jumlah);
            
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
                        Mahasiswa nb = new Mahasiswa(nim, nama, absen, ipk);
                        sc.nextLine();
                        antri.enqueue(nb);
                        break;
                    case 2:
                        Mahasiswa data = antri.dequeue();
                        if(!"".equals(data.nim) && !"".equals(data.nama) &&!"".equals(data.absen) && data.ipk !=0){
                            System.out.println("Antrian yang keluar : " + data.nim+ " "+ data.nama+" "+ data.absen+" "+data.ipk);
                    }
                        break;
                    case 3:
                        antri.peek();
                        break;
                    case 4:
                        antri.print();
                        break;
                    case 5:
                        antri.peekRear();
                        break;
                    case 6:
                        System.out.print("Masukkan nim Mahasiswa\t\t:");
                        String nimm = sc.nextLine();
                        antri.peekPosition(nimm);
                        break;
                    case 7:
                        System.out.print("Masukkan indeks Antrian yang akan dicek\t:");
                        int posisi = sc.nextInt();
                        antri.printMahasiswa(posisi);
                        break;
                    case 8:
                        antri.clear();
                        break;
                }
            }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7 || pilih == 8);
        }
    }
    ~~~