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
~~~java
package Jobsheet_4.Source_Code.Percobaan;

import java.util.Scanner;

public class MainFaktoQuestionTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial [] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("=======================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        long start = System.currentTimeMillis();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Fakrotial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        long end = System.currentTimeMillis();

        System.out.println("=======================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
        long end2 = System.currentTimeMillis();

        System.out.println(end2-start2);
        System.out.println("=======================================================");
    
    }
}
~~~

5. Buktikan dengan inputan elemen yang di atas 20 angka, apakah ada perbedaan waktu eksekusi?

<img src = "Screenshot (524).png">

<img src = "Screenshot (525).png">

<img src = "Screenshot (526).png">

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
~~~java
package Jobsheet_4.Source_Code.Percobaan;

public class PangkatQuestion {
    public int nilai, pangkat;

    public PangkatQuestion(int n, int p){ //konstruktor
        nilai = n;
        pangkat = p;
    }
    
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

public class MainPangkatQuestion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PangkatQuestion[]png = new PangkatQuestion[5];
        png[0] = new PangkatQuestion(5, 2);
        png[1] = new PangkatQuestion(10, 2);
        png[2] = new PangkatQuestion(15, 4);
        png[3] = new PangkatQuestion(20, 2);
        png[4] = new PangkatQuestion(25, 2);

        System.out.println("=================================================");
        System.out.println("Hasil Pangkat dengan Bruce Force");
        for(int i=0; i<png.length; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        
        System.out.println("=================================================");
        System.out.println("Hasil Pangkat dengan Divide Conquer");
        for(int i=0; i<png.length; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }

        System.out.println("=================================================");
    }
}
~~~

*Output*

<img src = "Screenshot (529).png">

5. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan!
~~~java
package Jobsheet_4.Source_Code.Percobaan;

public class PangkatQuestionMenu {
    public int nilai, pangkat;

    public PangkatQuestionMenu(int n, int p){ //konstruktor
        nilai = n;
        pangkat = p;
    }
    
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

public class MainPangkatQuestionMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PangkatQuestionMenu[]png = new PangkatQuestionMenu[5];
        png[0] = new PangkatQuestionMenu(5, 2);
        png[1] = new PangkatQuestionMenu(10, 2);
        png[2] = new PangkatQuestionMenu(15, 4);
        png[3] = new PangkatQuestionMenu(20, 2);
        png[4] = new PangkatQuestionMenu(25, 2);
        
        System.out.println("===========================================");
        System.out.println("                Menu Pangkat               ");
        System.out.println("===========================================");
        System.out.println("1. Menggunakan Brute Force ");
        System.out.println("2. Menggunakan Devide Conquer ");
        System.out.println("3. Exit ");
        System.out.print("Silahkan Pilih Metode Perhitungan : ");
        int pilih = sc.nextInt();
        
        switch(pilih){
            case 1 :
                System.out.println("============================================");
                System.out.println("Hasil pangkat dengan Brute force ");     
                for(int i=0; i<png.length; i++){
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
                }
            break;
            case 2 :
                System.out.println("============================================");
                System.out.println("Hasil pangkat dengan Devide Conquer ");
                for(int i=0; i<png.length; i++){
                    System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
                }
            break;
            case 3 :
                System.out.println("------------Terima Kasih---------");
            break;
            default :
                System.out.println("------ input yang anda masukkan salah -------");
        }
    }
}
~~~

*Output*

<img src = "Screenshot (530).png">

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
~~~java
package Jobsheet_4.Source_Code.Percobaan;

public class SumQuestion {
    public int elemen;
    public double keuntungan[];
    public double total;
    
    public double totalBF(double arr[]){
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        return total;
    }
    public double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid - 1);
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

public class MainSumQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5,9)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int per = sc.nextInt();
    
        SumQuestion peru[]= new SumQuestion[per];
        for(int i=0; i<per; i++){
            peru[i] = new SumQuestion();
            System.out.println("============================================================");
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.print("Masukkan Jumlah Bulan : ");
            peru[i].elemen = sc.nextInt();
        
            peru[i].keuntungan = new double[peru[i].elemen];
        
            System.out.println("============================================================");
            for(int j=0; j<peru[i].elemen; j++){
                System.out.print("Masukkan untung bulan ke-" + (j + 1) + " = ");
                peru[i].keuntungan[j] = sc.nextDouble();
            }
        }
        System.out.println("============================================================");
        SumQuestion dat =new SumQuestion();
        for(int i=0; i<peru.length; i++){
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.println("Jumlah Bulan : " + peru[i].elemen);
            System.out.println();
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total keuntungam perusahaan selama " + peru[i].elemen + " bulan adalah : %.2f ", dat.totalBF(peru[i].keuntungan));
            System.out.println();
            System.out.println("Algoritma Divide Conquer");
            System.out.printf("Total keuntungam perusahaan selama " + peru[i].elemen + " bulan adalah : %.2f ", dat.totalDC(peru[i].keuntungan, 0, peru[i].elemen-1));
            System.out.println("\n============================================================");
        }
    }
}
~~~

*Output*

<img src = "Screenshot (531).png">

### **4.5 Latihan Praktikum**
~~~java
package Jobsheet_4.Source_Code.Tugas;

import java.util.Scanner;

public class Latihan {
    public int vote, jumlahVote=0, jumlahKandidat = 4;
    public String kandidat;
    public static int nilai=1, acc=0, acc2=0, control = 0;
    public static int[] array = new int[10000];

    public static int hitungHasil(int js, int k1, int k2, int k3, int k4) {
        if (nilai == 5) {
            return 1;
        }
        if (nilai == 1 && k1 > 0) {
            array[control] = nilai;
            control++;
            nilai++;
            return hitungHasil(js, k1 - 1, k2, k3, k4);
        } else if (nilai == 2 && k2 > 0) {
            array[control] = nilai;
            control++;
            nilai++;
            return hitungHasil(js, k1, k2 - 1, k3, k4);
        } else if (nilai == 3 && k3 > 0) {
            array[control] = nilai;
            control++;
            nilai++;
            return hitungHasil(js, k1, k2, k3 - 1, k4);
        } else if (nilai == 4 && k4 > 0) {
            array[control] = nilai;
            control++;
            nilai++;
            return hitungHasil(js, k1, k2, k3, k4 - 1);
        } else if (k1 == 0 && k2 == 0 && k3 == 0 && k4 == 0) {
            if (array[acc] == array[acc+1] && acc+1 < js) {
                return array[acc];

            } else if (acc + 2 < js) {
                acc += 2;
                return hitungHasil(js, k1, k2, k3, k4);
            } else {
                return 0;
            }
        } else {
            nilai++;
            return hitungHasil(js, k1, k2, k3, k4);
        }
    }
}
~~~

~~~java
package Jobsheet_4.Source_Code.Tugas;

import java.util.Scanner;

public class MainLatihan {
    public class LatihanMain {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("=======================================================");
            System.out.println("\t\t PEMILIHAN KETUA BEM KOTA MALANG");
            System.out.println("=======================================================");
            System.out.println("Masukkan Jumlah Kandidat BEM = ");
            Latihan pol = new Latihan();
            Latihan[] bem = new Latihan[pol.jumlahKandidat];
            
            for(int i = 0; i < pol.jumlahKandidat; i++) {
                bem[i] = new Latihan();
                System.out.println("Nama Kandidat BEM ke- " + (i+1) + ": ");
                bem[i].kandidat = sc.nextLine();
            }

            for (int i = 0; i < pol.jumlahKandidat; i++) {
                System.out.println("Jumlah Pemilih Suara Kandidat BEM ke = " + (i+1) + ": ");
                bem[i].vote = sc.nextInt();
                pol.jumlahVote += bem[i].vote;
            }

            System.out.println("=======================================================");
            int hasil_bem = pol.hitungHasil(pol.jumlahVote, bem[0].vote, bem[1].vote, bem[2].vote, bem[3].vote);
            if(hasil_bem == 0) {
                System.out.println("Kandidat memiliki mayoritas hampir sama");
            }else{
                System.out.println("Ketua BEM Kota Malang Adalah " + bem[hasil_bem-1].kandidat);
            }
        }
    }
}
~~~

*Output*

<img src = "Screenshot (522).png">