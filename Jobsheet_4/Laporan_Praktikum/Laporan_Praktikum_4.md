Nama    : Alfi Surya Pratama

Kelas   : TI-1F

NIM     : 2141720075

# **PRAKTIKUM ALGORITMA DAN STRUKTUR DATA**
## **JOBSHEET 4**
## **BRUTE FORCE AND DIVIDE CONQUER**

### **4.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer**

### *4.2.1 Langkah-langkah Percobaan*
~~~java
package Jobsheet_4.Source_Code.Percobaan;

public class Faktorial {
    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }

    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;  
        }
        else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
    
}
~~~

~~~java
package Jobsheet_4.Source_Code.Percobaan;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial [] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("========================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Fakrotial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("========================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("========================================");
    }
    
}
~~~

### *4.2.2 Verifikasi Percobaan*

<img src = "Screenshot (516).png">

### *4.2.3 Pertanyaan*

1. Jelaskan mengenai base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial!

*if(n==1) return 1; jika nilai yang akan dimasukkan nantinya adalah 1 maka hasil yang akan ditampilkan oleh program main nantinya adalah 1 dan berfungsi sebagai batas dari Divide Conquer dimana perulangan kali akan berakhir saat n sudah sama dengan 1*

2. Pada implementasi Algoritma Divide and Conquer Faktorial apakah lengkap terdiri dari 3 tahapan
divide, conquer, combine? Jelaskan masing-masing bagiannya pada kode program!

*Divide : membagi masalah menjadi beberapa masalah yang memiliki kemiripan dengan nmasalah semua namum berukuran lebih kecil.*

*Conquer : menyelesaikan masing-masing masalah secara rekursif.*

*Combine : menggabungkan solusi masing-masing masalah sehingga membentuk solusi masalah semula.*

3. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan
for?Buktikan!

*Bisa, selama termasuk looping maka jenis looping apapun bisa digunakan pada method faktorialBF() dan saya sudah mencoba membuktikannya dengan looping jenis while dan program tetap berjalan dengan baik.*

<img src = "Screenshot (520).png">

4. Tambahkan pegecekan waktu eksekusi kedua jenis method tersebut!

5. Buktikan dengan inputan elemen yang di atas 20 angka, apakah ada perbedaan waktu eksekusi?

### **4.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer**

### *4.3.1 Langkah-langkah Percobaan*
~~~java
package Jobsheet_4.Source_Code.Percobaan;

public class Pangkat {
    public int nilai, pangkat;

    public int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    public int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        }
        else {
            if (n % 2 == 1) {
                return (pangkatDC (a, n/2) * pangkatDC (a, n/2) * a);
            }else {
                return (pangkatDC (a, n/2) * pangkatDC (a, n/2));
            }
        }
    }
    
}
~~~

~~~java
package Jobsheet_4.Source_Code.Percobaan;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.println("Masukkan nilai yang akan dipangkatkan ke-" + (i + 1) + " : ");
            png[i].nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat ke-" + (i + 1) + " : ");
            png[i].pangkat = sc.nextInt();

            System.out.println("========================================================");
            System.out.println("Hasil Pangkat dengan Brute Force");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Nilai" + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }

            System.out.println("========================================================");
            System.out.println("Hasil Pangkat dengan Divide and Conquer");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Nilai" + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
        }
    }
    
}
~~~

### *4.3.2 Verifikasi Percobaan*

<img src = "Screenshot (518).png">

### *4.3.3 Pertanyaan*

1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!

*- Pada methos pangkatBF() operasi mencari hitung hasil pangkat dilakukan dengan cara Brute Force yang dilakukan dengan iterative/perulangan/looping dan algoritma Brute Forcenya adalah mendeklarasikan dahulu hasil = 1 lalu melakukan perulangan dengan batas n (pangkatnya) dan dalam perulangan tersebut dilakukan looping dari hasil tadi dikali dengan a (bilangan yang akan dipangkat) dan perulangan akan terus berlanjut hingga < n sehingga a akan menghasilkan nilai hasil dari pemangkatannya.*

*- Pada method pangkatDC() operasi mencari hitung hasil pangkat dilakukan dengan cara Divide Conquer yang dilakukan dengan rekursif dan algoritma Divide Conquer yang dilakukan terbagi dalam 3 tahap yaitu : Divide => memecah masalah yang diimplementasikan dalam pemilihan kondisi berupa if-else pada method; Conquer => penyelesaian dari setiap masalah yang tercantum pada else; Combine => menggabungkan kembali menjadi sebuah solusi yang diimplementasika pada return-an di else.*

2. Pada method PangkatDC() terdapat potongan program sebagai berikut:
Jelaskan arti potongan kode tersebut
~~~java
if(n % 2 == 1)//bilangan ganjil
    return (pangkatDC(a,n/2) * pangkatDC(a,n/2) * a);
else//bilangan genap
    return (pangkatDC(a,n/2) * pangkatDC(a,n/2));
~~~

*- Jika n (pangkat bilangan) dimodulus 2 hasilnya adalah 1 maka returnya (kembalian nilai) adalah hasil dari (pangkatDC(a,n/2) * pangkatDC(a,n/2) * a) karena bilangan pangkatnya adalah ganjil*

*- Jika n (pangkat bilangan) dimodulus 2 hasilnya dalah tidak sama dengan 1 maka returnnya (kembalian nilai) adalah hasil dai (pangkatDC(a,n/2) * pangkatDC(a,n/2) karena bilangan pangkatnya adalah genap*

3. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!

*Sudah, tahap combine dalam kode tersebut ditunjukkan pada sintaks return atau pengembalian nilai dimana hasil dari conquer atau penyelesaian masalah sebelumnya direturn-kan semua dan dalam tahap combine dilakukan pemanggilan hasil dari bilangan berpangkat tersebut.*

4. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan
konstruktor.

5. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan!


### **4.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer**

### *4.4.1 Langkah-langkah Percobaan*
~~~java
package Jobsheet_4.Source_Code.Percobaan;

public class Sum {
    public int elemen;
    public double keuntungan[];
    public double total;

    Sum (int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (1 + r)/2;
            double lsum = totalDC(arr, l, mid - l);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum + arr[mid];
        }

        return 0;
    }
    
}
~~~

~~~java
package Jobsheet_4.Source_Code.Percobaan;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================================================");
        System.out.println("Program Menghitung Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukan jumlah bulan : ");
        int elm = sc.nextInt();

        Sum sm = new Sum(elm);
        System.out.println("=======================================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke-" + (i + 1) + " = ");
            sm.keuntungan[i] = sc.nextDouble();
        }

        System.out.println("=======================================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));

        System.out.println("=======================================================================");
        System.out.println("Algoritma Divide conquer");
        System.out.println("Total keuntungan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
    }
}
~~~

### *4.4.2 Verifikasi Percobaan*

<img src = "Screenshot (519).png">

### *4.4.3 Pertanyaan*

1. Berikan ilustrasi perbedaan perhitungan keuntungan dengan method TotalBF() ataupun TotalDC()

*pangkatBF meproses langsung inputan, sedangkan pangkatDC membagi atau memecah sebuah inputan lalu menjumlahkannya lagi di akhir proses.*

2. Perhatikan output dari kedua jenis algoritma tersebut bisa jadi memiliki hasil berbeda di belakang koma. Bagaimana membatasi output di belakang koma agar menjadi standar untuk kedua jenis algoritma tersebut.

*Membagi masalah menjadi beberapa masalah yang mempunyai kemiripan masalah namun masalah tersebut berukuran lebih kecil lalu menyelesaikan masing-masing masalah secara rekursif dan menggabungkan sebuah solusi masalah sehingg membentuk sebuah solusi masalah semula.*

3. Mengapa terdapat formulasi return value berikut?Jelaskan!
~~~java
    return lsum+rsum+arr[mid];
~~~

*Untuk mereturn-kan semua hasil dari penjumlahan keuntungan dari (lsum) lalu dengan (rsum) dan dengan (arr[mid]), sehingga dari penjumlahan ketiganya bisa ditemukan berapa banyak keuntungan yang didapat dari perusahaan tersaebut dalam rentang waktu n bulan.*

4. Kenapa dibutuhkan variable mid pada method TotalDC()?

*Karena perhitungan keuntungan pada method totalDC() tersebut membagi bagiannya menjadi left(l) dan right(r). Maka dari itu membutuhkan variable mid untuk perhitungan semua bagian tengahnya.*

5. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja. Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan dengan program!

### **4.5 Latihan Praktikum**

