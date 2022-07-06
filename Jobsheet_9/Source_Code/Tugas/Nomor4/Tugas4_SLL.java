class Node {
    String nim, nama;
    int absen;
    double ipk;
    Node next;

    public Node(String nim, String nama, int absen, double ipk, Node berikutnya){
        this.nim = nim;
        this.nama = nama;
        this.absen = absen;
        this.ipk =ipk;
        this.next = berikutnya;
    }
}

public class Tugas4_SLL {
    Node head; //posisi awal linked list
    Node tail; //posisi akhir linked list

    public boolean isEmpty() {
        return head == null;
    }

    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            int antrian = 0;
            while(tmp != null){
                System.out.println("Mahasiswa ke - "+(antrian+1));
                System.out.println("NIM Mahasiswa   : " + tmp.nim);
                System.out.println("Nama Mahasiswa  : " + tmp.nama);
                System.out.println("Absen Mahasiswa : " + tmp.absen);
                System.out.println("IPK Mahasiswa   : " + tmp.ipk);
                tmp = tmp.next;
                antrian ++;
            }
            System.out.println();
        }else{
            System.out.println("Linked List Kosong");
        }
    }
    public void addLast(String nim, String nama, int absen, double ipk){
        Node ndInput = new Node(nim, nama, absen, ipk, null);
        if(isEmpty()){
            head = ndInput; //head dan tail sama dengan node input
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void peek(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.println("Elemen terdepan");
            System.out.println("NIM Mahasiswa   : " + tmp.nim);
            System.out.println("Nama Mahasiswa  : " + tmp.nama);
            System.out.println("Absen Mahasiswa : " + tmp.absen);
            System.out.println("IPK Mahasiswa   : " + tmp.ipk);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void peekRear(){
        if(!isEmpty()){
            Node tmp = tail;
            System.out.println("Elemen yang belakang");
            System.out.println("NIM Mahasiswa   : " + tmp.nim);
            System.out.println("Nama Mahasiswa  : " + tmp.nama);
            System.out.println("Absen Mahasiswa : " + tmp.absen);
            System.out.println("IPK Mahasiswa   : " + tmp.ipk);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void cariIndex(int index){
        if(isEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            Node tmp = head;
            for(int i=0; i<index; i++){
                tmp = tmp.next;
            }
            System.out.println("Data pada index ke-"+index);
            System.out.println("NIM Mahasiswa   : " + tmp.nim);
            System.out.println("Nama Mahasiswa  : " + tmp.nama);
            System.out.println("Absen Mahasiswa : " + tmp.absen);
            System.out.println("IPK Mahasiswa   : " + tmp.ipk);
        }
    }
    public void cariNim(String key){
        Node tmp = head;
        int index = 0;
        while (tmp != null &&(!(tmp.nim.equals(key)))) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null){
            System.out.println("Antrian Kosong");
        }else{
            System.out.println("Data "+key+" berada pada index ke "+index);
        }
        System.out.println("Data Mahasiswa");
        System.out.println("NIM Mahasiswa   : " + tmp.nim);
        System.out.println("Nama Mahasiswa  : " + tmp.nama);
        System.out.println("Absen Mahasiswa : " + tmp.absen);
        System.out.println("IPK Mahasiswa   : " + tmp.ipk);
    }
    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List Masih Kosong");
        }else if (head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }
}