package Jobsheet_6.Source_Code.Tugass;

public class Tugas3_Array1DimensiMain {
    public static void main(String[] args){
        int bil[] = {12, 7, 2, 1, 70, 50, 90, 17, 2, 90};

        Tugas3_Array1Dimensi arr = new Tugas3_Array1Dimensi(bil);

        int jum = 10;
        int max = 0;
        System.out.println("==================================================");
        System.out.println("-----------------------DATA-----------------------");
        arr.tampil();
        System.out.println("==================================================");
        System.out.println("Setelah disorting");
        arr.tampil();
        arr.nilaiTerbesar();
        arr.Searching(max, 0, jum - 1);
        arr.tampilPosisi(max);
    }

}
