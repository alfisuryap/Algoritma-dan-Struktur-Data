Nama    : Alfi Surya Pratama

Kelas   : TI-1F

NIM     : 2141720075

# **PRAKTIKUM ALGORITMA DAN STRUKTUR DATA**
## **JOBSHEET 7**
## **STACK**

### **7.2 Praktikum 1**

### *7.2.1 Langkah-langkah Percobaan*

*Class "Pakaian"*

~~~java
package Jobsheet_7.Source_Code.Percobaan;

public class Pakaian {
    String jenis, warna, merk, ukuran;
    double harga;

    Pakaian (String jenis, String warna, String merk, String ukuran, double harga){
        this.jenis = jenis;
        this.warna = warna;
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }
}
~~~

*Class "Stack"*

~~~java
package Jobsheet_7.Source_Code.Percobaan;

public class Stack {
    int size;
    int top;
    Pakaian data[];

    public Stack(int size){
        this.size = size;
        data = new Pakaian[size];
        top = -1;
    }

    public boolean IsEmpty(){
        if (top == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull(){
        if (top == size -1){
            return true;
        }else{
            return false;
        }
    }

    public void push(Pakaian pkn){
        if (!IsFull()){
            top++;
            data[top] = pkn;
        }else{
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop(){
        if (!IsEmpty()){
            Pakaian x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        }else{
            System.out.println("Stack masih kosong");
        }
    }

    public void peek(){
        System.out.println("Elemen teratas: " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    }

    public void print(){
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--){
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga + " ");
        }
        System.out.println("");
    }

    public void clear(){
        if (!IsEmpty()){
            for (int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Stack masih kosong");
        }
    }
}
~~~

*Main Class "StackMain"*

~~~java
package Jobsheet_7.Source_Code.Percobaan;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args){
        Stack stk = new Stack(5);
        Scanner sc = new Scanner(System.in);
       
        char pilih;
        do {
            System.out.print("Jenis: ");
            String jenis = sc.nextLine();
            System.out.print("Warna: ");
            String warna = sc.nextLine();
            System.out.print("Merk: ");
            String merk = sc.nextLine();
            System.out.print("Ukuran: ");
            String ukuran = sc.nextLine();
            System.out.print("Harga: ");
            double harga = sc.nextDouble();

            Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);
        }while (pilih == 'y');

        stk.print();
        stk.pop();
        stk.peek();
        stk.print();
    }
}
~~~

### *7.2.2 Verifikasi Hasil Percobaan*

### *7.2.3 Pertanyaan*

### **7.3 Praktikum 2**

### *7.3.1 Langkah-langkah Percobaan*

### *7.3.2 Verifikasi Hasil Percobaan*

### *7.3.3 Pertanyaan*

### **7.4 Tugas**