package Jobsheet_4.Source_Code.Percobaan;

import java.util.Scanner;

public class MainFaktoQuestionTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial [] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("=======================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        long start = System.currentTimeMillis();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Fakrotial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        long end = System.currentTimeMillis();

        System.out.println("=======================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah " + fk[i].faktorialDC(fk[i].nilai));
        }
        long end2 = System.currentTimeMillis();

        System.out.println(end2-start2);
        System.out.println("=======================================================");
    
    }
}
