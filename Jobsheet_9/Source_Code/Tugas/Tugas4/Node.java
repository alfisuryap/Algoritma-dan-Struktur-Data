public class Node {
    String nim, nama;
    int absen;
    double ipk;
    node next;
    
    public Node(String nim, String nama, int absen, double ipk, node berikutnya){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk = ipk;
        this.next = berikutnya;
    }
}