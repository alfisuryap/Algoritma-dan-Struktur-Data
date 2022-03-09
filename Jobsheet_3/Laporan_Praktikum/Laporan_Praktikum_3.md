Nama    : Alfi Surya Pratama

Kelas   : TI-1F

NIM     : 2141720075

# **PRAKTIKUM ALGORITMA DAN STRUKTUR DATA**
## **JOBSHEET 3**
## **ARRAY OF OBJECT**

### **3.2 Membuat Array dari Object, Mengisi dan Menampilkan**

### *3.2.1 Langkah-langkah Percobaan*
~~~java
package Jobsheet_3.Source_Code.Percobaan;

public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public static void main(String[] args){
        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        ppArray[0] = new PersegiPanjang();
        ppArray[0] .panjang = 110;
        ppArray[0] .lebar = 30;

        ppArray[1] = new PersegiPanjang();
        ppArray[1] .panjang = 80;
        ppArray[1] .lebar = 40;

        ppArray[2] = new PersegiPanjang();
        ppArray[2] .panjang = 100;
        ppArray[2] .lebar = 20;

        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0] .panjang + ", lebar: " + ppArray[0] .lebar);
        System.out.println("Persegi Panjang ke-1, panjang: " + ppArray[1] .panjang + ", lebar: " + ppArray[1] .lebar);
        System.out.println("Persegi Panjang ke-2, panjang: " + ppArray[2] .panjang + ", lebar: " + ppArray[2] .lebar);
   
    }
    
}
~~~

### *3.2.2 Verifikasi Hasil Percobaan*

<img src = "Screenshot (481).png">

### *3.2.3 Pertanyaan*
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
atribut dan sekaligus method?Jelaskan!

*Class yang dibuat array of object harus memiliki atribut dan tidak harus selalu memiliki method, karena atribut merupakan variable yang terletak di dalam class, sedangkan untuk method biasanya digunakan untuk menghitung rumus*

2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan
konstruktur pada baris program berikut :
~~~java
ppArray[1] = new PersegiPanjang();
~~~

*Class persegiPanjang tidak memiliki konstruktor, namum pemanggilan konstruktor dalam kode program tersebut tetap dilakukan untuk menghindar Error NullPointerException*

3. Apa yang dimaksud dengan kode berikut ini:
~~~java
PersegiPanjang[] ppArray = new PersegiPanjang[3];
~~~

*Kode program tersebut merupakan deklarasi dan instansiasi array yang dituliskan pada class main*

4. Apa yang dimaksud dengan kode berikut ini:
~~~java
ppArray[1] = new PersegiPanjang();
ppArray[1] .panjang = 80;
ppArray[1] .lebar = 40;
~~~

*Kode program tersebut merupakan object yang dibuat untuk mengisi array persegiPanjang yang telah dideklarasi dan diinstansiasikan sebelumnya*

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?

*Class main dan class persegiPanjang dipisahkan karena dalam membuat array of object akan diperlukan class yang terpisah dengan class main sebagai objectnya*

### **3.3 Menerima Input Isian Array Menggunakan Looping**

### *3.3.1 Langkah-langkah Percobaan*
~~~java
package Jobsheet_3.Source_Code.Percobaan;

import java.util.Scanner;

public class arrayObject {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        PersegiPanjang[] ppArray = new PersegiPanjang[3];

        for(int i = 0; i < ppArray.length; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan nilai panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan nilai lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for(int i = 0; i < ppArray.length; i++){
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }
    }   
}
~~~

### *3.3.2 Verifikasi Hasil Percobaan*

<img src = "Screenshot (496).png">

### *3.3.3 Pertanyaan*

1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?

*Iya, array of object dapat diimplementasikan pada 2 dimensi*

2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!

*Contohnya adalah pada program java yang bisa menyimpan data mahasiswa yang berisikan nama dan kelasnya*
~~~java
import java.util.Scanner;

public class percobaanTiga{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Mahasiswa: ");
        int n = input.nextInt();
        coba[][] mhs = new coba[n][1];

        for (int j= 0; int < mhs[i].length; j++){
            mhs[i][j] = new coba();
            System.out.print("Masukkan Nama: ");
            mhs[i][j].nama = input.next().charAt(0);
            System.out.print("Masukkan Kelas: ");
            mhs[i][j].data = input.next().charAt(0);
            System.out.print();
        }
    }
}
~~~

3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode
dibawah ini akan memunculkan error saat dijalankan. Mengapa?
~~~java
Persegi[] pgArray = new Persegi[100];
pgArray[5].sisi = 20;
~~~

*Kode program tersebut error ketika dijalankan, karena belum dibuatkan objeknya sehingga ditambahkan kode program seperti berikut:*

~~~java
pgArray[5] = new Persegi();
~~~

4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!

~~~java
package Jobsheet_3.Source_Code.Percobaan;

import java.util.Scanner;

public class arrayObejctModif {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang Elemen: ");
        int n = sc.nextInt();

        PersegiPanjang[] ppArray = new PersegiPanjang[n];

        for(int i = 0; i < ppArray.length; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan nilai panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan nilai lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for(int i = 0; i < ppArray.length; i++){
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);
        }
    }
}
~~~

*Output*

<img src = "Screenshot (497).png">

5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan
pada ppArray[i] sekaligus ppArray[0]?Jelaskan !

*Pernyataan tersebut boleh dilakukan, karena apabila terjadi sebuah duplikasi pada array yang sama, maka nilai array yang sudah terisi akan tergantikan dengan nilai array yang terbaru yaitu ppArray[0]*

### **3.4 Operasi Matematika Atribut Object Array**

### *3.4.1 Langkah-langkah Percobaan*
~~~java
package Jobsheet_3.Source_Code.Percobaan;

public class Balok {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume(){
        return panjang * lebar * tinggi;
    }
}
~~~

~~~java
package Jobsheet_3.Source_Code.Percobaan;

public class ArrayBalok {
    public static void main(String[] args){
        Balok[] blArray = new Balok[3];

        blArray[0] = new Balok (100, 30, 12);
        blArray[1] = new Balok (120, 40, 15);
        blArray[2] = new Balok (210, 50, 25);

        for(int i = 0; i < 3; i++){
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }
    }
}
~~~

### *3.4.2 Verifikasi Hasil Percobaan*

<img src = "Screenshot (487).png">

### *3.4.3 Pertanyaan*
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!

*Konstruktor hanya dapat berjumlah 1 dalam satu class, karena setiap konstruktor harus mempunyai method yang sama dengan class yang digunakan, sehingga apabila ingin membuat konstruktor lagi harus membuat class baru*

2. Jika diketahui terdapat class Segitiga seperti berikut ini:
~~~java
public class Segitiga{
    public int alas;
    public int tinggi;
}
~~~
Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.

3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga
tersebut.

4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing
atributnya sebagai berikut:
    sgArray ke-0 alas: 10, tinggi: 4

    sgArray ke-1 alas: 20, tinggi: 10

    sgArray ke-2 alas: 15, tinggi: 6

    sgArray ke-3 alas: 25, tinggi: 10

5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method
hitungLuas() dan hitungKeliling().

*Jawaban No. 2- 5*
~~~java
package Jobsheet_3.Source_Code.Percobaan;

public class segitiga {
    public int alas;
    public int tinggi;
    
    public segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
    
    public int hitungLuas(){
        return alas * tinggi / 2;
    }

    public int hitungKeliling(){
        return alas + alas + alas;
    }
}
~~~

~~~java
package Jobsheet_3.Source_Code.Percobaan;

public class segitigaMain {
    public static void main(String[] args){
        segitiga[] sgArray = new segitiga[4];

        sgArray[0] = new segitiga(10, 4);
        sgArray[1] = new segitiga(20, 10);
        sgArray[2] = new segitiga(15, 6);
        sgArray[3] = new segitiga(25, 10);

        for(int i = 0; i < 4; i++){
            System.out.println("Luas Segitiga ke-" + i + ": " + sgArray[i].hitungLuas());
        }

        for(int i = 0; i< 4; i++){
            System.out.println("Keliling Segitiga ke-" + i + ": " + sgArray[i].hitungKeliling());
        }
    }
}
~~~

*Output*

<img src = "Screenshot (494).png">

### **3.5 Latihan Praktikum**
**Nomor 1**

*CLASS*

*Balok*
~~~java
package Jobsheet_3.Source_Code.Tugas;

public class balok {
    public int panjang, lebar, tinggi;

    public balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t; 
    }

    public int volume(){
        return panjang * lebar * tinggi;
    }

    public int luasPermukaan(){
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
}
~~~

*Prisma*
~~~java
package Jobsheet_3.Source_Code.Tugas;

public class prisma {
    public int alas, tinggiSegitiga, tinggiPrisma;

    public prisma(int a, int ti, int tp){
        alas = a;
        tinggiSegitiga = ti;
        tinggiPrisma = tp;
    }

    public int volume(){
        return ((alas * tinggiSegitiga) / 2) * tinggiPrisma;
    }

    public int luasPermukaan(){
        return (alas * tinggiSegitiga) + ((3 * alas) * tinggiPrisma);
    }   
}
~~~

*Tabung*
~~~java
package Jobsheet_3.Source_Code.Tugas;

public class tabung {
    public int jari, tinggiTabung;
    
    public tabung(int r, int tt) {
        jari = r;
        tinggiTabung = tt;
    }

    public double volume(){
        return 3.14 * jari * jari * tinggiTabung;
    }

    public double luasPermukaan(){
        return 2 * (3.14 * jari * tinggiTabung) + 2 * (3.14 * jari * jari);
    }
}
~~~

*MAIN*

~~~java
package Jobsheet_3.Source_Code.Tugas;

import java.util.Scanner;

public class bangunRuang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan banyak Balok: ");
        int b = sc.nextInt();
        int p, l, t;
        balok[] bArray = new balok[b];
        System.out.println("------------------------");
        for(int i = 0; i < bArray.length; i++){
            System.out.print("Masukkan panjang " + (i + 1) + ": ");
            p = sc.nextInt();
            System.out.print("Masukkan lebar " + (i + 1) + "  : ");
            l = sc.nextInt();
            System.out.print("Masukkan tinggi " + (i + 1) + " : ");
            t = sc.nextInt();
            System.out.println();
            bArray[i] = new balok(p, l, t);
        }
        for(int i = 0; i < bArray.length; i++){
            System.out.println();
            System.out.println("Balok ke-" + (i + 1));
            System.out.println("===========");
            System.out.println("Panjang: " + bArray[i].panjang);
            System.out.println("Lebar: " + bArray[i].lebar);
            System.out.println("Tinggi: " + bArray[i].tinggi);
            System.out.println("Volume Balok ke-" + (i + 1) + ": " + bArray[i].volume());
            System.out.println("Luas Permukaan Balok ke-" + (i + 1) + ": " + bArray[i].luasPermukaan());
        }

        System.out.println();
        System.out.print("Masukkan banyak Prisma: ");
        int pr = sc.nextInt();
        int a, ti, tp;
        prisma[] prArray = new prisma[pr];
        System.out.println("--------------------------");
        for(int i = 0; i < prArray.length; i++){
            System.out.print("Masukkan alas " + (i + 1) + ": ");
            a = sc.nextInt();
            System.out.print("Masukkan tinggi " + (i + 1) + ": ");
            ti = sc.nextInt();
            System.out.print("Masukkan tinggi prisma " + (i + 1) + ": ");
            tp = sc.nextInt();
            prArray[i] = new prisma(a, ti, tp);
        }
        for(int i = 0; i < prArray.length; i++){
            System.out.println();
            System.out.println("Prisma ke-" + (i + 1));
            System.out.println("============");
            System.out.println("Alas : " + prArray[i].alas);
            System.out.println("Tinggi : " + prArray[i].tinggiSegitiga);
            System.out.println("Tinggi Prisma : " + prArray[i].tinggiPrisma);
            System.out.println("Volume ke-" + (i + 1) + ": " + prArray[i].volume());
            System.out.println("Luas Permukaan ke-" + (i + 1) + ": " + prArray[i].luasPermukaan());
        }

        System.out.println();
        System.out.print("Masukkan banyak Tabung: ");
        int tb = sc.nextInt();
        int r, tt;
        tabung[] tbArray = new tabung[tb];
        System.out.println("--------------------------");
        for(int i = 0; i < prArray.length; i++){
            System.out.print("Masukkan jari-jari " + (i + 1) + ": ");
            r = sc.nextInt();
            System.out.print("Masukkan tinggi " + (i +1) + ": ");
            tt = sc.nextInt();
            tbArray[i] = new tabung(r, tt);
        }
        for(int i = 0; i < prArray.length; i++){
            System.out.println();
            System.out.println("Tabung ke-" + (i + 1));
            System.out.println("============");
            System.out.println("Jari-jari : " + tbArray[i].jari);
            System.out.println("Tinggi : " + tbArray[i].tinggiTabung);
            System.out.println("Volume ke-" + (i + 1) + ": " + tbArray[i].volume());
            System.out.println("Luas Permukaan ke-" + (i + 1) + ": " + tbArray[i].luasPermukaan());
        }
    }
}
~~~
*Output*

<img src = "Screenshot (490).png">
<img src = "Screenshot (491).png">
<img src = "Screenshot (493).png">

**Nomor 2**

*CLASS*
~~~java
package Jobsheet_3.Source_Code.Tugas;

public class tanah {
    public int panjang, lebar;

    public int luasTanah() {
        return panjang * lebar;
    }

    public int tanahTerluas(int luas[]) {
        int terluas = 0;
        int y = 0;
        for (int i = 0; i < luas.length; i++)
            if (luas[i] > terluas) {
                terluas = luas[i];
                y = i;
            }
        return y;
    }
}
~~~

*MAIN*
~~~java
package Jobsheet_3.Source_Code.Tugas;

import java.util.Scanner;

public class mainTanah {
    private static int i;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah tanah : ");
        int n = sc.nextInt();
        tanah[] tnArray = new tanah[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            tnArray[i] = new tanah();
            System.out.println("Tanah " + (i + 1));
            System.out.print("Panjang : ");
            tnArray[i].panjang = sc.nextInt();
            System.out.print("Lebar : ");
            tnArray[i].lebar = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Luas Tanah " + (i + 1) + ": " + tnArray[i].luasTanah());
        }
        System.out.println();
        int y = 0;
        int luas[] = new int[n];
        for (int i = 0; i < n; i++) {
            luas[i] = tnArray[i].luasTanah();
        }
        y = tnArray[0].tanahTerluas(luas);
        System.out.println("Tanah terluas : Tanah " + (y + 1));
    }
}
~~~

*Output*

<img src = "Screenshot (488).png">

**Nomor 3**

*CLASS*
~~~java
package Jobsheet_3.Source_Code.Tugas;

public class mahasiswa {
    public String nama;
    public int nim;
    public char jenisKelamin;
    public double ipk;
}
~~~

*MAIN*
~~~java
package Jobsheet_3.Source_Code.Tugas;

import java.util.Scanner;

public class mainMahasiswa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        mahasiswa[] mhs = new mahasiswa[10];

        for(int i = 0; i < 3; i++){
            System.out.println("Masukkan data Mahasiswa ke-" + (i+1));
            mhs[i] = new mahasiswa();
            System.out.print("Masukkan Nama         : ");
            mhs[i].nama = input.next();
            System.out.print("Masukkan NIM          : ");
            mhs[i].nim = input.nextInt();
            System.out.print("Masukkan Jenis Kelamin: ");
            mhs[i].jenisKelamin = input.next().charAt(0);
            System.out.print("Masukkan IPK          : ");
            mhs[i].ipk = input.nextDouble();
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < 3; i++){
            System.out.println("Data Mahasiswa ke-" + (i+1));
            System.out.println("Nama         : " + mhs[i].nama);
            System.out.println("NIM          : " + mhs[i].nim);
            System.out.println("Jenis Kelamin: " + mhs[i].jenisKelamin);
            System.out.println("IPK          : " + mhs[i].ipk);
        }
    }
}
~~~

*Output*

<img src = "Screenshot (489).png">