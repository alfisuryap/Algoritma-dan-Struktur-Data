package Jobsheet_3.Source_Code.Tugas;

import java.util.Scanner;

public class bangunRuang {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan banyak Balok: ");
        int b = sc.nextInt();
        int p, l, t;
        balok[] bArray = new balok[b];
        System.out.println("------------------------");
        for(int i = 0; i < bArray.length; i++){
            System.out.print("Masukkan panjang " + (i + 1) + ": ");
            p = sc.nextInt();
            System.out.print("Masukkan lebar " + (i + 1) + "  : ");
            l = sc.nextInt();
            System.out.print("Masukkan tinggi " + (i + 1) + " : ");
            t = sc.nextInt();
            System.out.println();
            bArray[i] = new balok(p, l, t);
        }
        for(int i = 0; i < bArray.length; i++){
            System.out.println();
            System.out.println("Balok ke-" + (i + 1));
            System.out.println("===========");
            System.out.println("Panjang: " + bArray[i].panjang);
            System.out.println("Lebar: " + bArray[i].lebar);
            System.out.println("Tinggi: " + bArray[i].tinggi);
            System.out.println("Volume Balok ke-" + (i + 1) + ": " + bArray[i].volume());
            System.out.println("Luas Permukaan Balok ke-" + (i + 1) + ": " + bArray[i].luasPermukaan());
        }
    }
    
}
