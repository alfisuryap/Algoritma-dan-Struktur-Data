package Jobsheet_8.Source_Code.Tugas.Nomor2;

public class QueueTugas2 {
    int max, size, front, rear;
    Mahasiswa[] antrian;
    
    public QueueTugas2(int n){
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