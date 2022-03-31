package Jobsheet_6.Source_Code.Tugass;

public class Tugas3_Array1Dimensi {
    public int[] data;
    public int max = 0;
    public int posisi;
    public int jumlah = 0;

    Tugas3_Array1Dimensi(int nilai[]){
        data = nilai;
    }

    void tampil(){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
            System.out.println();
        }
    }

    void bubbleSort(){
        for(int i = 0; i < data.length - 1; i++){
            for(int n = 1; n < data.length - i; n++){
                if(data[n] > data[n - 1]){
                    int temp = data[n];
                    data[n] = data[n - 1];
                    data[n - 1] = temp;
                }
            }

        }
    }

    public int Searching(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left + right) / 2;
            if(cari == data[mid]){
                return(mid);
            }else if(data[mid] > cari){
                return Searching(cari, mid + 1, right);
            }else{
                return Searching(cari, left, mid - 1);
            }
        }
        return - 1;
    }

    public int nilaiTerbesar(){
        for(int i = 0; i < data.length; i++){
            if(data[i] > max){
                max = data[i];
            }
        }
        System.out.println("Nilai terbesarnya adalah : " + max);
        return max;
    }

    public void tampilPosisi(int pos){
        for(int i = 0; i < data.length; i++){
            if(data[i] == max){
                jumlah++;
            }
        }
        System.out.print("dengan jumlah " + jumlah);
        System.out.println();
        posisi = max;
        for(int i = 0; i < data.length; i++){
            pos = i;
            System.out.println("Data ditemukan pada indeks ke-" +pos);
        }
    }
}