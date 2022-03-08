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

        System.out.println();
        System.out.print("Masukkan banyak Prisma: ");
        int pr = sc.nextInt();
        int a, ti, tp;
        prisma[] prArray = new prisma[pr];
        System.out.println("--------------------------");
        for(int i = 0; i < prArray.length; i++){
            System.out.print("Masukkan alas " + (i + 1) + ": ");
            a = sc.nextInt();
            System.out.print("Masukkan tinggi " + (i + 1) + ": ");
            ti = sc.nextInt();
            System.out.print("Masukkan tinggi prisma " + (i + 1) + ": ");
            tp = sc.nextInt();
            System.out.println();
            prArray[i] = new prisma(a, ti, tp);
        }
        for(int i = 0; i < prArray.length; i++){
            System.out.println();
            System.out.println("Prisma ke-" + (i + 1));
            System.out.println("============");
            System.out.println("Alas : " + prArray[i].alas);
            System.out.println("Tinggi : " + prArray[i].tinggiSegitiga);
            System.out.println("Tinggi Prisma : " + prArray[i].tinggiPrisma);
            System.out.println("Volume ke-" + (i + 1) + ": " + prArray[i].volume());
            System.out.println("Luas Permukaan ke-" + (i + 1) + ": " + prArray[i].luasPermukaan());
        }

        System.out.println();
        System.out.print("Masukkan banyak Tabung: ");
        int tb = sc.nextInt();
        int r, tt;
        tabung[] tbArray = new tabung[tb];
        System.out.println("--------------------------");
        for(int i = 0; i < prArray.length; i++){
            System.out.print("Masukkan jari-jari " + (i + 1) + ": ");
            r = sc.nextInt();
            System.out.print("Masukkan tinggi " + (i +1) + ": ");
            tt = sc.nextInt();
            System.out.println();
            tbArray[i] = new tabung(r, tt);
        }
        for(int i = 0; i < prArray.length; i++){
            System.out.println();
            System.out.println("Tabung ke-" + (i + 1));
            System.out.println("============");
            System.out.println("Jari-jari : " + tbArray[i].jari);
            System.out.println("Tinggi : " + tbArray[i].tinggiTabung);
            System.out.println("Volume ke-" + (i + 1) + ": " + tbArray[i].volume());
            System.out.println("Luas Permukaan ke-" + (i + 1) + ": " + tbArray[i].luasPermukaan());
        }

    }
}
