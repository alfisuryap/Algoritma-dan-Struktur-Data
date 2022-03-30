Nama    : Alfi Surya Pratama

Kelas   : TI-1F

NIM     : 2141720075

# **PRAKTIKUM ALGORITMA DAN STRUKTUR DATA**
## **JOBSHEET 5**
## **SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)**

### **5.2 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Bubble Sort**

### *5.2.1 Langkah-langkah Percobaan*

*Class "Mahasiswa"*

~~~java
package Jobsheet_5.Source_Code.Percobaan;

public class Mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa(String n, int t, int u, double i){
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    void tampil(){
        System.out.println("Nama        = " + nama);
        System.out.println("Tahun Masuk = " + thnMasuk);
        System.out.println("Umur        = " + umur);
        System.out.println("IPK         = " + ipk);
    }
}
~~~

*Class "DaftarMahasiswaBerprestasi"*

~~~java
package Jobsheet_5.Source_Code.Percobaan;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    //setelah ini tuliskan method tambah()
    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    //setelah ini tuliskan method tampil()
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("------------------------------");
        }
    }

    //setelah ini tuliskan method bubbleSort()
    void bubbleSort(){
        for(int i = 0; i < listMhs.length-1; i++){
            for(int j = 1; j < listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    //di bawah ini proses swap atau penukaran
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
}
~~~

*Class Main*

~~~java
package Jobsheet_5.Source_Code.Percobaan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();
    }
}
~~~

### *5.2.2 Verifikasi Percobaan*

<img src = "Screenshot (532).png">

<img src = "Screenshot (533).png">

### *5.2.3 Pertanyaan*

1. Terdapat di method apakah proses bubble sort?

*Terdapat pada method bubbleSort(), dimana method bubbleSort terdapat pada class "DaftarMahasiswaBerprestasi", untuk lebih jelasnya kami tampilkan method bubbleSort() di bawah ini*

~~~java
void bubbleSort(){
    for(int i = 0; i < listMhs.length-1; i++){
        for(int j = 1; j < listMhs.length-i; j++){
            if(listMhs[j].ipk > listMhs[j-1].ipk){
                //di bawah ini proses swap atau penukaran
                Mahasiswa tmp = listMhs[j];
                listMhs[j] = listMhs[j-1];
                listMhs[j-1] = tmp;
            }
        }
    }
}
~~~

2. Terdapat di method apakah proses selection sort?

*Pada percobaan 1 masih belum ditambahkan method selection sort, akan tetapi pada percobaan 2 method selection sort sudah ditambahkan. Method selection sort terdapat pada method selectionSort(), dimana method selection short ini masih di dalam class yang sama dengan bubble sort yaitu pada class "DaftarMahasiswaBerprestasi", berikut adalah kode programnya*

~~~java
void selectionSort(){
    for(int i = 0; i < listMhs.length-1; i++){
        int idxMin = i;            for(int j = i + 1; j < listMhs.length; j++){
            if(listMhs[j].ipk < listMhs[idxMin].ipk){
                idxMin = j;
            }
        }
        //swap
        Mahasiswa tmp = listMhs[idxMin];
        listMhs[idxMin] = listMhs[i];
        listMhs[i] = tmp;
    }
}
~~~

3. Apakah yang dimaksud proses swap? Tuliskan potongan program untuk melakukan
proses swap tersebut!

*Swap adalah proses penukaran angka yang akan di sorting yang nantinya angka tersebut setelah di tukar (swap) akan diurutkan sesuai intruksi, apakah akan diurutkan dari terkecil ke terbesar (ascending), atau sebaliknya (descending), potongan program proses swap terdapat pada percobaan 1, 2, 3 berikut adalah potongan kodenya.*

~~~java
//proses di bawah ini adalah proses swap atau pertukuran (selection sort)
Mahasiswa tmp = listMhs[idxMin];
listMhs[idxMin] = listMhs[i];
listMhs[i] = tmp;

//proses di bawah ini adalah proses swap atau pertukaran (insertion sort)
    listMhs[j] = listMhs[j - 1];
    j--;
}
listMhs[j] = temp;
~~~

4. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini:

~~~java
    if(listMhs[j].ipk > listMhs[j-1].ipk){
        //di bawah ini proses swap atau penukaran
        Mahasiswa tmp = listMhs[j];
        listMhs[j] = listMhs[j-1];
        listMhs[j-1] = tmp;
    }
}
~~~
   
Untuk apakah proses tersebut?

*Proses tersebut adalah proses "pemilihan / if" dimana terdapat sebuah kondisi jika (listMhs[j].ipk > listMhs[j-1].ipk) terpenuhi, maka akan dilakukan proses swap atau pertukaran nilai dengan syarat yang telah diberikan. Yang mana syarat tersebut adalah (>) lebih dari, maka nilai yang akan diurutkan akan keluar descending (dari angka terbesar ke angka yang terkecil)*

5. Perhatikan perulangan di dalam bubbleSort() di bawah ini:

~~~java
for(int i = 0; i < listMhs.length-1; i++){
    for(int j = 1; j < listMhs.length-i; j++){
~~~

a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j?

*○ perulangan i disebut sebagai perulangan luar yang bertujuan agar proses pertukaran (swap) pada perulangan j tetap berlanjut hingga semua bilangan sudah diurutkan*

*○ perulangan j disebut sebagai perulangan dalam yang bertugas melakukan pertukaran (swap) nilai secara terus menerus hingga bilangan sudah terurut sesuai dengan syarat kondisi (ascending atau descending)*

b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?

*Agar batas dari perulangan i (perulangan dalam) memiliki rentang panjang sejumlah panjang array listMhs dikurangi 1 ketika melakukan perulangan dari perulangan swapping yang dilakukan oleh perulangan j.*

c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?

*Agar batas dari perulangan j (perulangan dalam) memiliki rentang panjang sejumlah panjang array listMhs dikurangi i ketika melakukan swapping / penukaran nilai dari array listMhs agar bisa urut.*

d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?

*○ perulangan yang akan berlangsung pada i apabila length listMhs 50 adalah sebanyak length dari array listMhs -1 (listMhs.length -1) sampai proses swipping atau tahap bubbleshot pada perulangan j habis / sudah memnuhi kondisi terurut(jika belum perulangan i akan terus dilakukan). dan jika dalam bentuk angka sesungguhnya perulangan i akan berlangsung sebanyak 49 kali*

*○ dan tahap bubbleshot akan ditempuh jika length listMhs 50 adalah sebanyak length dari array listMhs - i(listMhs.length -i) sampai proses swapping atau penukaran nilai dari elemen - elemen array listMhs sudah memnuhi kondisi terurut(jika belum maka swapping akan terus dilakukan). dan jika dalam bentuk angka sesungguhnya perulangan j(tahap bubblesort) akan ditempuh sebanyak 1273 kali*

### **5.3 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Selection Sort**

### *5.3.1 Langkah-langkah Percobaan*

*Class "Mahasiswa"*

~~~java
package Jobsheet_5.Source_Code.Percobaan;

public class Mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa(String n, int t, int u, double i){
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    void tampil(){
        System.out.println("Nama        = " + nama);
        System.out.println("Tahun Masuk = " + thnMasuk);
        System.out.println("Umur        = " + umur);
        System.out.println("IPK         = " + ipk);
    }
}
~~~

*Class "DaftarMahasiswaBerprestasi"*

~~~java
package Jobsheet_5.Source_Code.Percobaan;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    //setelah ini tuliskan method tambah()
    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    //setelah ini tuliskan method tampil()
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("------------------------------");
        }
    }

    //setelah ini tuliskan method bubbleSort()
    void bubbleSort(){
        for(int i = 0; i < listMhs.length-1; i++){
            for(int j = 1; j < listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    //di bawah ini proses swap atau penukaran
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    //setelah ini tuliskan method selectionSort()
    void selectionSort(){
        for(int i = 0; i < listMhs.length-1; i++){
            int idxMin = i;
            for(int j = i + 1; j < listMhs.length; j++){
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
}
~~~

*Class Main*

~~~java
package Jobsheet_5.Source_Code.Percobaan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();
    }
}
~~~

### *5.3.2 Verifikasi Percobaan*

<img src = "Screenshot (532).png">

<img src = "Screenshot (534).png">

### *5.3.3 Pertanyaan*

Di dalam method selection sort, terdapat baris program seperti di bawah ini:

~~~java
int idxMin = i;
for(int j = i + 1; j < listMhs.length; j++){
    if(listMhs[j].ipk < listMhs[idxMin].ipk){
        idxMin = j;
    }
}
~~~

Untuk apakah proses tersebut, jelaskan!

*○ proses tersebut bertujuan untuk mencari nilai elemen min pada semua nilai elemen pada array yang seharusnya (minimal pada pertama). kemudian elemen array tersebut ditetapkan*

*○ menemukan sebuah elemen array yang memiliki nilai kecil dari index kedua dari elemen awal jika terkecil, setelah itu melakukan penukaran elemen tersebut dengan elemen array pada posisi index kedua, kemudian untuk menetapkan elemen array tersebut ditambah dengan elemen array yang sebelumnya*

*○ dari program diatas nilai terkecil atau min dideklarasikan dengan idxmin, lalu masuk perulangan kedua untuk memberikan syart pemilihan if (listMhs[j].ipk < listMhs[idxMin].ipk) pada nilai tersebut dan jika memenuhi kondisi maka nilai terkecil sudah ditemukan*

### **5.4 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan  Insertion Sort**

### *5.4.1 Langkah-langkah Percobaan*

*Class "Mahasiswa"*

~~~java
package Jobsheet_5.Source_Code.Percobaan;

public class Mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa(String n, int t, int u, double i){
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    void tampil(){
        System.out.println("Nama        = " + nama);
        System.out.println("Tahun Masuk = " + thnMasuk);
        System.out.println("Umur        = " + umur);
        System.out.println("IPK         = " + ipk);
    }
}
~~~

*Class "DaftarMahasiswaBerprestasi"*

~~~java
package Jobsheet_5.Source_Code.Percobaan;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    //setelah ini tuliskan method tambah()
    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    //setelah ini tuliskan method tampil()
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("------------------------------");
        }
    }

    //setelah ini tuliskan method bubbleSort()
    void bubbleSort(){
        for(int i = 0; i < listMhs.length-1; i++){
            for(int j = 1; j < listMhs.length-i; j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    //di bawah ini proses swap atau penukaran
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    //setelah ini tuliskan method selectionSort()
    void selectionSort(){
        for(int i = 0; i < listMhs.length-1; i++){
            int idxMin = i;
            for(int j = i + 1; j < listMhs.length; j++){
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    //setelah ini tuliskan method insertionSort()
    void insertionSort(){
        for(int i = 1; i < listMhs.length; i++){
            Mahasiswa temp = listMhs[i];
            int j = i;
            while(j > 0 && listMhs[j - 1].ipk > temp.ipk){
                listMhs[j] = listMhs[j - 1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
~~~

*Class Main*

~~~java
package Jobsheet_5.Source_Code.Percobaan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertionSort();
        list.tampil();
    }
}
~~~

### *5.4.2 Verifikasi Percobaan*

<img src = "Screenshot (532).png">

<img src = "Screenshot (535).png">

### *5.4.3 Pertanyaan*

Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting
dengan cara ascending atau decending, anda dapat melakukannya dengan menambahkan
parameter pada pemanggilan fungsi insertionSort.

~~~java
void insertionSort(boolean asc){
    for(int i = 1; i < listMhs.length; i++){
        Mahasiswa temp = listMhs[i];            int j = i;
        while(j > 0 && listMhs[j - 1].ipk > temp.ipk){
            listMhs[j] = listMhs[j - 1];
            j--;
        }
        listMhs[j] = temp;
        }
    }
~~~

*Disini saya melakukan modifikasi di class DaftarMahasiswaBerprestasi dan di main class, untuk perubahan pada class daftarMahasiswaBerprestasi menambahkan parameter sebagai berikut*

~~~java
package Jobsheet_5.Source_Code.Percobaan;

public class DaftarMahasiswaBerprestasiTugas {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    //setelah ini tuliskan method tambah()
    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    //setelah ini tuliskan method tampil()
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("------------------------------");
        }
    }

    //setelah ini tuliskan method insertionSort()
    void insertionSort(boolean asc){
        for(int i = 1; i < listMhs.length; i++){
            Mahasiswa temp = listMhs[i];
            int j = i;
            if(asc){
                while(j > 0 && listMhs[j - 1].ipk > temp.ipk){
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
            }else{
                while(j > 0 && listMhs[j - 1].ipk < temp.ipk){
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
            }
            listMhs[j] = temp;
        }
    }
}
~~~

~~~java
package Jobsheet_5.Source_Code.Percobaan;

public class MainTugas {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasiTugas list = new DaftarMahasiswaBerprestasiTugas();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        
        System.out.println("Data Mahasiswa sebelum Sorting = ");
        list.tampil();

        System.out.println();
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk (menggunakan Insertion Short)");
        list.insertionSort(true);
        list.tampil();
        
        System.out.println();
        System.out.println("Data mahasiswa setelah sorting dsc berdasarkan ipk (menggunakan Insertion Short)");
        list.insertionSort(false);
        list.tampil();
    }
}
~~~

*Output*

<img src = "Screenshot (543).png">

<img src = "Screenshot (544).png">

<img src = "Screenshot (545).png">

### **5.5 Latihan Praktikum**
*Class "tiket"*

~~~java
package Jobsheet_5.Source_Code.Tugas;

public class tiket {
    String maskapai, asal, tujuan;
    int harga;
    
    tiket(String m, int h, String a, String t){
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }
    void tampilAll(){
        System.out.println("              Soekarno-Hatta International Airport            ");
        System.out.println("==============================================================");
        System.out.println("Carrier\t\t\t : "+maskapai);
        System.out.println("Price\t\t\t : Rp."+harga);
        System.out.println("Departure from\t\t : "+asal);
        System.out.println("Arrival to\t\t : "+tujuan);
        System.out.println("==============================================================");
    }
}
~~~

*Class "tiketService"*

~~~java
package Jobsheet_5.Source_Code.Tugas;

public class tiketService {
    tiket tikets [] = new tiket[4];
    int index;
    
    //method tambah
    void tambah(tiket t){
        if(index <tikets.length){
            tikets[index] = t;
            index++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }
    //method tampil
    void tampilAll(){
        for(tiket t : tikets){
            t.tampilAll();
        }
    }
    //method bubble short()
    void bubbleSort(){
        for(int i=0; i<tikets.length-1; i++){
            for(int j=1; j<tikets.length-i; j++){
                if(tikets[j].harga < tikets[j-1].harga){
                    //proses swap bubble short
                    tiket tmp = tikets[j];
                    tikets[j] = tikets[j-1];
                    tikets[j-1] = tmp;
                }
            }
        }
    }
    //method selection short
    void selectionShort(){
        for(int i=0; i<tikets.length-1; i++){
            int indexMin = i;
            for(int j=i+1; j<tikets.length; j++){
                if(tikets[j].harga > tikets[indexMin].harga){
                    indexMin = j;
                }
            }
            //proses swap selection short
            tiket tmp = tikets[indexMin];
            tikets[indexMin] = tikets[i];
            tikets[i] = tmp;
        }
    }
}
~~~

*Main Class "mainTiket"*

~~~java
package Jobsheet_5.Source_Code.Tugas;

public class mainTiket {
    public static void main(String[] args) {
        tiketService daftar = new tiketService();
        tiket t1 = new tiket ("GARUDA INDONESIA", 1700000, "CGK - Soekarno Hatta", "DPS - Ngurah Rai");
        tiket t2 = new tiket ("SINGAPORE AIRLINES", 3000000, "CGK - Soekarno Hatta", "SIN - Changi");
        tiket t3 = new tiket ("CITILINK", 1200000, "CGK - Soekarno Hatta", "SUB - Juanda");
        tiket t4 = new tiket ("BATIK AIR", 1300000, "CGK - Soekarno Hatta", "KNO - Kualanamu");
        
        daftar.tambah(t1);
        daftar.tambah(t2);
        daftar.tambah(t3);
        daftar.tambah(t4);
        
        System.out.println("--------------------------------------------------------------");
        System.out.println("                      DATA SEBELUM SORTING                    ");
        System.out.println("--------------------------------------------------------------");
        daftar.tampilAll();
        
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println("  DAFTAR HARGA SETELAH SORTING (ASC) MENGGUNAKAN BUBBLE SORT  ");
        System.out.println("--------------------------------------------------------------");
        daftar.bubbleSort();
        daftar.tampilAll();
        
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println(" DAFTAR HARGA SETELAH SORTING (DSC) MENGGUNAKAN SELECTION SORT");
        System.out.println("--------------------------------------------------------------");
        daftar.selectionShort();
        daftar.tampilAll();
    }
}
~~~

*Output*

<img src = "Screenshot (540).png">

<img src = "Screenshot (541).png">

<img src = "Screenshot (542).png">