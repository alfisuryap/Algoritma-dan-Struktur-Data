package UTS;

public class Movie {
    int id;
    String judul;
    int tahun;
    float rating;

    Movie(int i, String j, int t, float r){
        id = i;
        judul = j;
        tahun = t;
        rating = r;
    }

    // tambahkan algoritma pengurutan dan pencarian yang sesuai

    void tampil(){
        
        System.out.println("ID\t: "+ id);
        System.out.println("Judul\t: "+ judul);
        System.out.println("Tahun\t: "+ tahun);
        System.out.println("Rating\t: "+ rating);
    }
}