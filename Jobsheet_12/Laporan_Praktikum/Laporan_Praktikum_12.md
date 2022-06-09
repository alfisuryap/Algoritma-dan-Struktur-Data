Nama    : Alfi Surya Pratama

Kelas   : TI-1F

NIM     : 2141720075

# **PRAKTIKUM ALGORITMA DAN STRUKTUR DATA**
## **JOBSHEET 11**
## **GRAPH**

### **12.2  Implementasi Graph menggunakan Linked List**

### *11.2.1 Langkah-langkah Percobaan*

### *11.2.1 Verfikasi Hasil Percobaan*

### *11.2.1 Pertanyaan*

1. Sebutkan beberapa jenis (minimal 3) algoritma yang menggunakan dasar Graph, dan apakah kegunaan algoritma-algoritma tersebut?

2. Pada class Graph terdapat array bertipe LinkedList, yaitu LinkedList list[]. Apakah tujuan pembuatan variabel tersebut ?

3. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add jenis lain pada linked list ketika digunakan pada method addEdge pada class Graph?

4. Bagaimana cara mendeteksi prev pointer pada saat akan melakukan penghapusan suatu edge pada graph ?

5. Kenapa pada praktikum 2.1.1 langkah ke-12 untuk menghapus path yang bukan merupakan lintasan pertama kali menghasilkan output yang salah ? Bagaimana solusinya ?

    ~~~java
    graph.removeEdge(1, 2);
    graph.printGraph();
    ~~~

### **12.3  Implementasi Graph menggunakan Matriks**

### *11.3.1 Langkah-langkah Percobaan*

*Class "graphArray"*

~~~java
import java.util.Scanner;

public class graphArray {
    private final int vertices;
    private final int[][] twoD_array;

    public graphArray(int v){
        vertices = v;
        twoD_array = new int[vertices + 1][vertices + 1];
    }

    public void makeEdge(int to, int from, int edge){
        try
        {
            twoD_array[to][from] = edge;
        }
        catch (ArrayIndexOutOfBoundsException index)
        {
            System.out.println("Vertex tidak ada");
        }
    }

    public int getEdge(int to, int from){
        try
        {
            return twoD_array[to][from];
        }
        catch (ArrayIndexOutOfBoundsException index)
        {
            System.out.println("Vertex tidak ada");
        }
        return -1;
    }

    public static void main(String args[]){
        int v, e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        graphArray graph;
        try {
            System.out.println("Masukkan jumlah vertices: ");
            v = sc.nextInt();
            System.out.println("Masukkan jumlah edges: ");
            e = sc.nextInt();

            graph = new graphArray(v);

            System.out.println("Masukkan edges: <to> <from>");
            while (count <= e){
                to = sc.nextInt();
                from = sc.nextInt();

                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagai representasi graph sbb: ");
            System.out.print("  ");
            for (int i = 1; i <= v; i++){
                System.out.print(i + " ");
            }
            System.out.println();

            for (int i = 1; i <= v; i++){
                System.out.print(i + " ");
                for (int j = 1; j <= v; j++){
                    System.out.print(graph.getEdge(i, j) + " ");
                }
                System.out.println();
            }
        } catch (Exception E){
            System.out.println("Error. Silahkan cek kembali\n" + E.getMessage());
        }
        sc.close();
    }
}
~~~

### *11.3.1 Verfikasi Hasil Percobaan*

<img src = "pra2.png">

### *11.3.1 Pertanyaan*

1. Apakah perbedaan degree/derajat pada directed dan undirected graph?

2. Pada implementasi graph menggunakan adjacency matriks. Kenapa jumlah vertices harus ditambahkan dengan 1 pada indeks array berikut?

    ~~~java
    public graphArray(int v){
        vertices = v;
        twoD_array = new int[vertices + 1][vertices + 1];
    }
    ~~~

3. Apakah kegunaan method getEdge() ?

4. Termasuk jenis graph apakah uji coba pada praktikum 2.2?

5. Mengapa pada method main harus menggunakan try-catch Exception ?

### **12.4  Tugas Praktikum**

1. Ubahlah lintasan pada praktikum 2.1 menjadi inputan!

2. Tambahkan method graphType dengan tipe boolean yang akan membedakan graph termasuk directed atau undirected graph. Kemudian update seluruh method yang berelasi dengan method graphType tersebut (hanya menjalankan statement sesuai dengan jenis graph) pada praktikum 2.1

3. Modifikasi method removeEdge() pada praktikum 2.1 agar tidak menghasilkan output yang salah untuk path selain path pertama kali!

4. Ubahlah tipe data vertex pada seluruh graph pada praktikum 2.1 dan 2.2 dari Integer menjadi tipe generic agar dapat menerima semua tipe data dasar Java! Misalnya setiap vertex yang awalnya berupa angka 0,1,2,3, dst. selanjutnya ubah menjadi suatu nama daerah seperti Gresik, Bandung, Yogya, Malang, dst.