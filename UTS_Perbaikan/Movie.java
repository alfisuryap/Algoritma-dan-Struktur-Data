package UTS_Perbaikan;

public class Movie {
    int id;
    String judul;
    int tahun;
    float rating;

    Movie movie[];
    int idx;

    Movie(int i, String j, int t, float r){
        id = i;
        judul = j;
        tahun = t;
        rating = r;
    }

    // tambahkan algoritma pengurutan dan pencarian yang sesuai

    void tampilan(){
        
        System.out.println("ID\t: "+ id);
        System.out.println("Judul\t: "+ judul);
        System.out.println("Tahun\t: "+ tahun);
        System.out.println("Rating\t: "+ rating);
    }

    void tambah(Movie m){
        if(idx < movie.length){
            movie[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh !!");
        }
    }
    
    void tampil(){
        for(Movie m : movie){
            m.tampil();
            System.out.println("------------------------------");
        }
    }

    public int FindSeqSearch(int cari){
        int posisi = -1;
        for(int j = 0; j < movie.length; j++){
            if(movie[j].tahun == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void insertionSort(){
        for(int i = 1; i < movie.length; i++){
            Movie temp = movie[i];
            int j = i;
            while(j > 0 && movie[j - 1].tahun > temp.tahun){
                movie[j] = movie[j - 1];
                j--;
            }
            movie[j] = temp;
        }
    }

    public void tampilPosisi(int x, int  pos){
        if(pos != -1){
            System.out.println("data\t : " + x + " ditemukan pada indeks " + pos);
        }else{
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos){
        if(pos != -1){
            System.out.println("ID\t : " + movie[pos].id);
            System.out.println("Judul\t : " + movie[pos].judul);
            System.out.println("Tahun\t : " + x);
            System.out.println("Rating\t : " + movie[pos].rating);
        }else{
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
}
