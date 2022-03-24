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

2. Terdapat di method apakah proses selection sort?

3. Apakah yang dimaksud proses swap? Tuliskan potongan program untuk melakukan
proses swap tersebut!

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

5. Perhatikan perulangan di dalam bubbleSort() di bawah ini:

~~~java
for(int i = 0; i < listMhs.length-1; i++){
    for(int j = 1; j < listMhs.length-i; j++){
~~~

a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j?

b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?

c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?

d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?

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

### **5.5 Latihan Praktikum**
