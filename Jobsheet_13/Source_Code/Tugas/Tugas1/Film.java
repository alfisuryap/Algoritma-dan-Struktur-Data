public class Film {
    String id, judul, tahun, director;
    
    public Film(String id, String judul, String tahun, String director){
        this.id = id;
        this.judul = judul;
        this.tahun = tahun;
        this.director = director;
    }
    @Override
    public String toString(){
        return "Film {ID Film = "+id +", Judul Film = "+judul+", Tahun Tayang = "+tahun+", Director = "+director+"}";
    }
}