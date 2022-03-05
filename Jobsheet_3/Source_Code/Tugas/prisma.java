package Jobsheet_3.Source_Code.Tugas;

public class prisma {
    public int alas, tinggiSegitiga, tinggiPrisma;

    public prisma(int a, int ti, int tp){
        alas = a;
        tinggiSegitiga = ti;
        tinggiPrisma = tp;
    }

    public int volume(){
        return ((alas * tinggiSegitiga) / 2) * tinggiPrisma;
    }

    public int luasPermukaan(){
        return (alas * tinggiSegitiga) + ((3 * alas) * tinggiPrisma);
    }   
}
