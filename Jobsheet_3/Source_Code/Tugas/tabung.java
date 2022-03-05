package Jobsheet_3.Source_Code.Tugas;

public class tabung {
    public int jari, tinggiTabung;
    
    public tabung(int r, int tt) {
        jari = r;
        tinggiTabung = tt;
    }

    public double volume(){
        return 3.14 * jari * jari * tinggiTabung;
    }

    public double luasPermukaan(){
        return 2 * (3.14 * jari * tinggiTabung) + 2 * (3.14 * jari * jari);
    }
}
